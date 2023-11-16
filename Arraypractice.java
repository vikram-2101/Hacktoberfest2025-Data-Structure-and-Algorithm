import java.util.*;
public class Arraypractice {
public  static void main(String[] args) {

  int[] arr = {3,454,566,4,54,644,6};
  //int target = 4;
  Scanner sc = new Scanner(System.in);
  int target = sc.nextInt();
  boolean ans = min(arr, target);
  System.out.println(ans);
System.out.println();
}
 static boolean min(int[] arr, int target) {
//    if(arr.length ==0) {
//     return false;
//    }
 for (int element : arr) {
    if(element == target) {
        return true;
    }
}
    
  return false;  

 }
}