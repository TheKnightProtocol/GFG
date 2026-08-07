class Solution {
  public:
  long long fact(int n){
    long long f = 1;
    while(n) f *= n--;
    return f;
}
    int countFriendsPairings(int n) {
        // code here
        int ans =0;
        for(int k = 0; k <= n/2; k++)
        ans += fact(n) / ((1LL<<k) * fact(k) * fact(n - 2*k));
    return ans;
    }
};
