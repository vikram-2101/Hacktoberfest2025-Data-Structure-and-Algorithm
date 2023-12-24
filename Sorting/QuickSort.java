vgkhfdgimport java.util.Arrays;
import java.util.*;

public class QuickSort{
    public static void main(String[] args) {
        int arr[] = {5, 3, 2, 16, 6, 4};
       quicksort(arr, 0, arr.length-1);

        System.out.println("Sorted array:");
        // for (int num : arr) {
        //     System.out.print(num + " ");
        // }
        System.out.println(Arrays.toString(arr));
    }

    static int partition(int[] arr, int s, int e) {
        int mid = s  + ( e - s) /2;
        int pivot = arr[mid];
        int i = s;
        int j = e;
        while (i < j) {
            while (i < j && arr[i] <= pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, j, s);
        return j;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void quicksort(int[] arr, int s, int e) {
        if (s < e) {
            int pivot = partition(arr, s, e);
            quicksort(arr, s, pivot - 1);
            quicksort(arr, pivot + 1, e);
        }
    }
} 
    

