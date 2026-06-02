#include <vector>
#include <algorithm>
using namespace std;

class Solution {
public:
    int sumDiffPairs(vector<int>& arr, int k) {
        sort(arr.begin(), arr.end());
        int a = 0, b = 0;
        for (int i = 1; i < arr.size(); i++) {
            int c = b;
            if (arr[i] - arr[i - 1] < k)
                c = max(c, a + arr[i] + arr[i - 1]);
            a = b;
            b = c;
        }
        return b;
    }
};
