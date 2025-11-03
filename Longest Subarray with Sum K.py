import sys

def longest_subarray_with_sum_k(arr, k):
    prefix_index = {0:-1}
    max_len = 0
    s = 0
    for i, val in enumerate(arr):
        s += val
        if s - k in prefix_index:
            length = i - prefix_index[s - k]
            if length > max_len:
                max_len = length
        if s not in prefix_index:
            prefix_index[s] = i
    return max_len

def main():
    data = sys.stdin.read().strip().split()
    if not data:
        print(0)
        return
    it = iter(data)
    n = int(next(it))
    k = int(next(it))
    arr = [int(next(it)) for _ in range(n)]
    print(longest_subarray_with_sum_k(arr, k))

if __name__ == "__main__":
    main()
