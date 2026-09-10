class Solution {
    public int pairCount(int x, int y) {
        // code here
        if ( y % x != 0) return 0;
        int n = y/x;
        int k = 0;
        for (int p =2; p * p <=n; p++){
            if( n % p ==0){
                k++;
                while(n % p ==0) n /= p;
            }
        }
        if (n > 1) k++;
        return 1 << k;
    }
}
