class Solution {
    public int evenlyDivides(int N) {
        int original = N;
        int count = 0;
        while (N > 0) {
            int digit = N % 10;
            if (digit != 0 && original % digit == 0) {
                count++;
            }
            N /= 10;
        }
        return count;
    }
}
