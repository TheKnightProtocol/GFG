#include <string>
#include <cmath>

class Solution {
public:
    int getLastDigit(std::string a, std::string b) {
        if (b == "0") return 1;

        int last_a = a.back() - '0';

        int exp = 0;
        if (b.length() == 1) {
            exp = b[0] - '0';
        } else {
            exp = (b[b.length() - 2] - '0') * 10 + (b.back() - '0');
        }

        exp = exp % 4;
        if (exp == 0) exp = 4;

        return (int)std::pow(last_a, exp) % 10;
    }
}; 
