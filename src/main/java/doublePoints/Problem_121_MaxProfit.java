package doublePoints;

public class Problem_121_MaxProfit {

    public static void main(String[] args) {
//        int[] prices= {7,1,5,3,6,4};
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices){
        if(prices.length == 0){
            return 0;
        }
        int profit = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length ; i++) {
            min = Math.min(min,prices[i]);
            profit = Math.max(profit,prices[i] - min);
        }
        return profit;
    }
}
