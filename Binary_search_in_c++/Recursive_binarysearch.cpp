// Recursive Binary Search Implementation
// Returns the index of the target if found, otherwise -1.
int binarySearchRecursive(const std::vector<int>& arr, int target, int left, int right) {
    if (left <= right) {
        int mid = left + (right - left) / 2;

        // Base case: If the element is present at the middle itself
        if (arr[mid] == target) {
            return mid;
        }

        // Recursive step: If element is smaller than mid, search the left subarray
        if (arr[mid] > target) {
            return binarySearchRecursive(arr, target, left, mid - 1);
        }

        // Recursive step: Else, search the right subarray
        return binarySearchRecursive(arr, target, mid + 1, right);
    }

    // Base case: Element is not present in the array
    return -1;
}