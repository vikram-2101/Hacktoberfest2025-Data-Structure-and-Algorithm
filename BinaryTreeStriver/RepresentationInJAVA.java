public class RepresentationInJAVA {
    public static void main(String[] args) {
        Node root = new Node(1);
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node() {
    }

    Node(int val) {
        this.data = val;
    }
}