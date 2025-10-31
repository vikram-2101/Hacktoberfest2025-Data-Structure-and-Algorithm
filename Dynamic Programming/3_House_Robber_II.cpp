// LEETCODE 213

#include <iostream>
#include <vector>
using namespace std;

// Helper function for normal (linear) house robber problem
int robLinear(vector<int>& nums) {
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

// Main function for circular houses
int rob(vector<int>& nums) {
    int n = nums.size();
    if (n == 0) return 0;
    if (n == 1) return nums[0];

    // Case 1: Exclude last house
    vector<int> case1(nums.begin(), nums.end() - 1);
    // Case 2: Exclude first house
    vector<int> case2(nums.begin() + 1, nums.end());

    return max(robLinear(case1), robLinear(case2));
}

int main() {
    int n;
    cout << "Enter number of houses: ";
    cin >> n;

    vector<int> nums(n);
    cout << "Enter money in each house:\n";
    for (int i = 0; i < n; i++)
        cin >> nums[i];

    cout << "Maximum amount that can be robbed: " << rob(nums);
    return 0;
}
