adhpackage Trees.SegmentTree;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int arr[]= {0,1,2,3,4,5,6,7};
        SegmentTree tree = new SegmentTree(arr);
        System.out.println(tree.query(1, 6));
        tree.display();
    }
}
