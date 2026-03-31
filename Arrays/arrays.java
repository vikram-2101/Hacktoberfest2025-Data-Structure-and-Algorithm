import java.util.*;

public class ArraysExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        // Input elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Search for a specific element
        System.out.print("Enter the element to search: ");
        int x = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (numbers[i] == x) {
                System.out.println("Element " + x + " found at index " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Element " + x + " not found in the array.");
        }

        sc.close();
    }
}
