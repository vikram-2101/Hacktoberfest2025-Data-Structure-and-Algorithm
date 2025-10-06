# BinarySearch.py
# Implementation of Binary Search (Iterative approach)

def binary_search(arr, target):
    """
    Performs binary search on a sorted array to find the target element.
    
    Parameters:
        arr (list): Sorted list of elements to search from.
        target (any): Element to search for in the array.
    
    Returns:
        int: Index of target element if found, else -1.
    """

    left, right = 0, len(arr) - 1

    while left <= right:
        mid = (left + right) // 2  # Middle index
        if arr[mid] == target:
            return mid  # Found target
        elif arr[mid] < target:
            left = mid + 1  # Search right half
        else:
            right = mid - 1  # Search left half

    return -1  # Target not found


# Example usage:
if __name__ == "__main__":
    arr = [1, 3, 5, 7, 9]
    target = 5
    result = binary_search(arr, target)
    print(result)  # Output: 2
