
public class Ques6 {
        /*
        Subsequence pattern  matching
        check if s1 is a subsequence of s2. Useful in streaming data checks or filters. 
         */
        public static boolean isSubsequenceDP(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        // dp[i][j] = is s2[0..j-1] a subsequence of s1[0..i-1]
        boolean[][] dp = new boolean[m + 1][n + 1];

        // Empty string is always a subsequence
        for (int i = 0; i <= m; i++) {
            dp[i][0] = true;
        }

        // Fill dp table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        String s1 = "aananananannana";
        String s2 = "ananana";

        boolean result = isSubsequenceDP(s1, s2);
        System.out.println("Is subsequence (DP): " + result);
    }
}
