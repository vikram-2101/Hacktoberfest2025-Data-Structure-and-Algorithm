import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        // int[] arr = new int[8];
        Scanner sc = new Scanner(System.in);
        
          int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int numswaps = bubblesort(arr);
        System.out.println(numswaps);
    }

    static int bubblesort(int[] arr) {
        int n = arr.length;
        int swap = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    //dkp
                    swap++; //to calculate no of swaps
                }
            }
        }
return swap;   //to calculate no of swaps
    }

}