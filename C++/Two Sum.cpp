/*
We use a hash map to store elements and their indices as we iterate through the array. 
For each element, we check if its complement (target - current element) already exists in the map. 
If it does, we return the indices of the pair. 
If the loop finishes without finding a pair, we return an empty array.
*/

#include <bits/stdc++.h>
using namespace std;

vector<int> twoSum(const vector<int>& nums, int target) {
    unordered_map<int, int> mpp;
    
    for (int i = 0; i < nums.size(); i++) {
        int complement = target - nums[i];
        if (mpp.find(complement) != mpp.end()) {  // If such pairs exist in map
            return {mpp[complement], i};         // return them
        }
        mpp[nums[i]] = i;
    }

    return {};  // No solution found
}

int main() {
    int n, target;
    cin>>n>>target;
    vector<int> nums(n);
    vector<int> result = twoSum(nums, target);
    
    if (!result.empty()) {
        cout << "Indices: " << result[0] << " and " << result[1] << endl;
    } else {
        cout << "No pair found.\n";
    }
    return 0;
}


// TC : O(N)
// SC : O(N)
