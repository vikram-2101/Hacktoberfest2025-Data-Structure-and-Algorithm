import java.util.*;

public class Mountain {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,64,32,3,5,};
        System.out.println(peakIndexInMountainArray(arr));
    }
    static int peakIndexInMountainArray(int[] arr) {
int start = 0;
int end = arr.length-1;
while (start < end) {
    int mid = start + (end-start) / 2;
    if(arr[mid]>arr[mid+1]) {
        //you  are in decreasing part of array
        //this may be the answer but look for left
        end = mid;
    }
    else {
        start = mid + 1;
    }
    }
    return start;
}
}