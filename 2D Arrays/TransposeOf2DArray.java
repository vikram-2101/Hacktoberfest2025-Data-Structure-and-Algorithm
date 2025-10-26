import java.util.*;

/*
Program: Input a 2D array and display both the original
and its transpose (rows become columns).
*/

public class vi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for rows and columns
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        // Input elements
        System.out.println("\nEnter the elements of the 2D array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter value at position [" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }

        // Display the entered array
        System.out.println("\nOriginal 2D Array:");
        printMatrix(arr);

        // Display the transpose of the array
        System.out.println("\nTranspose of the Array:");
        printTranspose(arr, row, col);

        sc.close();
    }

    // Function to print a matrix
    static void printMatrix(int[][] arr) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // Function to print transpose
    static void printTranspose(int[][] arr, int row, int col) {
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
