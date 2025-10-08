/*
    AUTHOR: Parth Dhall
    Github: DarkGamer7890
    https://github.com/DarkGamer7890
*/


#include <bits/stdc++.h>
using namespace std;


void b_search_re(vector<int>& arr, int l, int r, int target){
    if(l > r){
        cout << "No such value found\n";
        return;
    }
    int mid = l + (r - l) / 2;

    if(arr[mid] > target) b_search_re(arr, l, mid - 1, target);
    else if(arr[mid] < target) b_search_re(arr, mid + 1, r, target);

    else cout << "Target found at index " << mid << endl;
}




void b_search_it(vector<int>& arr, int target){
    int l = 0, r = arr.size() - 1;
    int index = -1;

    while(l < r){
        int mid = l + (r - l) / 2;

        if(arr[mid] == target){
            index = mid;
            break;
        }
        else if(arr[mid] < target) l = mid + 1;
        else r = mid - 1;
    }

    if(index > -1) cout << "Target found at index " << index << endl;
    else cout << "No such value found\n";
}



int main(){
    vector<int> arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int target = 5;

    b_search_it(arr, target);
    b_search_re(arr, 0, arr.size() - 1, target);

    return 0;
}