import java.util.*;

public class TreeBoundary {
    public static boolean isLeaf(Node root) {
        if (root.left == null && root.right == null) {
            return true;
        } else {
            return false;
        }
    }

    static void leftBoundry(Node root, ArrayList<Integer> list) {
        Node temp = root.left;
        while (temp != null) {
            if (!isLeaf(temp) == false)
                list.add(root.data);
        }
        if (temp.left != null) {
            temp = temp.left;
        } else {
            temp = temp.right;
        }
    }

    static void rightBoundry(Node root, ArrayList<Integer> list) {
        ArrayList<Integer> res = new ArrayList<>();
        Node temp = root.right;
        while (temp != null) {
            if (!isLeaf(temp) == false)
                res.add(root.data);
        }
        if (temp.right != null) {
            temp = temp.right;
        } else {
            temp = temp.left;
        }
        for (int i = res.size() - 1; i >= 0; i--) {
            list.add(res.get(i));
        }
    }

    static void addLeaves(Node root, ArrayList<Integer> res) {
        if (isLeaf(root)) {
            res.add(root.data);
            return;
        }
        if (root.left != null)
            addLeaves(root.left, res);
        if (root.right != null)
            addLeaves(root.right, res);
    }

    static ArrayList<Integer> display(Node node) {
        ArrayList<Integer> res = new ArrayList<>();
        if (isLeaf(node) == false)
            res.add(node.data);
        leftBoundry(node, res);
        addLeaves(node, res);
        rightBoundry(node, res);
        return res;
    }

    public static void main(String args[]) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.left.right = new Node(4);
        root.left.left.right.left = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(7);
        root.right.right = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.left.left = new Node(10);
        root.right.right.left.right = new Node(11);

        ArrayList<Integer> boundaryTraversal;
        boundaryTraversal = display(root);

        System.out.println("The Boundary Traversal is : ");
        for (int i = 0; i < boundaryTraversal.size(); i++) {
            System.out.print(boundaryTraversal.get(i) + " ");
        }

    }
}

class Node {
    int data;
    Node left;
    Node right;

    public Node(int key) {
        data = key;
        left = null;
        right = null;
    }
}