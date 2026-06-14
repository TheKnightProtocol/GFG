import java.util.*;

class Solution {
    public List<Integer> exitPoint(int[][] mat) {
        int n = mat.length, m = mat[0].length, r = 0, c = 0, d = 0;
        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
        while (true) {
            if (mat[r][c] == 1) {
                d = (d + 1) % 4;
                mat[r][c] = 0;
            }
            int nr = r + dir[d][0], nc = c + dir[d][1];
            if (nr < 0 || nr >= n || nc < 0 || nc >= m) {
                return Arrays.asList(r, c);
            }
            r = nr;
            c = nc;
        }
    }
}
