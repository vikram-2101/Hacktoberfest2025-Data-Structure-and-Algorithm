jhfghimport java.util.*;
public class RangeQuery {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the array size ");
     int n = sc.nextInt();
     int arr[] = new int[n];
     for(int i=0; i<n; i++) {
        arr[i] = sc.nextInt();
     }
     int prefSum[] = makePrefixSumArray(arr);
     int q = sc.nextInt();
     while(q>0) {
     System.out.println("Enter the range ");
     int l = sc.nextInt();
     int r = sc.nextInt();
    
     int ans = prefSum[r]-prefSum[l-1];
     System.out.println(ans);
     q--;
   }
    }
   static int[] makePrefixSumArray(int[] arr) {
   for(int i=1; i<arr.length; i++) {
    arr[i]+=arr[i-1];
}
return arr;
   }

}
