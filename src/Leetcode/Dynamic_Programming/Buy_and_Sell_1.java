package Leetcode.Dynamic_Programming;

public class Buy_and_Sell_1 {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;//buying
        int maxPro=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrice){ //buying  at min Price
                minPrice=prices[i];
            }else if(prices[i] - minPrice > maxPro){ //Price at a particular position - minPrice is Greater than max pro then -->
                maxPro=prices[i]-minPrice;
            }
        }
        return maxPro;
    }
}
