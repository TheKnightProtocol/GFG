#include <vector>
#include <algorithm>
using namespace std;

class Solution {
public:
    vector<int> constructList(vector<vector<int>>& queries) {
        int xr = 0;
        vector<int> res;
        for (int i = queries.size() - 1; i >= 0; --i) {
            if (queries[i][0] == 0) {
                res.push_back(queries[i][1] ^ xr);
            } else {
                xr ^= queries[i][1];
            }
        }
        res.push_back(0 ^ xr);
        sort(res.begin(), res.end());
        return res;
    }
};
