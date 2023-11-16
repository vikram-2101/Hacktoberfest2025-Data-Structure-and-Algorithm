import java.util.*;
public class Runningsum {
  public static void main(String[] args) {
//         int[] nums = {1,2,3,4,5,6,7,8};
//         int[] is = new int[nums.length];
//     }
    
    
//     public int[] runningsum(int[] nums) {
        
//         for (int i = 0; i < nums.length; i++) {
//             is[i] += nums[i];
//         }
//         return is;
//    }
// }
// class Solution {
//     public int[] runningSum(int[] nums) {
//         int[] runSum = new int[nums.length];

//         runSum[0] = nums[0];

//         for (int i = 1; i < nums.length; i++) {
//             runSum[i] = runSum[i - 1] + nums[i];
//         }

//         System.out.println(Arrays.toString(runSum));

//         return runSum;
//     }
// }
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Running Sum of 1d Array.
// Time Complexity : O(n)
// Space Complexity : O(n)

    int[] nums = {1,2,3,4,5,6};
int[] output = new int[nums.length];}
// System.out.println(Arrays.toString());}
    public int[] runningSum(int[] nums) {
        // Create an output array of size equal to given nums size...
        int[] output = new int[nums.length];
        // Base case: if the array is empty...
        // if(nums.length == 0)
        //     return output;
        // Set output[0] = nums[0]...
        output[0] = nums[0];
        // Traverse all elements through the for loop...
        for(int idx = 1; idx < nums.length; idx++) {
            // Storing the running sum...
            output[idx] = output[idx-1]+ nums[idx];
        }
        return output;      // Return the running sum of nums...
    }

}

//     class Solution {
//     public int[] runningSum(int[] nums) {
//         for (int i = 1; i < nums.length; i++) {
//             nums[i] += nums[i - 1];
//         }
//         return nums;
//     }
// }




// Simple answer
//  public static void main(String[] args) {
//         int arr[] = {1, 2, 3, 4, 5, 6};
//         int[] ans = RS(arr);
//       System.out.println(Arrays.toString(arr));
//     }
//     static int[] RS(int[] arr) {
       
//      for(int i = 1; i < arr.length; i++) {
//         arr[i] = arr[i] + arr[i -1];
//      }
//      return arr;
//     }