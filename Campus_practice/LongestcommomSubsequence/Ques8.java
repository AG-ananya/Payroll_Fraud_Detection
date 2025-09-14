
public class Ques8 {
        /*
        mini insertion to make palindrome
         */

    // LCS between str and reverse(str) = LPS
    public static int longestPalindromicSubsequence(String str) {
        String rev = new StringBuilder(str).reverse().toString();
        int n = str.length();
        int[][] dp = new int[n + 1][n + 1];

        // Build LCS table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (str.charAt(i - 1) == rev.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        return dp[n][n]; // LPS length
    }

    // Function to get minimum insertions
    public static int minInsertionsToMakePalindrome(String str) {
        int lps = longestPalindromicSubsequence(str);
        return str.length() - lps;
    }

    public static void main(String[] args) {
        String str = "abcda";
        int minInsertions = minInsertionsToMakePalindrome(str);
        System.out.println("Minimum insertions to make palindrome: " + minInsertions);
    }
}

