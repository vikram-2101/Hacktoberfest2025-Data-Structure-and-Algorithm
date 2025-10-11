import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class childrenSumProperty {
    static void reorder(Node root) {
        if (root == null)
            return;
        int child = 0;
        if (root.left != null) {
            child += root.left.data;
        }
        if (root.right != null) {
            child += root.right.data;
        }

        if (child < root.data) {
            if (root.left != null)
                root.left.data = root.data;
            else if (root.right != null)
                root.right.data = root.data;
        }

        reorder(root.left);
        reorder(root.right);

        int tot = 0;
        if (root.left != null)
            tot += root.left.data;
        if (root.right != null)
            tot += root.right.data;
        if (root.left != null || root.right != null)
            root.data = tot;
    }

    static void changeTree(Node root) {
        reorder(root);
    }

    public static void main(String args[]) {

        Node root = new Node(2);
        root.left = new Node(35);
        root.left.left = new Node(2);
        root.left.right = new Node(3);
        root.right = new Node(10);
        root.right.left = new Node(5);
        root.right.right = new Node(2);

        changeTree(root);

    }
}
