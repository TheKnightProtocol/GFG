import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read number of elements
        int n = scanner.nextInt();
        
        // Calculate sum
        long sum = 0L;
        for (int i = 0; i < n; i++) {
            sum += scanner.nextLong();
        }
        
        System.out.println(sum);
        scanner.close();
    }
}
