class Solution {
  public:
    vector<vector<int>> levelSort(vector<int>& arr) {
        // code here
        int curr  =1;
        vector<vector<int>>ans;
        vector<int>res;
        int ind = 0;
        for(auto i: arr){
            if(ind ==curr){
                sort(res.begin() , res.end());
                ans.push_back(res);
                res.clear();
                ind = 0;
                curr*=2;
            }
            ind++;
            res.push_back(i);
        }
        sort(res.begin() , res.end());
        ans.push_back(res);
        return ans;
                
    }
};
