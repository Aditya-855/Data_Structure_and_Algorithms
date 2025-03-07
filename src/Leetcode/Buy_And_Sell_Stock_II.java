package Leetcode;

public class Buy_And_Sell_Stock_II {
    // Method to calculate maximum profit from stock prices
    public int maxProfit(int[] prices) {
        int n = prices.length;  // Get the length of the price array
        int profit = 0;  // Initialize profit to 0

        // Loop through the array from the second day onwards
        for (int i = 1; i < n; i++) {
            // If today's price is greater than yesterday's price, we make a profit
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];  // Add profit from this transaction
            }
        }
        return profit;  // Return the total profit
    }

    // Main method to test the maxProfit function
    public static void main(String[] args) {
        Buy_And_Sell_Stock_II solution = new Buy_And_Sell_Stock_II(); // Create an instance of Solution class

        // Example test case: Stock prices on different days
        int[] prices = {7, 1, 5, 3, 6, 4};

        // Call maxProfit method and print the result
        int maxProfit = solution.maxProfit(prices);
        System.out.println("Maximum Profit: " + maxProfit);
    }
}
