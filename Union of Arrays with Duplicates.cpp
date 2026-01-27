#include <vector>
#include <unordered_set>
#include <algorithm>
using namespace std;

class Solution {
public:
    vector<int> findUnion(vector<int>& a, vector<int>& b) {
        unordered_set<int> seen;
        
        for (int num : a) {
            seen.insert(num);
        }
        
        for (int num : b) {
            seen.insert(num);
        }
        
        vector<int> result(seen.begin(), seen.end());
        sort(result.begin(), result.end());
        
        return result;
    }
};
