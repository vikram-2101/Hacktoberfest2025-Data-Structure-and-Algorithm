#include <iostream>
#include <vector>

// Iterative Binary Search Implementation
// Returns the index of the target if found, otherwise -1.
int binarySearchIterative(const std::vector<int>& arr, int target) {
    int left = 0;
    int right = arr.size() - 1;

    while (left <= right) {
        // Calculate mid-point to prevent potential integer overflow
        int mid = left + (right - left) / 2;

        // If the target is at the middle, we've found it
        if (arr[mid] == target) {
            return mid;
        }

        // If the target is greater, ignore the left half
        if (arr[mid] < target) {
            left = mid + 1;
        }
        // If the target is smaller, ignore the right half
        else {
            right = mid - 1;
        }
    }

    // If we reach here, the element was not present
    return -1;
}