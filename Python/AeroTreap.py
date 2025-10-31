import random
from typing import Optional, Tuple, List

#!/usr/bin/env python3
"""
AeroTreap - A compact randomized balanced BST (Treap) with multiset support.
Features:
- Insert, erase (decrement count), contains
- kth smallest, rank (count <= x)
- Inorder/list view, size
Expected O(log n) per operation (randomized).
"""

random.seed()  # system time

class _Node:
    __slots__ = ("key", "prio", "left", "right", "cnt", "size")
    def __init__(self, key):
        self.key = key
        self.prio = random.randrange(1 << 30)
        self.left: Optional[_Node] = None
        self.right: Optional[_Node] = None
        self.cnt = 1       # count of equal keys (multiset)
        self.size = 1      # size = cnt + sizes of children

def _update(node: Optional[_Node]) -> None:
    if node:
        node.size = node.cnt + (node.left.size if node.left else 0) + (node.right.size if node.right else 0)

def _merge(left: Optional[_Node], right: Optional[_Node]) -> Optional[_Node]:
    if not left or not right:
        return left or right
    if left.prio > right.prio:
        left.right = _merge(left.right, right)
        _update(left)
        return left
    else:
        right.left = _merge(left, right.left)
        _update(right)
        return right

class AeroTreap:
    def __init__(self):
        self.root: Optional[_Node] = None

    # Recursive insert with priority-based rotations
    def insert(self, key):
        def _insert(node: Optional[_Node], key) -> _Node:
            if node is None:
                return _Node(key)
            if key == node.key:
                node.cnt += 1
            elif key < node.key:
                node.left = _insert(node.left, key)
                if node.left.prio > node.prio:
                    # rotate right
                    L = node.left
                    node.left = L.right
                    L.right = node
                    _update(node)
                    _update(L)
                    return L
            else:
                node.right = _insert(node.right, key)
                if node.right.prio > node.prio:
                    # rotate left
                    R = node.right
                    node.right = R.left
                    R.left = node
                    _update(node)
                    _update(R)
                    return R
            _update(node)
            return node
        self.root = _insert(self.root, key)

    # Erase one occurrence of key
    def erase(self, key):
        def _erase(node: Optional[_Node], key) -> Optional[_Node]:
            if node is None:
                return None
            if key == node.key:
                if node.cnt > 1:
                    node.cnt -= 1
                    _update(node)
                    return node
                return _merge(node.left, node.right)
            elif key < node.key:
                node.left = _erase(node.left, key)
                _update(node)
                return node
            else:
                node.right = _erase(node.right, key)
                _update(node)
                return node
        self.root = _erase(self.root, key)

    # Check if key exists
    def contains(self, key) -> bool:
        node = self.root
        while node:
            if key == node.key:
                return True
            node = node.left if key < node.key else node.right
        return False

    # kth smallest (1-based). Raises IndexError if k out of range.
    def kth(self, k: int):
        if not self.root or k <= 0 or k > self.root.size:
            raise IndexError("k out of range")
        node = self.root
        while node:
            left_size = node.left.size if node.left else 0
            if k <= left_size:
                node = node.left
            elif k <= left_size + node.cnt:
                return node.key
            else:
                k -= left_size + node.cnt
                node = node.right
        raise IndexError("k out of range")

    # Count of elements <= key
    def count_le(self, key) -> int:
        def _count(node: Optional[_Node], key) -> int:
            if node is None:
                return 0
            if node.key <= key:
                left_size = node.left.size if node.left else 0
                return left_size + node.cnt + _count(node.right, key)
            else:
                return _count(node.left, key)
        return _count(self.root, key)

    # Total size (number of elements, counting duplicates)
    def __len__(self) -> int:
        return self.root.size if self.root else 0

    # Inorder traversal as a sorted list (expensive, O(n))
    def to_list(self) -> List:
        res: List = []
        def _in(node):
            if not node: return
            _in(node.left)
            res.extend([node.key] * node.cnt)
            _in(node.right)
        _in(self.root)
        return res

if __name__ == "__main__":
    # Simple demonstration
    t = AeroTreap()
    arr = [5, 3, 8, 3, 10, 1]
    for x in arr:
        t.insert(x)
    print("Sorted:", t.to_list())         # [1,3,3,5,8,10]
    print("Size:", len(t))                # 6
    print("Contains 5?", t.contains(5))   # True
    print("2nd smallest:", t.kth(2))      # 3
    print("Count <= 4:", t.count_le(4))   # 3 (1,3,3)
    t.erase(3)
    print("After erasing one 3:", t.to_list())  # [1,3,5,8,10]