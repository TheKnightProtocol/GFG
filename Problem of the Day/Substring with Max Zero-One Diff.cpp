#include <string>
#include <algorithm>
using namespace std;

class Solution {
public:
    int maxSubstring(string s) {
        int maxSum = -1, cur = 0;
        for (char c : s) {
            int val = (c == '0') ? 1 : -1;
            cur = max(val, cur + val);
            maxSum = max(maxSum, cur);
        }
        return maxSum;
    }
};
