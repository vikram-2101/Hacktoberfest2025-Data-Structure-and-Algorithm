import java.util.ArrayList;
import java.util.List;

public class leftView {
    public List<Integer> lightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        leftView(root, result, 0);
        return result;
    }

    public void leftView(TreeNode curr, List<Integer> result, int currDepth) {
        if (curr == null) {
            return;
        }
        if (currDepth == result.size()) {
            result.add(curr.data);
        }

        leftView(curr.left, result, currDepth + 1);
        leftView(curr.right, result, currDepth + 1);

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