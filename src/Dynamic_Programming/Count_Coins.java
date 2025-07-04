package Dynamic_Programming;

public class Count_Coins {
    static int count(int[] coins, int sum) {
        int n = coins.length;
        // 2d dp array where n is the number of coin
        // denominations and sum is the target sum
        int[][] dp = new int[n + 1][sum + 1];
        // Represents the base case where the target sum is 0,
        // and there is only one way to make change: by not
        // selecting any coin
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {

                // Add the number of ways to make change without
                // using the current coin
                dp[i][j] += dp[i - 1][j];

                if ((j - coins[i - 1]) >= 0) {

                    // Add the number of ways to make change
                    // using the current coin
                    dp[i][j] += dp[i][j - coins[i - 1]];
                }
            }
        }
        return dp[n][sum];
    }
    public static void main(String[] args) {
        int[] coins = {1,3,4,5};
        int sum = 7;
        System.out.println(count(coins, sum));
    }
}