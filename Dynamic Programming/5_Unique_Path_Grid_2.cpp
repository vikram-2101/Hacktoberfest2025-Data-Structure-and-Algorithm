// LEETCODE 63

#include <iostream>
#include <vector>
using namespace std;

int uniquePathsWithObstacles(vector<vector<int>>& obstacleGrid) {
    int m = obstacleGrid.size();
    int n = obstacleGrid[0].size();

    vector<vector<int>> dp(m, vector<int>(n, 0));

    // If the starting cell has an obstacle, return 0 immediately
    if (obstacleGrid[0][0] == 1) return 0;

    dp[0][0] = 1;

    // Fill the first row
    for (int j = 1; j < n; j++) {
        if (obstacleGrid[0][j] == 0)
            dp[0][j] = dp[0][j - 1];
    }

    // Fill the first column
    for (int i = 1; i < m; i++) {
        if (obstacleGrid[i][0] == 0)
            dp[i][0] = dp[i - 1][0];
    }

    // Fill the rest of the grid
    for (int i = 1; i < m; i++) {
        for (int j = 1; j < n; j++) {
            if (obstacleGrid[i][j] == 0)
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
        }
    }

    return dp[m - 1][n - 1];
}

int main() {
    int m, n;
    cout << "Enter number of rows (m): ";
    cin >> m;
    cout << "Enter number of columns (n): ";
    cin >> n;

    vector<vector<int>> obstacleGrid(m, vector<int>(n));
    cout << "Enter the grid (0 = empty, 1 = obstacle):\n";
    for (int i = 0; i < m; i++)
        for (int j = 0; j < n; j++)
            cin >> obstacleGrid[i][j];

    cout << "Number of unique paths: " << uniquePathsWithObstacles(obstacleGrid);
    return 0;
}
