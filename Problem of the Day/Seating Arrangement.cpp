#include <vector>
using namespace std;

class Solution {
public:
    bool canSeatAllPeople(int k, vector<int>& seats) {
        int n = seats.size();
        for (int i = 0; i < n - 1; ++i)
            if (seats[i] == 1 && seats[i + 1] == 1)
                return false;

        vector<int> arr = seats;
        int count = 0;
        for (int i = 0; i < n; ++i) {
            if (arr[i] == 0) {
                bool leftOk  = (i == 0) || (arr[i - 1] == 0);
                bool rightOk = (i == n - 1) || (arr[i + 1] == 0);
                if (leftOk && rightOk) {
                    arr[i] = 1;
                    ++count;
                }
            }
        }
        return count >= k;
    }
};
