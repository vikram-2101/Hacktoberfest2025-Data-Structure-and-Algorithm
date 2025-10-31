import java.util.*;

public class SortZeroAndOne {
    public static void main(String[] args) {
        int arr[] = { 2,3,4,5,6,7,8,9,10,11};
        // printarray(arr);
        sort(arr);
    System.out.println(Arrays.toString(arr));
        // printarray(arr);
    }

    static void printarray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "");
        }
        System.out.println();
    }
    // static void reverse(int[] arr, int i, int j) {
     
    //  while (i < j) {
    //   swap(arr, i, j);
    //   i++;
    //   j--;
    //   }
    //   }
    // no use in this code
    /*
     * static void reverse(int[] arr, int i, int j) {
     * 
     * while (i < j) {
     * swap(arr, i, j);
     * i++;
     * j--;
     * }
     * }
     * 
     * static void swap(int[] arr, int i, int j) {
     * int temp = arr[i];
     * arr[i] = arr[j];
     * arr[j] = temp;
     * }
     */

    /*
     * By two pointer method
     * static void sort(int[] arr) {
     * int n=arr.length;
     * int i = 0;
     * int j = arr.length-1;
     * while(i < j) {
     * if(arr[i]==0 && arr[j]==1){
     * swap(arr,i,j);
     * i++;
     * j--;
     * }
     * if(arr[i]==0) {
     * i++;
     * } if (
     * arr[j]==1
     * ) {
     * j--;}
     * }
     * }
     * 
     */

    // static void sort(int[] arr) {
    //     int n = arr.length;
    //     int zeroes = 0;
    //     // count the number of zeroes in the array
    //     // 0 to zeroes - 1:0 zeroes to n-1: 1
    //     for (int i = 0; i < n; i++) {
    //         if (arr[i] == 0) {
    //             zeroes++;
    //         }
    //     }
    //     for (int i = 0; i < n; i++) {
    //         if (i < zeroes) {
    //             arr[i] = 0;
    //         } else {
    //             arr[i] = 1;
    //         }
    //     }
    // }
    static void sort(int[] arr) {
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<j) {
         if(arr[i]%2==1 && arr[j]%2==0) {
            swap(arr, i, j);
            i++;
            j--;
         }
         if(arr[i]%2==0) {
            i++;
         }
         if(arr[j]%2==1) {
            j--;
        }
    }
}
static void swap(int[] arr, int i, int j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      }
}
