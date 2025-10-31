import java.util.*;

class TreeNode {
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

public class Traversal extends Tree {
    public static void main(String[] args) {
        // Node root = new Node(1);
        // root.left = new Node(2);
        // root.right = new Node(3);
        // root.left.left = new Node(4);
        // root.left.right = new Node(5);

        // preOrder(root);
        // System.out.println();
        // inOrder(root);
        // System.out.println();
        // postOrder(root);
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();
        allTraversal(root, pre, in, post);

        System.out.println("The preorder Traversal is : ");
        for (int nodeVal : pre) {
            System.out.print(nodeVal + " ");
        }
        System.out.println();
        System.out.println("The inorder Traversal is : ");
        for (int nodeVal : in) {
            System.out.print(nodeVal + " ");
        }
        System.out.println();
        System.out.println("The postorder Traversal is : ");
        for (int nodeVal : post) {
            System.out.print(nodeVal + " ");
        }
        System.out.println();
    }

    static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + "->");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + "->");
        inOrder(root.right);
    }

    static List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        list.add(root.data);
        list.addAll(preorder(root.left));
        list.addAll(preorder(root.right));
        return list;
    }

    static List<Integer> inorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        list.addAll(inorder(root.left));
        list.add(root.data);
        list.addAll(inorder(root.right));
        return list;
    }

    static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + "->");
    }

    static List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        list.addAll(postorder(root.left));
        list.addAll(postorder(root.right));
        list.add(root.data);
        return list;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> sublist = new LinkedList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                if (queue.peek().left != null) {
                    queue.offer(queue.peek().left);
                }
                if (queue.peek().right != null) {
                    queue.offer(queue.peek().right);
                }
                sublist.add(queue.poll().val);
            }
            list.add(sublist);
        }
        return list;
    }

    ArrayList<Integer> IterativepreOrder(Node root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<Node> stack = new Stack<>();
        if (root == null) {
            return list;
        }
        stack.push(root);
        while (!stack.isEmpty()) {
            root = stack.pop();
            list.add(root.data);
            if (root.right != null) {
                stack.push(root.right);
            }
            if (root.left != null) {
                stack.push(root.left);
            }
        }
        return list;
    }

    public List<Integer> IterativeinOrder(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (true) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                if (stack.isEmpty()) {
                    break;
                }
                node = stack.pop();
                list.add(node.val);
                node = node.right;
            }
        }
        return list;
    }

    public List<Integer> postOrder(TreeNode root) {
        // post order using two stack s1 and s2
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        s1.push(root);
        while (!s1.isEmpty()) {
            root = s1.pop();
            s2.push(root);
            if (root.right != null) {
                s1.push(root.right);
            }
            if (root.left != null) {
                s1.push(root.left);
            }
        }
        while (!s2.isEmpty()) {
            list.add(s2.pop().val);
        }
        return list;
    }

    // iterative postorder
    static void postOrderTrav(Node curr, ArrayList<Integer> postOrder) {
        if (curr == null)
            return;

        postOrderTrav(curr.left, postOrder);
        postOrderTrav(curr.right, postOrder);
        postOrder.add(curr.data);
    }

    static List<Integer> postOrderTraversal(Node curr) {
        // using only one stack;
        // https://takeuforward.org/data-structure/post-order-traversal-of-binary-tree/
        ArrayList<Integer> postOrderTraversal = new ArrayList<>();
        if (curr == null)
            return postOrderTraversal;
        Stack<Node> stack = new Stack<>();

        while (curr != null || !stack.isEmpty()) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                Node temp = stack.peek().right;
                if (temp == null) {
                    temp = stack.peek();
                    stack.pop();
                    postOrderTraversal.add(temp.data);
                    while (!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.peek();
                        stack.pop();
                        postOrderTraversal.add(temp.data);
                    }
                } else {
                    curr = temp;
                }
            }
        }
        return postOrderTraversal;
    }

    class Pair {
        TreeNode node;
        int num;

        Pair(TreeNode _node, int _num) {
            num = _num;
            node = _node;
        }
    }

    public static void allTraversal(TreeNode root, List<Integer> pre, List<Integer> in, List<Integer> post) {
        if (root == null)
            return;

        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root, 1));

        while (!st.isEmpty()) {
            Pair it = st.pop();

            if (it.num == 1) {
                pre.add(it.node.val);
                it.num++;
                st.push(it);
                if (it.node.left != null) {
                    st.push(new Pair(it.node.left, 1));
                }
            } else if (it.num == 2) {
                in.add(it.node.val);
                it.num++;
                st.push(it);
                if (it.node.right != null) {
                    st.push(new Pair(it.node.right, 1));
                }
            } else {
                post.add(it.node.val);
            }
        }
    }

}
