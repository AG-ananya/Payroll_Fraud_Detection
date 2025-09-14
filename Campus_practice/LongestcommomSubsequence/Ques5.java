
public class Ques5 {
        /*
         Longest increasing subsequence 
         find the longest incresaing subsequence in an array of no. though not string based, 
         */
        // Seamphore perform operation on multiple thread at a time, lock is used on one at a time syncronization is handled by jvm jdv
        //basic diff b/w data hinding,data binding and abstraction
    public static int longestIncreasingSubsequence(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        
        // Initialize all values to 1
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }

        // Build the dp array
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        // Find max value in dp array
        int maxLen = 1;
        for (int val : dp) {
            maxLen = Math.max(maxLen, val);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        int lisLength = longestIncreasingSubsequence(nums);
        System.out.println("Longest Increasing Subsequence length: " + lisLength);
    }
}
