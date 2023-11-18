import java.util.*;
public class FrequencyOfArray {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the size of the array: ");
       int n = sc.nextInt();
       int[] arr = new int[n];
       System.out.print("Enter "+n+" elements");
       for(int i=0; i<n; i++) {
        arr[i] = sc.nextInt();
       }
        int[] frequencyArray = makeFrequencyArray(arr);
       System.out.print("Enter the number of queries: ");
       int q = sc.nextInt();
      
       while(q>0) {
        System.out.print("Enter number to be searched: ");
         int x = sc.nextInt();
        if(frequencyArray[x]>0) {
            System.out.println("yes");

        }
        else{System.out.println("no");}
        q--;
       }
    }
static int[] makeFrequencyArray(int[] arr) {
    int[] frequencyArray = new int[100004];
    for(int i = 0; i < arr.length; i++){
        frequencyArray[arr[i]]++ ;
    }
    
return frequencyArray;
}

    }
    

