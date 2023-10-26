import java.util.Arrays;
public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 3, 2 };
findDuplicate(arr);
System.out.println(Arrays.toString(arr));
    }

    static int findDuplicate (int[] arr) {
        int i=0,correct;
        while (i<arr.length) {
        if(arr[i] != i+1) {
correct = arr[i]-1;
if(arr[i] != correct) {
    swap(arr,correct,i);
        }
        else {
            return arr[i];

        }
      
    }
    else {i++;}
    }
    return -1;
}
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp; 
    }
}

   
