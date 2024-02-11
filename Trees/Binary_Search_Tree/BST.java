jsggpackage Trees.Binary_Search_Tree;

class BST {
   public class Node {
      private int value;
      private int height;
      private Node left;
      private Node right;

      public Node(int value) {
         this.value = value;
      }

      public int getValue() {
         return value;
      }
   }

   private Node root;

   public BST() {

   }

   public int height(Node node) {
      if (node == null) {
         return -1;
      }
      return node.height;
   }

   public boolean isEmpty() {
      return root == null;
   }

   public void display() {
      display(root, "Root Node: ");
   }

   private void display(Node node, String details) {
      if (node == null) {
         return;
      }
      System.out.println(details + node.value + ": ");

      display(node.left, "left child of " + node.value + ":");
      display(node.right, "right child of " + node.value + ":");
   }

   public void insert(int value) {
      root = insert(value, root);
   }

   private Node insert(int value, Node node) {
      if (node == null) {
         node = new Node(value);
         return node;
      }

      if (value < node.value) {
         node.left = insert(value, node.left);
      }

      if (value > node.value) {
         node.right = insert(value, node.right);
      }

      node.height = Math.max(height(node.left), height(node.right)) + 1;

      return node;
   }

   public void populate(int[] nums) {
      for (int i = 0; i < nums.length; i++) {
         this.insert(nums[i]);
      }
   }

   public void populateSorted(int[] nums) {
      populateSorted(nums, 0, nums.length);
   }

   private void populateSorted(int[] nums, int start, int end) {
      if (start >= end) {
         return;
      }

      int mid = (start + end) / 2;

      this.insert(nums[mid]);
      populateSorted(nums, start, mid);
      populateSorted(nums, mid + 1, end);
   }

   public boolean balanced() {
      return balanced(root);
   }

   private boolean balanced(Node node) {
      if (node == null) {
         return true;
      }
      return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
   }

   public static void main(String[] args) {
      BST tree = new BST();
      int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
      tree.populateSorted(nums);
      tree.display();
      tree.preOrder();
      tree.inOrder();
      tree.postOrder();
   }

   public void preOrder() {
      preOrder(root);
   }

   private void preOrder(Node node) {
      if (node == null) {
         return;
      }

      System.out.print(node.value + " -> ");
      preOrder(node.left);
      preOrder(node.right);
      System.out.println();

   }

   public void inOrder() {
      preOrder(root);
   }

   private void inOrder(Node node) {
      if (node == null) {
         return;
      }
      preOrder(node.left);
      System.out.print(node.value + " -> ");
      preOrder(node.right);
System.out.println();
   }


   public void postOrder() {
      preOrder(root);
   }

   private void postOrder(Node node) {
      if (node == null) {
         return;
      }
      preOrder(node.left);
      preOrder(node.right);
      System.out.print(node.value + " -> ");
System.out.println();
   }

}
