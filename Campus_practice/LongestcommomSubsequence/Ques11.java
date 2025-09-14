

public class Ques11 {
    /*
    Longest common substring but matched charcter must be contiguous
     */
    public static int longestCommonSubstring(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];

        int maxLen = 0; // final answer

        // Fill the dp table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    maxLen = Math.max(maxLen, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String s1 = "abcdfgh";
        String s2 = "abedfghr";
        int result = longestCommonSubstring(s1, s2);
        System.out.println("Longest Common Substring Length: " + result);
    }
}
