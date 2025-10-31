    
// import java.util.*;
// public class SearchInRangeInArray  {
// public static void main(String[] args) {
// int[] arr = {1, 2, 3, 4, 5, 6};
// int target = 3;
// System.out.println(linearsearch(arr,target, 1,4));
// }
// static int linearsearch(int[] arr, int target, int start, int end) {
//     if(arr.length == 0) {
//         return -1;
//     }
//     for(int i = start ; i < end ; i++) {
// int element = arr[i];
// if(element == target) {
//     return i;
// }
//     }
//     return -1;
//}
//}
import java.util.*;
public class SearchInRangeInArray{
public static void main(String[] args) {
int[] arr = {1,2,3,4,5,6,7,8};
int target = 6;
System.out.println(linearsearch(arr, target, 2, 6));
}
static int linearsearch(int[] arr, int target, int start, int end) {
if (arr.length==0) {
    return -1;
}
for (int i = start; i < end; i++) {
    int element = arr[i]; 
    if(element==target) {
return i;
    }
}
return -1;
}
}