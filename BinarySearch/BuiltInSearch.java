import java.util.Arrays;

public class BuiltInSearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int index = Arrays.binarySearch(arr, 40);

        if (index >= 0)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found!");
    }
}
