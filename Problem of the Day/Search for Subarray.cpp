#include <vector>
using namespace std;

class Solution {
public:
    vector<int> search(vector<int>& a, vector<int>& b) {
        int n = a.size(), m = b.size(), i = 0, j = 0;
        vector<int> res, lps(m, 0);
        
        for (int k = 1, len = 0; k < m;) {
            if (b[k] == b[len]) lps[k++] = ++len;
            else if (len) len = lps[len - 1];
            else lps[k++] = 0;
        }
        
        while (i < n) {
            if (a[i] == b[j]) { i++; j++; }
            if (j == m) { res.push_back(i - j); j = lps[j - 1]; }
            else if (i < n && a[i] != b[j]) {
                if (j) j = lps[j - 1];
                else i++;
            }
        }
        return res;
    }
};
