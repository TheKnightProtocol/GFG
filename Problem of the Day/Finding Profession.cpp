class Solution {
public:
    string profession(int level, int pos) {
        long long p = pos - 1;
        int bits = __builtin_popcountll(p);
        return (bits % 2 == 0) ? "Engineer" : "Doctor";
    }
};
