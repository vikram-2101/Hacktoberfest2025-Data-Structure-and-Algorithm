import java.util.*;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,8,9,10,11,12,13};
        int target = 9;
System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        //first find the range
        //first start with the box of size 2
        int start = 0;
        int end = 1;
// condition for the target to lies in the range
while (target > arr[end]) {
    int temp = end + 1; // this is my new start
    //double the box value
    //end = previous end + size of box * 2;
    end = end + (end - start + 1) * 2;
    start = temp;
}
return binarysearch(arr, target,start,end);
    }
    static int binarysearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}

