class Solution {
public:
    int countPairs(vector<int>& arr, int k) {
        sort(arr.begin(), arr.end());
        int n = arr.size();
        int j = 0;
        int ans = 0;
        
        for (int i = 0; i < n; i++) {
            // Advance j as far right as possible while the difference is strictly less than k
            while (j < n && arr[j] - arr[i] < k) {
                j++;
            }
            // Add the count of valid elements between i and j-1
            ans += (j - i - 1);
        }
        
        return ans; // Returned AFTER processing all elements
    }
};
