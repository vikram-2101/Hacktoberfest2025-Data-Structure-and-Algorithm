import java.util.*;
import java.util.Arrays;
s
public class LinearSearch {
    public static void main(String[] args) {

        // find the target

        // int[] nums = {23, 45, 1,2 ,8 ,19 ,-6 ,-11, 28};
        // int target =3;

        // int ans = linearsearch(nums, target, 1 ,4);
        // //System.out.println(ans);
        // }
        // static int linearsearch(int[] nums, int target ,int start, int end) {
        // if(nums.length == 0) {
        // return -1;
        // }
        // }

        // }

        // for (int index = 0; index< nums.length; index++){
        // int element = nums[index];
        // if (
        // element == target
        // ) {
        // return index;
        // }
        // }
        // return -1;

        // int[] nums = {23, 45, 1,2 ,8 ,19 ,-6 ,-11, 28};
        // int target = 19;
        // int ans= linearsearch (nums, target);
        // System.out.println(linearsearch(nums, target));
        // }

        // static int linearsearch (int[] nums, int target) {
        // if(nums.length==0) {
        // return -1;
        // }
        // // }
        // for(int index=0; index<nums.length; index++) {
        // if(target==nums[index]) {
        // return index;

        // }

        // return -1;

        // // search the target and return the element
        // for(int element:nums) {
        // if(element==target) {
        // return element;
        // }
        // }
        // return -1;

        // Search in range
        // iske liye bus 2 new start and end variables static vale me dal do

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter how many values you want ");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // System.out.println("Enter"+n+" values");
        // for(int i=0; i<arr.length; i++);
        // arr[i]=sc.nextInt();
        // System.out.println("Enter elment you want to search");
        // int target = sc.nextInt();
        // for(int i=0; i<arr.length; i++){
        // if(arr[i]==target) {
        // System.out.println(target+" found at position ");

        // } else{
        // System.out.println("target not found at position ");
        // }
        // }

        int[] arr = { 1, 2, 3, 7, 45, 56, 23, 56, 76, 75 };
        int target = 10;
       // int[] result = linearsearch(arr, target);
        // if (result == -1) {
        // System.out.println("Error");
        //  } else {
        //   System.out.println("Result: " + result);
        //  }
        System.out.println(Arrays.toString(linearsearch(arr, target)));

    }

    public static int[] linearsearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                return new int[] {i,j};
            }
       
        }
    }
    return linearsearch(arr, target);

}
}
