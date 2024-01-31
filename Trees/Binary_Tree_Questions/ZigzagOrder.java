gpackage Trees.Binary_Tree_Questions;

import java.util.*;

import Trees.Binary_Tree_Questions.Binary_Tree_Level_order_traversal.TreeNode;

public class ZigzagOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        boolean reverse = false;

        while (!queue.isEmpty()) {
            int levelsize = queue.size();
            List<Integer> currentlevel = new ArrayList<>(levelsize);
            for (int i = 0; i < levelsize; i++) {
                if (!reverse) {
                    TreeNode currentNode = queue.pollFirst();
                    currentlevel.add(currentNode.val);
                    if (currentNode.left != null) {
                        queue.addLast(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        queue.addLast(currentNode.right);
                    }
                } else {
                    TreeNode currentNode = queue.pollFirst();
                    currentlevel.add(currentNode.val);
                    if (currentNode.right != null) {
                        queue.addLast(currentNode.right);
                    }
                    if (currentNode.left != null) {
                        queue.addLast(currentNode.left);
                    }
                }
            }
            reverse = !reverse;
            result.add(currentlevel);

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
}
