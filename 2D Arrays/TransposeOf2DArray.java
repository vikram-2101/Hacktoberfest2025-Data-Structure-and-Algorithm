dbakfhdfsimport java.util.*;
public class vi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row");
int row = sc.nextInt();
System.out.println("Enter the number of column");
int col = sc.nextInt();
int[][] arr = new int[row][col];
for(int i=0; i<row; i++) { 
    for(int j=0; j<col; j++) {
        System.out.print("Enter the value for element at position [" + i + "][" + j + "]: ");
    arr[i][j] = sc.nextInt();
     
 }
 
    }
    System.out.println("The 2D array is:");
for (int i = 0; i < row; i++) {
    for (int j = 0; j < col; j++) {
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
}
 
   System.out.println("The 2D array is:");
for (int i = 0; i < col; i++) {
    for (int j = 0; j < row; j++) {
    
        System.out.print(arr[j][i] + " ");
    }
    System.out.println();
}
}

}
