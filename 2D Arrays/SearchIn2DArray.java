import java.util.*;

/*
Given a 2D array and a target value,
search for the target in the array and return its position
as [row, column]. If not found, return [-1, -1].
*/

public class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input array dimensions
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        
        // Input array elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Input target element
        int target = sc.nextInt();
        
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));

        sc.close();
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1}; // Target not found
    }
}
