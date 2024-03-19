import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

/**
 * This class implements zigzag traversal on a binary tree.
 * Zigzag traversal means visiting nodes at each level of the tree
 * from left to right, then right to left.
 */
public class zigzagTraversal {
    /**
     * Performs zigzag traversal on the given binary tree and returns the
     * results as an ArrayList of integers.
     *
     * @param root The root node of the binary tree.
     * @return An ArrayList containing the integer data of the nodes
     *         visited in zigzag traversal order.
     */
    ArrayList<Integer> zigZagTraversal(Node root) {
        ArrayList<Integer> wrapList = new ArrayList<>();
        if (root == null)
            return wrapList;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        boolean flag = true;

        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            ArrayList<Integer> levelList = new ArrayList<>();

            for (int i = 0; i < levelNum; i++) {
                Node node = queue.poll();

                if (flag) {
                    levelList.add(node.data);
                } else {
                    levelList.add(0, node.data);
                }

                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }

            wrapList.addAll(levelList);
            flag = !flag;
        }

        return wrapList;
    }

    /**
     * Represents a node in a binary tree with an integer value, and references
     * to its left and right child nodes.
     */
    class Node {
        int data;
        Node left;
        Node right;

        public Node(int val) {
            data = val;
            left = null;
            right = null;
        }
    }

    /**
     * Performs zigzag traversal on the given binary tree and returns the
     * results as an ArrayList of ArrayLists containing integer data.
     *
     * @param root The root node of the binary tree.
     * @return An ArrayList containing ArrayLists of integers, representing
     *         the data of nodes visited at each level in zigzag traversal order.
     */
    public static ArrayList<ArrayList<Integer>> zigzagLevelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        ArrayList<ArrayList<Integer>> wrapList = new ArrayList<>();

        if (root == null)
            return wrapList;

        queue.offer(root);
        boolean flag = true;
        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            ArrayList<Integer> subList = new ArrayList<>(levelNum);
            for (int i = 0; i < levelNum; i++) {
                if (queue.peek().left != null)
                    queue.offer(queue.peek().left);
                if (queue.peek().right != null)
                    queue.offer(queue.peek().right);
                if (flag == true)
                    subList.add(queue.poll().data);
                else
                    subList.add(0, queue.poll().data);
            }
            flag = !flag;
            wrapList.add(subList);
        }
        return wrapList;
    }
}