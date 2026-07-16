class Solution {
    int dp[10][82];
    int f(int n,int s){
        if(s<0) return 0;
        if(!n) return s==0;
        if(dp[n][s]!=-1) return dp[n][s];
        dp[n][s]=0;
        for(int i=0;i<10;i++) dp[n][s]+=f(n-1,s-i);
        return dp[n][s];
    }
public:
    int countWays(int n,int sum){
        if(sum<1||sum>9*n) return -1;
        memset(dp,-1,sizeof(dp));
        int ans=0;
        for(int i=1;i<10;i++) ans+=f(n-1,sum-i);
        return ans?ans:-1;
    }
};
