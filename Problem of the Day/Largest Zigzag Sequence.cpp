class Solution {
public:
    int zigzagSequence(vector<vector<int>>& a) {
        int n=a.size();
        for(int i=1;i<n;i++)
            for(int j=0;j<n;j++){
                int mx=0;
                for(int k=0;k<n;k++) if(k!=j) mx=max(mx,a[i-1][k]);
                a[i][j]+=mx;
            }
        return *max_element(a[n-1].begin(),a[n-1].end());
    }
};
