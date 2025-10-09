// Implement Two Sum problem solution in JS.

function twoSum(nums, target) {
    // A naive way to do this is by looping through the array twice and checking if the sum of any two elements is equal to the target
    for (let i = 0; i < nums.length; i++) {
        for (let j = i + 1; j < nums.length; j++) {
            if (nums[i] + nums[j] === target) {
                return [i, j];
            }
        }
    }
    // This can be a problem because the complexity increase expotentially with the size of the array. (complexity O(n^2))
    // A better way to do this is by using a hash map to store the elements we have seen so far

    const map = new Map();
    for (let i = 0; i < nums.length; i++) {
        const complement = target - nums[i];
        if (map.has(complement)) {
            return [map.get(complement), i];
        }
    }
}