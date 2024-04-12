fimport java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class bottomview {
    public static void main(String[] args) {

    }

    public ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Node> q = new LinkedList<Node>();
        root.data = 0;
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.remove();
            int hd = temp.data;
            map.put(hd, temp.data);
            if (temp.left != null) {
                temp.left.data = hd - 1;
                q.add(temp.left);
            }
            if (temp.right != null) {
                temp.right.data = hd + 1;
                q.add(temp.right);
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
