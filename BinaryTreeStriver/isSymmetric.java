public class isSymmetric {
    static boolean isSymmetricUtil(Node root1, Node root2) {
        if (root1 == null || root2 == null)
            return root1 == root2;
        return (root1.data == root2.data) && isSymmetricUtil(root1.left, root2.right)
                && isSymmetricUtil(root1.right, root2.left);
    }

    static boolean issymmetric(Node root) {
        if (root == null)
            return true;
        return isSymmetricUtil(root.left, root.right);
    }

    public static void main(String args[]) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right = new Node(2);
        root.right.left = new Node(4);
        root.right.right = new Node(3);

        boolean res;
        res = issymmetric(root);

        if (res)
            System.out.println("The tree is symmetrical");
        else
            System.out.println("The tree is NOT symmetrical");

    }
}

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}