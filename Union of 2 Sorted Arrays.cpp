#include <vector>
using namespace std;

class Solution {
public:
    vector<int> findUnion(vector<int>& a, vector<int>& b) {
        vector<int> result;
        int i = 0, j = 0;
        int m = a.size(), n = b.size();
        
        while (i < m && j < n) {
            if (a[i] < b[j]) {
                if (result.empty() || result.back() != a[i]) {
                    result.push_back(a[i]);
                }
                i++;
            } else if (a[i] > b[j]) {
                if (result.empty() || result.back() != b[j]) {
                    result.push_back(b[j]);
                }
                j++;
            } else { // a[i] == b[j]
                if (result.empty() || result.back() != a[i]) {
                    result.push_back(a[i]);
                }
                i++;
                j++;
            }
        }
        
        while (i < m) {
            if (result.empty() || result.back() != a[i]) {
                result.push_back(a[i]);
            }
            i++;
        }
        
        while (j < n) {
            if (result.empty() || result.back() != b[j]) {
                result.push_back(b[j]);
            }
            j++;
        }
        
        return result;
    }
};
