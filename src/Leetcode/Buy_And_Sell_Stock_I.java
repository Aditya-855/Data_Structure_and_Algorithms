package Leetcode;

public class Buy_And_Sell_Stock_I {
    // Method to calculate the maximum profit from stock prices
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // Initialize minPrice to a very large value
        int maxPro = 0; // Initialize max profit to 0

        // Loop through all stock prices
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]; // Update minPrice if we find a lower price
            } else if (prices[i] - minPrice > maxPro) {
                maxPro = prices[i] - minPrice; // Calculate profit and update maxPro if it's higher
            }
        }
        return maxPro; // Return the maximum profit
    }

    // Main method to test the maxProfit function
    public static void main(String[] args) {
        Buy_And_Sell_Stock_I solution = new Buy_And_Sell_Stock_I(); // Create an instance of the Solution class

        // Example test case: Stock prices on different days
        int[] prices = {7, 1, 5, 3, 6, 4};

        // Call maxProfit method and print the result
        int maxProfit = solution.maxProfit(prices);
        System.out.println("Maximum Profit: " + maxProfit);
    }
}
