import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18,-12, -4, 0 , 5,4556,7,43,65,78};
        int target = 5;
        int ans = binarysearch(arr, target);
        System.out.println(ans);
    }
static int binarysearch(int[] arr,int target) {
    int start = 0;
    int end = arr.length-1;
    while(start <= end) {
int mid = start + (end - start)/2;
if (target<arr[mid]) {
end = mid - 1;
}
else if (target>arr[mid]) {
    start = mid + 1;
    }
    else {
        return mid;
    }
}
return -1;
}



}
