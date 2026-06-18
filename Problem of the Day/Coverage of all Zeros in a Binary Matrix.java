class Solution {
    public int findCoverage(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int totalCoverage = 0;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 0) {
                    for (int k = i - 1; k >= 0; k--) {
                        if (mat[k][j] == 1) {
                            totalCoverage++;
                            break;
                        }
                    }
                    for (int k = i + 1; k < rows; k++) {
                        if (mat[k][j] == 1) {
                            totalCoverage++;
                            break;
                        }
                    }
                    for (int k = j - 1; k >= 0; k--) {
                        if (mat[i][k] == 1) {
                            totalCoverage++;
                            break;
                        }
                    }
                    for (int k = j + 1; k < cols; k++) {
                        if (mat[i][k] == 1) {
                            totalCoverage++;
                            break;
                        }
                    }
                }
            }
        }
        return totalCoverage;
    }
}
