"""
Program: Linked List Cycle Detection (Floyd's Tortoise and Hare Algorithm)
Problem:
  Given the head of a singly linked list, determine if the list contains a cycle.

Approach:
  Use two pointers moving at different speeds. If they meet, a cycle exists.

Example Input:
  # 1 -> 2 -> 3 -> 4 -> 2 (cycle back to node with value 2)

Example Output:
  Cycle detected: True

Time Complexity: O(n)
Space Complexity: O(1)
"""

class ListNode:
    def __init__(self, val=0):
        self.val = val
        self.next = None

def has_cycle(head):
    slow = fast = head
    while fast and fast.next:
        slow = slow.next
        fast = fast.next.next
        if slow == fast:
            return True
    return False

# --- Example Usage ---

if __name__ == "__main__":
    # Create linked list: 1 -> 2 -> 3 -> 4 -> 2 (cycle)
    head = ListNode(1)
    head.next = ListNode(2)
    head.next.next = ListNode(3)
    head.next.next.next = ListNode(4)
    head.next.next.next.next = head.next  # Creates cycle

    print("Cycle detected:", has_cycle(head))  # Output: True

    # Create linked list: 1 -> 2 -> 3 -> 4 (no cycle)
    head2 = ListNode(1)
    head2.next = ListNode(2)
    head2.next.next = ListNode(3)
    head2.next.next.next = ListNode(4)

    print("Cycle detected:", has_cycle(head2))  # Output: False
