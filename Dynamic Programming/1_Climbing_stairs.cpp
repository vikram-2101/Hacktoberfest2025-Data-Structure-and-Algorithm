//LEETCODE - 70

#include <iostream>
#include <vector>
using namespace std;

int climbStairs(int n) {
    if (n <= 2)
        return n;   // base cases

    vector<int> dp(n + 1, 0);
    dp[1] = 1;
    dp[2] = 2;

    for (int i = 3; i <= n; i++) {
        dp[i] = dp[i - 1] + dp[i - 2];
    }

    return dp[n];
}

int main() {
    int n;
    cout << "Enter number of stairs: ";
    cin >> n;

    cout << "Number of ways to climb: " << climbStairs(n);
    return 0;
}
