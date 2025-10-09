
// QuickSort.js
// QuickSort implementation in JavaScript ⚡

function quickSort(arr) {
    if (arr.length <= 1) return arr; // Base case
  
    const pivot = arr[arr.length - 1]; // Choose last element as pivot
    const left = [];
    const right = [];
  
    for (let i = 0; i < arr.length - 1; i++) {
      if (arr[i] < pivot) {
        left.push(arr[i]);
      } else {
        right.push(arr[i]);
      }
    }
  
    return [...quickSort(left), pivot, ...quickSort(right)];
  }
  
  const nums = [10, 7, 8, 9, 1, 5];
  console.log(quickSort(nums)); // [1, 5, 7, 8, 9, 10]
  