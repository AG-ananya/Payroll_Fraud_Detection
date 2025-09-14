public class Ques2 {  
    /*
     find the longest palindromic subsequence.can be solved be fining LCS b/w the strings and its reverse 
     */
    // Function to find LCS
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
        return dp[m][n];  // Length of longest palindromic subsequence
    }

    // Function to find LPS
    public static int longestPalindromicSubsequence(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return lcs(str, reversed);
    }

    public static void main(String[] args) {
        String str = "bbabcbcab";
        int lpsLength = longestPalindromicSubsequence(str);
        System.out.println("Longest Palindromic Subsequence length: " + lpsLength);
    }
}

