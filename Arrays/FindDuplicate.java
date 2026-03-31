import java.util.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 2};

        int duplicate = findDuplicate(arr);

        if (duplicate != -1) {
            System.out.println("Duplicate element found: " + duplicate);
        } else {
            System.out.println("No duplicate element found.");
        }

        System.out.println("Array after processing: " + Arrays.toString(arr));
    }

    // Function to find the duplicate in the array
    static int findDuplicate(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correct = arr[i] - 1;

            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                if (i != correct) { // Duplicate found
                    return arr[i];
                } else {
                    i++;
                }
            }
        }

        return -1; // No duplicate found
    }

    // Swap function
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
