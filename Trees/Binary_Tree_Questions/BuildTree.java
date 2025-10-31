package Trees.Binary_Tree_Questions;

import java.util.*;

public class BuildTree {
    // Recursive approach with indices
    private int preIndex = 0;
    private int[] preorder;
    private int[] inorder;
    private Map<Integer, Integer> indexMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;

        for (int i = 0; i < inorder.length; i++) {
            indexMap.put(inorder[i], i);
        }

        return buildTreeHelper(0, inorder.length - 1);
    }

    private TreeNode buildTreeHelper(int inLeft, int inRight) {
        if (inLeft > inRight) {
            return null;
        }

        int rootValue = preorder[preIndex++];
        TreeNode root = new TreeNode(rootValue);

        int inIndex = indexMap.get(rootValue);

        root.left = buildTreeHelper(inLeft, inIndex - 1);
        root.right = buildTreeHelper(inIndex + 1, inRight);

        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        };

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {

    }

    // Stack Solution
    class Solution {
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            if (preorder.length == 0 || inorder.length == 0) {
                return null;
            }

            TreeNode root = new TreeNode(preorder[0]);
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            int inIndex = 0;

            for (int i = 1; i < preorder.length; i++) {
                int preValue = preorder[i];
                TreeNode node = stack.peek();

                if (node.val != inorder[inIndex]) {
                    node.left = new TreeNode(preValue);
                    stack.push(node.left);
                } else {
                    while (!stack.isEmpty() && stack.peek().val == inorder[inIndex]) {
                        node = stack.pop();
                        inIndex++;
                    }

                    node.right = new TreeNode(preValue);
                    stack.push(node.right);
                }
            }

            return root;
        }
    }

}
