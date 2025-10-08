import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> subarraySum(int[] arr, int target) {
        int n = arr.length;
        int left = 0;
        int currentSum = 0;
        
        for (int right = 0; right < n; right++) {
            // Add current element to the window
            currentSum += arr[right];
            
            // Shrink the window from left while currentSum exceeds target
            while (currentSum > target && left <= right) {
                currentSum -= arr[left];
                left++;
            }
            
            // Check if we found the target sum
            if (currentSum == target) {
                // Return 1-based indices as ArrayList
                ArrayList<Integer> result = new ArrayList<>();
                result.add(left + 1);
                result.add(right + 1);
                return result;
            }
        }
        
        // If no subarray found
        ArrayList<Integer> result = new ArrayList<>();
        result.add(-1);
        return result;
    }
}
