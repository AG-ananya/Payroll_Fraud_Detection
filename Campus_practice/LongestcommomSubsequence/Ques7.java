
public class Ques7 {
        /*
         Number of distinct subqeuence
         */
    public static int numDistinct(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        // Edge case
        if (n == 0) return 1;

        int[][] dp = new int[m + 1][n + 1];

        // Base: empty target string s2 → only 1 way (delete all)
        for (int i = 0; i <= m; i++) {
            dp[i][0] = 1;
        }

        // Fill table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        String s1 = "babgbag";
        String s2 = "bag";

        int result = numDistinct(s1, s2);
        System.out.println("Number of distinct subsequences: " + result);
    }
}

