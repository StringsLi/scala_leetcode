package doublePoints;

public class Problem_123_MaxProfit {

    public static void main(String[] args) {
        int[] prices = {3,3,5,0,0,3,1,4};
        System.out.println(maxProfitIII(prices));
    }

    public static int maxProfitIII(int[] prices){
        int len = prices.length;
        if(len == 0) return 0;
        int[] currProfit = new int[len] ;
        int[] futureProfit = new int[len];
        int min = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < len ; i++) {
            min = Math.min(min,prices[i]);
            currProfit[i] = Math.max(currProfit[i-1],prices[i] - min);
        }

        int high = prices[len-1];
        for (int i = len-1; i >=0 ; i--) {
            high = Math.max(high,prices[i]);
            if(i < len -1){
                futureProfit[i] = Math.max(futureProfit[i+1],high - prices[i]);
            }
            maxProfit = Math.max(maxProfit,currProfit[i] + futureProfit[i]);
        }
        return maxProfit;
    }
}
