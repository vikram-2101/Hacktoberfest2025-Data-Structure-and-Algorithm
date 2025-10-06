// BubbleSort.js
// Simple Bubble Sort implementation in JavaScript 🫧

// Function to perform Bubble Sort
function bubbleSort(arr) {
  let n = arr.length;
  // Outer loop for each pass
  for (let i = 0; i < n - 1; i++) {
    // Inner loop for comparing adjacent elements
    for (let j = 0; j < n - i - 1; j++) {
      if (arr[j] > arr[j + 1]) {
        // Swap if elements are in the wrong order
        [arr[j], arr[j + 1]] = [arr[j + 1], arr[j]];
      }
    }
  }
  return arr;
}

// Example usage
const input = [5, 1, 4, 2, 8];
console.log("Sorted array:", bubbleSort(input));
