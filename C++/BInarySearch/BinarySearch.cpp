#include <bits/stdc++.h>
using namespace std;
int binarySearch(int arr[], int low, int high, int x) {
   if (high >= low) {
       int mid = low + (high - low) / 2;
       // Check if the element is present at the middle
       if (arr[mid] == x)
           return mid;
       // If the element is smaller than mid, it can only be present in the left subarray
       if (arr[mid] > x)
           return binarySearch(arr, low, mid - 1, x);
       // Else the element can only be present in the right subarray
       return binarySearch(arr, mid + 1, high, x);
   }
   // Element is not present in the array
   return -1;
}
int main() {
   int arr[] = {2, 3, 4, 10, 40};
   int x = 10;
   int n = sizeof(arr) / sizeof(arr[0]);
   int result = binarySearch(arr, 0, n - 1, x);
   (result == -1) ? cout << "Element is not present in array" : cout << "Element is present at index " << result;
   return 0;
}