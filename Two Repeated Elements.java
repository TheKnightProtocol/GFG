class Solution {
    public int[] twoRepeated(int[] arr) {
        int n = arr.length - 2;                     // because arr has n+2 elements
        boolean[] seen = new boolean[n + 1];        // track numbers 1..n
        int[] result = new int[2];
        int index = 0;
        for (int num : arr) {
            if (seen[num]) {                        // second occurrence
                result[index++] = num;
                if (index == 2) break;
            } else {
                seen[num] = true;                   // first occurrence
            }
        }
        return result;
    }
}
