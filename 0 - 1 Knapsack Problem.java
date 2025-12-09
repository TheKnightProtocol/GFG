import java.util.*;

class Solution {
    public int knapsack(int W, int[] val, int[] wt) {
        int n = val.length;
        int[] dp = new int[W + 1];
        
        for (int i = 0; i < n; i++) {
            // Traverse from right to left to avoid overwriting needed values
            for (int w = W; w >= wt[i]; w--) {
                dp[w] = Math.max(dp[w], val[i] + dp[w - wt[i]]);
            }
        }
        
        return dp[W];
    }
}
