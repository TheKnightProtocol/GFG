class Solution {
    public int findMaxProduct(int[] arr) {
        int MOD = 1000000007;
        int n = arr.length;
        if (n == 1) return arr[0] % MOD;
        int zero = 0, neg = 0, maxNeg = -10;
        for (int x : arr) {
            if (x == 0) zero++;
            else if (x < 0) {
                neg++;
                if (x > maxNeg) maxNeg = x;
            }
        }
        if (zero == n) return 0;
        int nonZero = n - zero;
        if (neg % 2 == 1 && nonZero == 1) return 0;
        long prod = 1;
        boolean skip = false;
        for (int x : arr) {
            if (x == 0) continue;
            if (neg % 2 == 1 && x == maxNeg && !skip) {
                skip = true;
                continue;
            }
            prod = (prod * x) % MOD;
        }
        return (int) prod;
    }
}
