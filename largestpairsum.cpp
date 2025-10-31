#include <bits/stdc++.h>
using namespace std;

/* Function to return largest pair sum. Assumes that
there are at-least two elements in arr[] */
int findLargestSumPair(vector<int> &arr)
{
    int maxSum = INT_MIN;
    int n = arr.size();
    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            int sum = arr[i] + arr[j];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
    }
    return (maxSum == INT_MIN)? -1 :  maxSum;
}

/* Driver program to test above function */
int main()
{
    vector<int> arr = { 12, 34, 10, 6, 40 };
    cout << "Max Pair Sum is "
        << findLargestSumPair(arr);
    return 0;
}
