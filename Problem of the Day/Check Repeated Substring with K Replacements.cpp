class Solution {
public:
    bool canConvert(string s, int k) {
        int n = s.size();
        if (n % k) return false;
        unordered_map<string, int> freq;
        for (int i = 0; i < n; i += k) freq[s.substr(i, k)]++;
        int maxFreq = 0;
        for (auto &p : freq) maxFreq = max(maxFreq, p.second);
        return maxFreq >= n / k - 1;
    }
};
