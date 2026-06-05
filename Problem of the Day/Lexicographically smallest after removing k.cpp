#include <string>
using namespace std;

class Solution {
public:
    string lexicographicallySmallest(string s, int k) {
        int n = s.size();
        if ((n & (n - 1)) == 0) k /= 2;
        else k *= 2;
        if (k > n || k == n) return "-1";
        if (k == 0) return s;
        int toRemove = k;
        string res;
        for (char c : s) {
            while (toRemove > 0 && !res.empty() && res.back() > c) {
                res.pop_back();
                --toRemove;
            }
            res.push_back(c);
        }
        if (toRemove > 0) res.resize(res.size() - toRemove);
        return res.empty() ? "-1" : res;
    }
};
