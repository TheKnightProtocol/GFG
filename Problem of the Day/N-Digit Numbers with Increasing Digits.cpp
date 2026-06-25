class Solution {
    vector<int> res;
    void dfs(int start, int len, int num) {
        if (!len) { res.push_back(num); return; }
        for (int d = start; d <= 9; ++d)
            dfs(d + 1, len - 1, num * 10 + d);
    }
public:
    vector<int> increasingNumbers(int n) {
        if (n > 10) return {};
        if (n == 1) { for (int i = 0; i <= 9; ++i) res.push_back(i); return res; }
        for (int d = 1; d <= 9; ++d) dfs(d + 1, n - 1, d);
        return res;
    }
};
