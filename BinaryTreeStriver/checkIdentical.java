uhjfpublic class checkIdentical {
    // The 'isIdentical' function checks if two given binary trees are identical or
    // not.
    // Two binary trees are considered identical if their node values are the same
    // and their
    // left-right and right-left traversals are identical, respectively.

    public static boolean isIdentical(Node node1, Node node2) {
        // If both nodes are null, the trees are identical
        if (node1 == null && node2 == null) {
            return true;
        }
        // If one node is null and the other is not, the trees are not identical
        else if (node1 == null || node2 == null) {
            return false;
        }
        // If the node values are equal and the left-right and right-left traversals are
        // identical,
        // the trees are identical. Otherwise, they are not identical.
        else {
            return ((node1.val == node2.val) && isIdentical(node1.left, node2.right)
                    && isIdentical(node1.right, node2.left));
        }
    }

    // Node class for creating a binary tree with an integer value, and left and
    // right child nodes.
    static class Node {
        int val;
        Node left;
        Node right;

        public Node(int data) {
            val = data;
            left = right = null;
        }
    }
}
