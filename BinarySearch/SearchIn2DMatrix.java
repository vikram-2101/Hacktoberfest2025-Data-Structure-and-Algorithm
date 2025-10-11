import java.util.*;
public class SearchIn2DMatrix {
    public static void main(String[] args) {
    int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
    System.out.println(findElement(arr, 11));
    }
 static boolean findElement(int[][] arr, int target) {
    int n = arr.length;
    int m = arr[0].length;
    int start = 0;
    int end = n*m - 1;
    while(start <= end) {
        int mid = start + (end - start) / 2;
        int midelement = arr[mid/m][mid%m];
        if(midelement==target) return true;
    if(target<midelement) {
        end =mid -1;
    }
    else {
        start = mid + 1;
    }
    }
    return false;
 }
}
