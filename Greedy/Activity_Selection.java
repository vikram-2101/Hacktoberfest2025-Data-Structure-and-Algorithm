dhpackage Greedy;

import java.util.*;

public class Activity_Selection {
    public static void main(String[] args) {
        // start time
        int[] start = { 1, 3, 0, 5, 8, 5 };
        // end time
        int[] end = { 2, 4, 6, 7, 9, 9 };
        // sorting
        int[][] arr = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            arr[i][0] = i;
            arr[i][1] = start[i];
            arr[i][2] = end[i];
        }
        // lambda function -> shortform
        Arrays.sort(arr, Comparator.comparingDouble(o -> o[2]));
        System.out.println(Arrays.toString(arr));
        // sort on the basis of end time
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st activity
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];
        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("max activity: " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println("A " + ans.get(i) + " ");
        }
        System.out.println();
    }
}
