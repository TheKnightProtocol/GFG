class Solution {
    public void sort012(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        
        while (mid <= high) {
            if (arr[mid] == 0) {
                // Swap arr[low] and arr[mid]
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                // Swap arr[mid] and arr[high]
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
}
