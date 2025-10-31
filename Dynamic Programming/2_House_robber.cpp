//LEETCODE 198

#include <iostream>
#include <vector>
using namespace std;

int rob(vector<int>& nums) {
    int n = nums.size();
    if (n == 0) return 0;
    if (n == 1) return nums[0];

    vector<int> dp(n, 0);
    dp[0] = nums[0];
    dp[1] = max(nums[0], nums[1]);

    for (int i = 2; i < n; i++) {
        dp[i] = max(dp[i - 1], nums[i] + dp[i - 2]);
    }

    return dp[n - 1];
}

int main() {
    vector<int> nums;
    int n;
    cout << "Enter number of houses: ";
    cin >> n;

    cout << "Enter money in each house:\n";
    nums.resize(n);
    for (int i = 0; i < n; i++)
        cin >> nums[i];

    cout << "Maximum amount that can be robbed: " << rob(nums);
    return 0;
}
