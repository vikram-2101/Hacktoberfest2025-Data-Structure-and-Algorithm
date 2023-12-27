hgfgfsimport java.util.*;
import java.util.Arrays;
import java.util.Scanner;
public class TransPoseOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalelement = r * c;
        System.out.println("Enter " + totalelement + " values: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter the value for element at position [" + i + "][" + j + "]: ");

                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input array is " );
         printMatrix(matrix);
        int[][] ans = findtranspose(matrix, r, c);
       System.out.println(Arrays.toString(ans));
        //System.out.println("transposed matrix");
     //System.out.println(findtranspose(matrix, r, c));
   
    }
     static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j] + " ");
        }
    }
     }
    static int[][] findtranspose(int[][] matrix, int r, int c) {
        int[][] ans = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
    // static void findtranspose(int[][] matrix, int r, int c) {
    //     for(int i = 0; i < r; i++) {
    //         for(int j = 0; j < c; j++) {
    //             int temp = matrix[i][j];
    //             matrix[i][j] = matrix[j][i];
    //             matrix[j][i] = temp;
    //         }
    // }
}
    //}
