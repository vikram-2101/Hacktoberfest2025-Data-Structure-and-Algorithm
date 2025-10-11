#include <iostream>
#include <vector>

// (Insert the binarySearchIterative and binarySearchRecursive functions from above here)

// --- Iterative Function ---
int binarySearchIterative(const std::vector<int>& arr, int target) {
    int left = 0;
    int right = arr.size() - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) return mid;
        if (arr[mid] < target) left = mid + 1;
        else right = mid - 1;
    }
    return -1;
}

// --- Recursive Function ---
int binarySearchRecursive(const std::vector<int>& arr, int target, int left, int right) {
    if (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) return mid;
        if (arr[mid] > target) return binarySearchRecursive(arr, target, left, mid - 1);
        return binarySearchRecursive(arr, target, mid + 1, right);
    }
    return -1;
}


int main() {
    // A sorted array is required for binary search
    std::vector<int> sorted_data = {3, 9, 10, 27, 38, 43, 82};

    // --- Sample 1: Element is present ---
    int target1 = 43;
    std::cout << "Searching for " << target1 << "..." << std::endl;

    // Using iterative version
    int index_iterative = binarySearchIterative(sorted_data, target1);
    if (index_iterative != -1) {
        std::cout << "  Iterative: Found at index " << index_iterative << std::endl;
    }

    // Using recursive version
    int index_recursive = binarySearchRecursive(sorted_data, target1, 0, sorted_data.size() - 1);
    if (index_recursive != -1) {
        std::cout << "  Recursive: Found at index " << index_recursive << std::endl;
    }

    std::cout << "\n-----------------------------\n" << std::endl;

    // --- Sample 2: Element is NOT present ---
    int target2 = 50;
    std::cout << "Searching for " << target2 << "..." << std::endl;

    // Using iterative version
    index_iterative = binarySearchIterative(sorted_data, target2);
    if (index_iterative == -1) {
        std::cout << "  Iterative: Not found" << std::endl;
    }

    // Using recursive version
    index_recursive = binarySearchRecursive(sorted_data, target2, 0, sorted_data.size() - 1);
    if (index_recursive == -1) {
        std::cout << "  Recursive: Not found" << std::endl;
    }

    return 0;
}