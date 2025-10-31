import math
length = int(input("Enter the length of the list: "))
my_list = [None] * length
for i in range(length):
    num = int(input(f"Enter the {i+1}th item: "))
    my_list[i] = num

print(my_list)

target = int(input("Enter the target element: "))
s = 0
l = length-1
found = 0

while(s <= l):
    mid = math.floor((s+l)/2)
    if(target == my_list[mid]):
        found = 1
        pos = mid
        break
    elif(target > my_list[mid]):
        s = mid+1
    elif(target < my_list[mid]):
        l = mid-1
if(found == 1):
    print("Element found at position", pos)
else:
    print("Element not found!")
