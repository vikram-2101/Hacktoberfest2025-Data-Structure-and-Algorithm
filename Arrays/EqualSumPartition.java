import java.util.*;

public class EqualSumPartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (hasEqualSumPartition(arr)) {
            System.out.println("Yes, the array can be divided into two parts with equal sum.");
        } else {
            System.out.println("No, the array cannot be divided into two parts with equal sum.");
        }

        sc.close();
    }

    // Function to calculate the total sum of array elements
    static int totalSum(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        return totalSum;
    }

    // Function to check if the array can be divided into two equal sum parts
    static boolean hasEqualSumPartition(int[] arr) {
        int totalSum = totalSum(arr);
        int prefixSum = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            int suffixSum = totalSum - prefixSum;

            if (prefixSum == suffixSum) {
                return true;
            }
        }
        return false;
    }
}
