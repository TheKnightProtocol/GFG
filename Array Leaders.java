import java.util.*;

class Solution {
    public List<Integer> leaders(int[] arr) {
        List<Integer> result = new ArrayList<>();
        
        if (arr.length == 0) return result;
        
        int maxSoFar = Integer.MIN_VALUE;
        
        // Traverse from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= maxSoFar) {
                result.add(arr[i]);
                maxSoFar = arr[i];
            }
        }
        
        // Reverse to get correct order
        Collections.reverse(result);
        return result;
    }
}
