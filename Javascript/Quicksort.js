function quickSort(arr) {
    if (arr.length <= 1) return arr;
    const pivot = arr[arr.length - 1];
    const left = arr.filter(x => x < pivot);
    const right = arr.filter(x => x > pivot);
    const equal = arr.filter(x => x === pivot);
    return [...quickSort(left), ...equal, ...quickSort(right)];
}

console.log(quickSort([10, 3, 8, 15, 6, 1]));
