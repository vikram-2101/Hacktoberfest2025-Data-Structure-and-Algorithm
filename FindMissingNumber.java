import java.util.List;
import java.util.ArrayList;
public class FindMissingNumber {
    // example of cyclic sort
    // public static void main(String[] args) {
    //     int[] arr = { 8,7,3,2,4,2,1, };
    //     System.out.println(missingNumber(arr));
    // }

    //static int missingNumber(int[] arr) {
        public List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]+1;
            if (arr[i] < arr.length && arr[i] != arr[correct] +1) {
swap(arr,i,correct);
            }
            else {i++;}
        
            }
            List<Integer> ans = new ArrayList<>();
            for(int index = 0; index < arr.length; index++) {
if(arr[index]!=index+1) {
    ans.add(arr[index]+1);
    
            }
        }
        return ans;
    }
    static void swap(int[] arr , int start, int end) {
int temp = arr[start];
arr[start] = arr[end];
arr[end] = temp;

    }
}
