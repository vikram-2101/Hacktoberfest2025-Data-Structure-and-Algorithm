import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class topView {
    /*
     * First we have to make a queue of pair which have nodes and their respective
     * +ve and -ve indexes.
     * Then we need a map data structure to store the lines and the nodes. This map
     * will store the data in the form of sorted orders of keys(Lines).
     * Here we will follow the level order traversal.
     * Traverse through the nodes starting with root,0 and store them to the queue.
     * Until the queue is not empty, store the node and line no. in 2 separate
     * variable .
     * Then check if that line is present in the map or not
     * If not present then store the line and the node->val to the map
     * Otherwise store the node->left and node->right along with there line nos. to
     * the queue.
     * Then print the node->val from the map
     */

    public static ArrayList<Integer> topview(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(root, 0));
        while (!q.isEmpty()) {
            Pair it = q.remove();
            int num = it.num;
            Node temp = it.node;
            if (map.get(num) == null)
                map.put(num, temp.data);
            if (temp.left != null) {

                q.add(new Pair(temp.left, num - 1));
            }
            if (temp.right != null) {

                q.add(new Pair(temp.right, num + 1));
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
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

class Pair {
    int num;
    Node node;

    public Pair(Node _node, int data) {
        num = data;
        node = _node;
    }
}