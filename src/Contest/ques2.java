package Contest;
public class ques2 {
    public static int solve(int n, int[] prices, int[] profits) {
        int maxProfit = -1;

        for (int j = 1; j < n - 1; j++) {
            int bestLeftProfit = -1;
            for (int i = 0; i < j; i++) {
                if (prices[i] > prices[j]) { // Changed '<' to '>'
                    bestLeftProfit = Math.max(bestLeftProfit, profits[i]);
                }
            }
            int bestRightProfit = -1;
            for (int k = j + 1; k < n; k++) {
                if (prices[j] > prices[k]) { // Changed '<' to '>'
                    bestRightProfit = Math.max(bestRightProfit, profits[k]);
                }
            }
            if (bestLeftProfit != -1 && bestRightProfit != -1) {
                int total = bestLeftProfit + profits[j] + bestRightProfit;
                maxProfit = Math.max(maxProfit, total);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {5, 4, 3, 2, 1};
        int[] profits = {6, 4, 3, 5, 1};
        int n = prices.length;

        int result = solve(n, prices, profits);
        System.out.println(result); // Should print 15
    }
}
