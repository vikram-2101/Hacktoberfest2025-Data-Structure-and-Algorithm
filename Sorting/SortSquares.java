himport java.util.*;

public class SortSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = sortsquares(arr);
        System.out.println(Arrays.toString(ans));

    } 

    static int[] sortsquares(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int[] ans = new int[n];
        int k = 0;
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }
}
