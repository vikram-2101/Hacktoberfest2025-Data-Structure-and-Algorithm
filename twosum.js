/**
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 *
 * @param {number[]} nums The array of numbers.
 * @param {number} target The target sum.
 * @return {number[]} An array containing the two indices.
 */
const twoSum = (nums, target) => {
  // Create a Map to store numbers we have already seen and their indices.
  const numMap = new Map();

  // Iterate through the array.
  for (let i = 0; i < nums.length; i++) {
    const currentNum = nums[i];
    const complement = target - currentNum;

    // Check if the complement needed to reach the target exists in our map.
    if (numMap.has(complement)) {
      // If it exists, we found our pair.
      return [numMap.get(complement), i];
    }

    // If the complement is not found, add the current number and its index to the map.
    numMap.set(currentNum, i);
  }

  // In case no solution is found (though the problem guarantees one).
  return [];
};

// --- Sample Usage ---
const numbers = [2, 7, 11, 15];
const targetSum = 9;
const result = twoSum(numbers, targetSum);
console.log(result); // Output: [0, 1] because numbers[0] + numbers[1] == 9

const numbers2 = [3, 2, 4];
const targetSum2 = 6;
const result2 = twoSum(numbers2, targetSum2);
console.log(result2); // Output: [1, 2]


/*How It Works 🧠
The algorithm is elegant and efficient. Instead of comparing every number with every other number (a slow, O(n 
2
 ) approach), it uses a hash map (Map in JavaScript) to keep track of the numbers it has already seen.

Initialize a Map: We create an empty Map called numMap to store (number, index) pairs.

Iterate Through the Array: We loop through the nums array one element at a time.

Find the Complement: For each number (currentNum), we calculate its complement—the other number we would need to find to reach the target.
complement = target - currentNum

Check the Map: We then check if this complement already exists as a key in our numMap.

If it exists, we've found our solution! The value associated with that key is the index of the complement, and our current index is i. We return both indices: [numMap.get(complement), i].

If it doesn't exist, it means we haven't seen the complement yet. We add the currentNum and its index i to the numMap for future reference and move to the next element.

This way, we only need one pass through the array to find the solution.

Complexity Analysis 📊
Time Complexity: O(n)
We iterate through the array of length n only once. Inside the loop, the operations on the Map (has, get, set) take, on average, constant time, O(1). Therefore, the total time complexity is linear.

Space Complexity: O(n)
In the worst-case scenario, we might need to store all n elements in the Map before finding the solution (for instance, if the two numbers that sum to the target are the last two in the array). This means the space required grows linearly with the size of the input array.*/
