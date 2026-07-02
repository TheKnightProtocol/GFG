#include <vector>
using namespace std;

class Solution {
	public:
	bool divisibleByK(vector<int>& arr, int k) {
		// code here
		if (arr.size() > k)
			return true;
		vector<bool> dp(k, false);
		for (int x : arr) {
			int rem = (x % k + k) % k;
			for (int r = k - 1; r >= 0; r--) {
				if (dp[r]) dp[(r + rem)
					% k] = true;
			}
			dp[rem] = true;
			if (dp[0])
				return true;
		}
		return dp[0];
	}
};
