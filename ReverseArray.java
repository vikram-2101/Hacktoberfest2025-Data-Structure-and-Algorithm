import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
    int[] arr= {1,23,4,5,6,7,8,9,10};
//   int ans[] = new int[arr.length];
//         for (int i = 0; i < ans.length; i++) {
//             System.out.print(ans[i]);
//         }
//     System.out.println();
reverse(arr);
System.out.println(Arrays.toString(arr));
 }
// for(int i=0; i<arr.length; i++) {
//     System.out.print(arr[i]+" ");
// }
//  System.out.println();  
        //for(int i=arr.length-1; i>=0; i--) {
//             System.out.print(arr[i]+" ");
//         }
      
//     }
    
// }
//public class ReverseArray{
   // static int[] reversearray(int[] arr) {
//         int[] ans = new int[arr.length];
//         int j = 0;
//         for (int i = arr.length - 1; i >= 0; i--) {
//             ans[j++] = arr[i];

//         }
//         return ans;
//     }
// or
// int i=arr.length-1; int j=0;
// while(i>=0) {
//     arr[j++] = arr[i--];
// }

//    // public static void main(String[] args) {
//         int[] arr = { 1, 2, 3, 4 };
    //     int ans[] = reversearray(arr);
    //     for (int i = 0; i < ans.length; i++) {
    //         System.out.print(ans[i]);
    //     }
    // System.out.println();
    // }

//}

// new  without creating new array
    
    static void swap(int[] arr, int j,int i) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
static void reverse(int[] arr) {
    int i=0;
     int j=arr.length-1;
while(i<j) {
    swap(arr,i,j);
    i++;
    j--;
}
}
}