class Solution {
public:
    long long numOfWays(int n, int m) {
        long long cells = 1LL * n * m;
        long long total = cells * (cells - 1);
        long long attacks = 0;
        int dx[8] = {2,2,-2,-2,1,1,-1,-1};
        int dy[8] = {1,-1,1,-1,2,-2,2,-2};
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                for (int k = 0; k < 8; ++k) {
                    int x = i + dx[k];
                    int y = j + dy[k];
                    if (x >= 0 && x < n && y >= 0 && y < m)
                        ++attacks;
                }
            }
        }
        return total - attacks;
    }
};
