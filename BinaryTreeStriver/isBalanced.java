ccdfpublic class isBalanced {
    public static void main(String[] args) {

    }

    public boolean isbalanced(TreeNode root) {
        return height(root) != -1;
    }

    public int height(TreeNode root) {
        if (root == null) {
            return -1;
        }
        int leftHeight = height(root.left);
        if (leftHeight == -1)
            return -1;
        int rightHeight = height(root.right);
        if (rightHeight == -1)
            return -1;

        if (Math.abs(leftHeight - rightHeight) > 1)
            return -1;
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
