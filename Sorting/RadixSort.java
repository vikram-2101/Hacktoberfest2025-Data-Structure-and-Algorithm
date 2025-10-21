// RadixSort.java
import java.util.Arrays;

public class RadixSort {
    public static void countingSortByDigit(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        // Count occurrences of each digit
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        // Convert to cumulative count
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build output array (stable sorting)
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // Copy back
        for (int i = 0; i < n; i++)
            arr[i] = output[i];
    }

    public static void radixSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();

        // Sort by each digit
        for (int exp = 1; max / exp > 0; exp *= 10)
            countingSortByDigit(arr, exp);
    }

    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        radixSort(arr);

        System.out.print("Sorted array: ");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
