
public class Ques4 {
        /*
         Longest repeating subsequence
         find the longest subsequence that appear at least twice in the string but at different positions. Can be solved like LCS while i!=j
         */
    public static int longestRepeatingSubsequence(String str) {
        int n = str.length();
        int[][] dp = new int[n + 1][n + 1];

        // Fill dp table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // If characters match and indices are not same
                if (str.charAt(i - 1) == str.charAt(j - 1) && i != j) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[n][n]; // LRS length
    }

    public static void main(String[] args) {
        String str = "aabebcdd";
        int result = longestRepeatingSubsequence(str);
        System.out.println("Longest Repeating Subsequence length: " + result);
    }
    }
