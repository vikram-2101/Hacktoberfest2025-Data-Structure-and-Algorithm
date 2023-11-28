import java.util.*; c

public class RotateInArray {
    /*
     * public static void main(String[] args) {
     * int[] arr = {6,4,32,23,64,7};
     * Scanner sc = new Scanner(System.in);
     * int k = sc.nextInt();
     * int[] ans = rotateInArray(arr, k);
     * System.out.println(Arrays.toString(ans));
     * }
     * static int[] rotateInArray(int[] arr, int k) {
     * int n = arr.length;
     * k = k%n;
     * int[] ans = new int[n];
     * int j = 0;
     * for(int i=n-k; i<n; i++) {
     * ans[j++] = arr[i];
     * }
     * for(int i=0; i<n-k; i++) {
     * ans[j++] = arr[i];
     * }
     * 
     * return ans;
     * }
     */

    // without taking extra place
    public static void main(String[] args) {
        int[] arr = { 6, 4, 32, 23, 64, 7 };
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        // int[] ans = rotateInArray(arr, k);
        rotateInArray(arr, k);
       System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void rotateInArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);

    }

}
