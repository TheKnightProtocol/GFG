class Solution {
public:
    int countKdivPairs(vector<int>& arr, int k) {
        if(arr.size() == 1){
            return 0;
        }
        sort(arr.begin(),arr.end());
        int count[1000001] = {0};
        count[arr[0]]++;
        int cnt = 0;
        for(int i = 1;i<arr.size();i++){
            int a = arr[i]%k;
            a = k - a;
            while(a <= arr[i]){
                if(count[a] > 0){
                    cnt += count[a];
                }
                a = a + k;
            }
            count[arr[i]]++;
        }
        return cnt;
    }
};

