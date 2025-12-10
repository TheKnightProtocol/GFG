class Solution {
    public int largest(int arr[]) {
        if (arr == null || arr.length == 0) return 0;
        
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
