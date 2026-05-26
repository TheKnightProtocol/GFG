class Solution {
    public int findMaxSum(int[] arr) {
        int prev2 = 0; // max loot up to two houses before
        int prev1 = 0; // max loot up to previous house
        for (int num : arr) {
            int curr = Math.max(prev1, prev2 + num);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}
