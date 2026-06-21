class Solution {
    public String chooseSwap(String s) {
        int n = s.length();

        int[] first = new int[26];

        for (int i = 0; i < n; i++) {
            int c = s.charAt(i) - 'a';

            if (first[c] == 0) {
                first[c] = (i + 1);
            }
        }

        int left = -1;
        int right = -1;
        int bestPos = n;

        for (int a = 0; a < 26; a++) {
            if (first[a] == 0) continue;

            int posA = first[a];

            for (int b = a + 1; b < 26; b++) {
                if (first[b] == 0) continue;

                int posB = first[b];

                /*
                 * If the larger character appears earlier,
                 * swapping improves the string.
                 */
                if (posB < posA && posB < bestPos) {
                    bestPos = posB;
                    left = b;
                    right = a;
                }
            }
        }

        if (left == -1) return s;

        char c1 = (char) ('a' + left);
        char c2 = (char) ('a' + right);

        char[] ans = s.toCharArray();

        for (int i = 0; i < n; i++) {
            if (ans[i] == c1) {
                ans[i] = c2;
            } else if (ans[i] == c2) {
                ans[i] = c1;
            }
        }

        return new String(ans);
    }
}
 
