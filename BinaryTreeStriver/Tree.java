
public class Tree {
    Node root;

    public Tree() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        System.out.println(root);
    }
}

class Node {
    int data;
    Node left;
    Node right;

    public Node(int key) {
        data = key;
    }
}
