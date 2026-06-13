class Solution {
    private static final int MOD = 1000000007;

    public int computeValue(int n) {
        int N = 2 * n;
        long[] fact = new long[N + 1];
        fact[0] = 1;
        for (int i = 1; i <= N; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }
        long inv = modPow(fact[n], MOD - 2);
        return (int) (fact[N] * inv % MOD * inv % MOD);
    }

    private long modPow(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) res = res * a % MOD;
            a = a * a % MOD;
            b >>= 1;
        }
        return res;
    }
}
