package leetcode;

/**
 * Created by YS
 * 2020/12/18 14:26
 */

public class No_122 {
    public int maxProfit(int[] prices) {
        int dp0=0;
        int dp1=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            int temp=dp0;
            dp0=Math.max(dp0,dp1+prices[i]);
            dp1=Math.max(dp1,temp-prices[i]);
        }
        return dp0;
    }
}
