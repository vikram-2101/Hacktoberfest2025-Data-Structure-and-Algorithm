// ShellSort.java
public class ShellSort {
    public static void shellSort(int[] arr) {
        int n = arr.length;

        // Start with a big gap, reduce it each iteration
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;

                // Perform gapped insertion sort
                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 54, 2, 3};
        shellSort(arr);

        System.out.print("Sorted array: ");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
