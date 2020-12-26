package leetcode;

/**
 * Created by YS
 * 2020/12/17 10:27
 */

public class No_714 {
    public int maxProfit(int[] prices, int fee) {
        int[] dp=new int[2];
        dp[0]=0;
        dp[1]=-prices[0];
        for(int i=1;i<prices.length;i++){
            int temp=dp[0];
            dp[0]=Math.max(dp[0],dp[1]+prices[i]-fee);
            dp[1]=Math.max(dp[1],temp-prices[i]);
        }
        return dp[0];
    }
}
