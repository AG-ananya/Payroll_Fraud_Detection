import java.util.Scanner;

public class LCS {
    //Longest common subsequence
    public static int longestCommonSubsequence(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        printLCS(dp, s1, s2);

        return dp[m][n]; 
    }
    public static void printLCS(int[][] dp, String s1, String s2) {
        StringBuilder lcs = new StringBuilder();
        int i = s1.length(), j = s2.length();
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                lcs.append(s1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        System.out.println("LCS: " + lcs.reverse().toString());
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        int lcsLength = longestCommonSubsequence(str1, str2);
        System.out.println("Length of LCS: " + lcsLength);
    }
}
