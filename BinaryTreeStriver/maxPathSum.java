public class maxPathSum {
    public static int maxpathSum(Node root) {
        int maxValue[] = new int[1];
        maxValue[0] = Integer.MIN_VALUE;
        maxPathDown(root, maxValue);
        return maxValue[0];
    }

    public static int maxPathDown(Node node, int maxValue[]) {
        if (node == null)
            return 0;
        int left = Math.max(0, maxPathDown(node.left, maxValue));
        int right = Math.max(0, maxPathDown(node.right, maxValue));
        maxValue[0] = Math.max(maxValue[0], left + right + node.val);
        return Math.max(left, right) + node.val;

    }

    class Node {
        int val;
        Node left;
        Node right;

        public Node(int data) {
            val = data;
            left = right = null;
        }
    }
}
