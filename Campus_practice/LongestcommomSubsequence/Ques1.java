public class Ques1 {
/*
 Edit distance(Levenstein Distance)
 Find the min. no. of operation(insert,delete,replace)required to convert one string to another. Used in spell Checkers, diff tools, Closely related to LCS
 */
    public static int editDistance(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                // If first string is empty
                if (i == 0) {
                    dp[i][j] = j;  // Insert all characters of str2
                }
                // If second string is empty
                else if (j == 0) {
                    dp[i][j] = i;  // Remove all characters of str1
                }
                // If last characters are same
                else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                // If last characters are different
                else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], // Replace
                                     Math.min(dp[i - 1][j],   // Remove
                                              dp[i][j - 1])); // Insert
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String args[]) {
        String str1 = "abcdef";
        String str2 = "akcdg";
        int distance = editDistance(str1, str2);
        System.out.println(distance);
    }
}
