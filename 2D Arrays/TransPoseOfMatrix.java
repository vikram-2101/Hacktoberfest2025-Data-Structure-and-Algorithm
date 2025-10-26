import java.util.*;

/*
Program: Transpose of a Matrix
--------------------------------
This program takes a 2D matrix as input and prints both
the original and its transpose (rows become columns).
*/

public class TransPoseOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for rows and columns
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];
        int totalElements = r * c;

        // Input matrix elements
        System.out.println("\nEnter " + totalElements + " elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter value at position [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print original matrix
        System.out.println("\nOriginal Matrix:");
        printMatrix(matrix);

        // Find and print transpose
        int[][] transposed = findTranspose(matrix, r, c);
        System.out.println("\nTransposed Matrix:");
        printMatrix(transposed);

        sc.close();
    }

    // Function to print a matrix
    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // Function to find transpose of a matrix
    static int[][] findTranspose(int[][] matrix, int r, int c) {
        int[][] ans = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
}
