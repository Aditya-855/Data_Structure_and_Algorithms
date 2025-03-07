package Contest;

import java.util.*;

public class Coin_Game {
    // Function to compute the maximum sum the first player can get
    public static int getMaxSum(int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n][n]; // DP table to store solutions to subproblems

        // Filling the DP table for all possible gaps (subarrays of different sizes)
        for (int gap = 0; gap < n; gap++) {
            for (int i = 0, j = gap; j < n; i++, j++) {
                // Choices available for the first player:
                // If the first player picks coins[i], the second player can choose coins[i+1] or coins[j]
                int x = (i + 2 <= j) ? dp[i + 2][j] : 0;
                int y = (i + 1 <= j - 1) ? dp[i + 1][j - 1] : 0;
                int z = (i <= j - 2) ? dp[i][j - 2] : 0;

                // Max sum obtained by picking either the first or last coin, considering the opponent's optimal play
                dp[i][j] = Math.max(coins[i] + Math.min(x, y), coins[j] + Math.min(y, z));
            }
        }
        return dp[0][n - 1]; // Return the maximum sum the first player can get
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Read the number of coins

        // Ensure the number of coins is even
        if (n % 2 != 0) {
            System.out.println("The number of coins must be even.");
            sc.close();
            return;
        }

        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt(); // Read coin values
        }

        System.out.println(getMaxSum(coins)); // Output the maximum sum first player can obtain
        sc.close();
    }
}


