import java.util.*;

class Solution {
    public int validGroups(String s) {
        int n = s.length();
        int[] digits = new int[n];
        for (int i = 0; i < n; i++) digits[i] = s.charAt(i) - '0';
        int maxSum = 9 * n;
        long[][] dp = new long[n + 1][maxSum + 1];
        long[][] cum = new long[n + 1][maxSum + 1];
        dp[0][0] = 1;
        for (int k = 0; k <= maxSum; k++) {
            cum[0][k] = (k == 0 ? dp[0][0] : cum[0][k - 1] + dp[0][k]);
        }
        for (int i = 1; i <= n; i++) {
            int prefixSum = 0;
            for (int j = i; j >= 1; j--) {
                prefixSum += digits[j - 1];
                int curSum = prefixSum;
                if (curSum > maxSum) break;
                long ways = cum[j - 1][curSum];
                dp[i][curSum] += ways;
            }
            for (int k = 0; k <= maxSum; k++) {
                cum[i][k] = (k == 0 ? dp[i][0] : cum[i][k - 1] + dp[i][k]);
            }
        }
        long ans = 0;
        for (int k = 0; k <= maxSum; k++) ans += dp[n][k];
        return (int) ans;
    }
}
