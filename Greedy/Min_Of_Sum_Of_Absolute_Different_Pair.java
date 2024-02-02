package Greedy;

import java.util.*;

public class Min_Of_Sum_Of_Absolute_Different_Pair {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3 };
        int[] B = { 2, 1, 3 };

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;

        for (int i = 0; i < A.length; i++) {
            minDiff = Math.abs(A[i] - B[i]);
        }
        System.out.println(minDiff);
    }
}
