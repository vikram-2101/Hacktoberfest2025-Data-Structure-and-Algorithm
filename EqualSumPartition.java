hhgffsgfsdimport java.util.*;
public class EqualSumPartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter "+n+" elements");
        for(int i=0; i<n; i++) {
         arr[i] = sc.nextInt();
        }
       System.out.println(equalsumpartition(arr));
    }
     static int totalSum(int[] arr) {
        int totalsum = 0;

        
       int n = arr.length;
        for(int i=0; i<n; i++) {
         totalsum+= arr[i];
        }
      return totalsum;
    }
    static boolean equalsumpartition(int[] arr) {
    int totalsum = totalSum(arr);
    int prefsum=0;
    for (int i=0; i<arr.length; i++) {
      prefsum+= arr[i];
      int suffixsum=totalsum-prefsum;
      if( suffixsum==prefsum) {
        return true;
      }
    }
    return false;
    }
  //   static int makePrefixSumArray(int[] arr) {
  //       for(int i=1; i<arr.length; i++) {
  //        arr[i]+=arr[i-1];
  //    }
  //  return arr;
  //       }
}
