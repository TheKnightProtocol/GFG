#include <string>
using namespace std;

class Solution {
public:
    int findEqualPoint(string s) {
        int closeCount = 0;
        for (char c : s)
            if (c == ')') closeCount++;
        return closeCount;
    }
};
