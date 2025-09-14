public class Ques10 {
    /*
     k-Ordered Lcs
     */

    public static int kOrderedLCS(int[] A, int[] B, int k) {
        int n = A.length;
        int m = B.length;

        int[][][] dp = new int[n + 1][m + 1][k + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int c = 0; c <= k; c++) {
                    if (A[i] == B[j]) {
                        dp[i + 1][j + 1][c] = dp[i][j][c] + 1;
                    } else {
                        dp[i + 1][j + 1][c] = Math.max(dp[i + 1][j][c], dp[i][j + 1][c]);
                        if (c > 0) {
                            // Change A[i] to B[j]
                            dp[i + 1][j + 1][c] = Math.max(dp[i + 1][j + 1][c], dp[i][j][c - 1] + 1);
                        }
                    }
                }
            }
        }

        return dp[n][m][k];
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {5, 3, 1, 4, 2};
        int k = 1;

        int result = kOrderedLCS(A, B, k);
        System.out.println("K-Ordered LCS length: " + result);
    }
}
