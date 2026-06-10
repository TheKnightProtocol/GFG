#include <vector>
#include <algorithm>
#include <climits>
using namespace std;

class Solution {
public:
    int binarySearchable(vector<int>& arr) {
        return dfs(arr, 0, arr.size() - 1, INT_MIN, INT_MAX);
    }
private:
    int dfs(vector<int>& arr, int l, int r, int min_val, int max_val) {
        if (l > r) return 0;
        int mid = l + (r - l) / 2;
        int cnt = 0;
        if (arr[mid] > min_val && arr[mid] < max_val) cnt = 1;
        cnt += dfs(arr, l, mid - 1, min_val, min(max_val, arr[mid]));
        cnt += dfs(arr, mid + 1, r, max(min_val, arr[mid]), max_val);
        return cnt;
    }
};
