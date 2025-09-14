import java.util.*;
public class coinexchange {
    //coin exchange problem
        public static int minCoins(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1); // Set to a large value
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int coins[]=new int[3];
        for(int i=0;i<3;i++){
            coins[i]=sc.nextInt();
        }
        int amount=sc.nextInt();

        int result = minCoins(coins, amount);
        if (result != -1)
            System.out.println(result);
        else
            System.out.println("Not possible");
    }
}