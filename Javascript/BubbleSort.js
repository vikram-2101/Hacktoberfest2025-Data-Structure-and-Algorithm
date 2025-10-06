function bubbleSort(arr) {
  // We use a swap variable to check if we swapped elements 
  let swap;
  let n = arr.length
  for (let i = 0; i < n - 1; i++) {
    swap = false;
    for (let j = 0; j < n - i - 1; j++) {
      //If we find elements that are not ordered we swap them and update the swap variable
      if (arr[j] > arr[j + 1]) {
        let tmp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = tmp;
        swap = true;

      }
    }
    // If there was no swap then the array is ordered and we break the loop
    if (swap == false)
      break;
  }
  return arr;

}
//Print the sorted array 
console.log(bubbleSort([5, 1, 4, 2, 8]))
