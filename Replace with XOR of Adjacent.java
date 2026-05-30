class Solution {
    public void replaceElements(int[] arr) {
        int n = arr.length;
        if (n == 0) return;
        
        int temp = arr[0];
        arr[0] = arr[0] ^ arr[1];
        int prev = temp;
        
        for (int i = 1; i < n - 1; i++) {
            temp = arr[i];
            arr[i] = prev ^ arr[i + 1];
            prev = temp;
        }
        
        arr[n - 1] = prev ^ arr[n - 1];
    }
}
