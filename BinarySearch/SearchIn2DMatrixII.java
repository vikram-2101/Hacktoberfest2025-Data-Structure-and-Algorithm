public class SearchIn2DMatrixII {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 7, 11 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 } };

System.out.println(searchMatrix(matrix, 7));
    }

    static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0;
        int j = m - 1;
        while(i<n && j>=0) {
            if(matrix[i][j] == target) return true;
            if(target< matrix[i][j])
{
    j--;
}     
 else {
        i++;
    }
}
return false;
    }

}
