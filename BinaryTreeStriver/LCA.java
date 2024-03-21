jghpublic class LCA {
    public static void main(String[] args) {

    }
}

class Solution {
    Node lca(Node root, int n1, int n2) {
        if (root == null || root.val == n1 || root.val == n2) {
            return root;
        }
        Node left = lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);
        if (left != null && right != null) {
            return root;
        }
        return left == null ? right : left;
    }
}

class Node {
    Node left;
    Node right;
    int val;

    public Node(int data) {
        this.val = data;
        left = null;
        right = null;
    }
}
