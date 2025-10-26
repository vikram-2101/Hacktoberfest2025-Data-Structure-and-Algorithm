import java.util.*;

public class Arraypractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        int target = sc.nextInt();

        int[] arr = {3, 454, 566, 4, 54, 644, 6};

        boolean result = searchElement(arr, target);

        if (result) {
            System.out.println("Element " + target + " found in the array!");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        sc.close();
    }

    static boolean searchElement(int[] arr, int target) {
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}
