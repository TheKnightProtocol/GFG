public class Solution {
    public static int perfectSum(int[] arr, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        
        for (int num : arr) {
            for (int j = target; j >= num; j--) {
                dp[j] += dp[j - num];
            }
        }
        
        return dp[target];
    }
    
    public static void main(String[] args) {
        int[] arr1 = {5, 2, 3, 10, 6, 8};
        int target1 = 10;
        System.out.println(perfectSum(arr1, target1));
        
        int[] arr2 = {2, 5, 1, 4, 3};
        int target2 = 10;
        System.out.println(perfectSum(arr2, target2));
        
        int[] arr3 = {5, 7, 8};
        int target3 = 3;
        System.out.println(perfectSum(arr3, target3));
        
        int[] arr4 = {35, 2, 8, 22};
        int target4 = 0;
        System.out.println(perfectSum(arr4, target4));
    }
}
