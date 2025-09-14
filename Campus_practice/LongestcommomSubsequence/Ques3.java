public class Ques3 {

    // Function to find LCS length
    public static int lcs(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];

        // Fill the dp table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[m][n];
    }

    // Function to find the length of Shortest Common Supersequence
    public static int shortestCommonSupersequenceLength(String s1, String s2) {
        int lcsLen = lcs(s1, s2);
        return s1.length() + s2.length() - lcsLen;
    }

    public static void main(String[] args) {
        String s1 = "bbabcbcab";
        String s2 = "aabcbcab";
        int scsLength = shortestCommonSupersequenceLength(s1, s2);
        System.out.println("Shortest Common Supersequence length: " + scsLength);
    }
}
