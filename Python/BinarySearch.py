
# prerequisite -> sorted array

# Binary search works by repeatedly dividing given input space
# into half based on the value of middle element

def binary_search(arr, target):
    low, high = 0, len(arr) - 1
    
    while low <= high:
        # calculate middle element
        mid = ((high - low) // 2) + low # this form is to prevent overflow when low and high have large values
        # we can also use mid = (low + high) // 2

        # check if target equals middle element
        if arr[mid] == target:
            return mid
        elif arr[mid] < target: # here we reduce the search space to half of array from mid + 1 to len(arr)
            low = mid + 1
        else: # here we do the same just in reverse i.e from mid - 1 to start of array
            high = mid - 1

    # if we come out of loop without finding the element means it is not present in array
    # so we return -1
    return -1


def main():
    arr = [1, 3, 4, 23, 25, 64, 76, 99, 113]
    target = 23
    idx = binary_search(arr, target)
    if idx != -1:
        print(f'found element {target} at index {idx}')
    else:
        print('element does not exist in given array')

if __name__ == "__main__":
    main()

# Time complexity

# as we keep dividing the length of array by 2 each time 
# we get the time complexity for worst case as O(log2n)
# i.e O(logn) to the base 2 as we are dividing each time by 2!
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
