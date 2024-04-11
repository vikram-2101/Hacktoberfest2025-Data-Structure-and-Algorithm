spublic class DistributeChocolate {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 1, 4, 2 };
        int m = 3; // number of students in which to distribute
        System.out.println(distributeChocolate(arr, m));
    }

 static int distributeChocolate(int[] arr, int m) {
    if(arr.length<m) return -1;
    int ans = 0 , st = 1, end = (int)1e9;    // 1en9 == 1000000 max value le rahe hai
    while(st<=end){
        int mid =st + (end-st) / 2;
        if(isDivisionPossible(arr, m , mid)) {
         ans = mid ;
         end = mid -1;
        }else {
     st= mid + 1;
        }
    }
    return ans;
 }

 static boolean isDivisionPossible(int[] arr , int m , int maxChocolateAllowed) {
int numberOfStudents = 1;  // pehle 1 child ko chocolate denge
int chocolate=0;   // pehle 1 child ko 0 chocolate denge
for(int i = 0; i < arr.length; i++) {
    if(arr[i] >maxChocolateAllowed) return false;
    if(chocolate+arr[i] <=maxChocolateAllowed) {
        chocolate+=arr[i];
    }
    else {
        numberOfStudents++;
        chocolate = arr[i];
    }
 }
 if(numberOfStudents>m) return false;
 return true;
}
}
