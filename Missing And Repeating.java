import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> findTwoElement(int[] arr) {
        int n = arr.length;
        int duplicate = -1;
        int missing = -1;
        
        // Mark visited numbers by making them negative
        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]) - 1;
            
            if (arr[index] < 0) {
                duplicate = Math.abs(arr[i]);
            } else {
                arr[index] = -arr[index];
            }
        }
        
        // Find the missing number (the index that remains positive)
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                missing = i + 1;
                break;
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        result.add(duplicate);
        result.add(missing);
        return result;
    }
}
