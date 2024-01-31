jggfpackage Trees.Binary_Tree_Questions;
import java.util.*;
// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.List;
// import java.util.Queue;

// import javax.swing.tree.TreeNode;

public class AverageOfLevels {
    public List<Double> levelofOrder(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelsize = queue.size();
            double averagelevel = 0;
            for (int i = 0; i < levelsize; i++) {
                TreeNode currentNode = queue.poll();
                averagelevel += currentNode.val;
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            averagelevel = averagelevel / levelsize;
            result.add(averagelevel);
        }
        return result;
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }
    public static void main(String[] args) {
        
    }
}
