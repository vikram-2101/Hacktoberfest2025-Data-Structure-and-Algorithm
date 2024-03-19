import java.util.*;
import java.util.Queue;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Pair {
    TreeNode node;
    int num;

    Pair(TreeNode _node, int _num) {
        num = _num;
        node = _node;
    }
}

class WidthBT {
    public static int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int ans = 0;
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, 0));
        while (!queue.isEmpty()) {
            int size = queue.size();
            int min = queue.peek().num;
            int first = 0;
            int last = 0;
            for (int i = 0; i < size; i++) {
                int cur_id = queue.peek().num - min;
                TreeNode node = queue.peek().node;
                queue.poll();
                if (i == 0) {
                    first = cur_id;
                }
                if (i == size - 1) {
                    last = cur_id;
                }
                if (node.left != null) {
                    queue.offer(new Pair(node.left, cur_id * 2 + 1));
                }
                if (node.right != null) {
                    queue.offer(new Pair(node.right, cur_id * 2 + 2));
                }
            }
            ans = Math.max(ans, last - first + 1);
        }
        return ans;
    }

    public static void main(String args[]) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(5);
        root.left.left.left = new TreeNode(7);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(6);

        int maxWidth = widthOfBinaryTree(root);
        System.out.println("The maximum width of the Binary Tree is " + maxWidth);
    }
}
