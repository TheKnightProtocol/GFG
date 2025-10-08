class Solution {
    public int missingNum(int[] arr) {  // Method name is missingNum
        int n = arr.length + 1;
        long totalSum = (long) n * (n + 1) / 2;
        long arrSum = 0;
        for (int num : arr) {
            arrSum += num;
        }
        return (int) (totalSum - arrSum);
    }
}

// Usage:
// System.out.println(new Solution().missingNum(arr));
