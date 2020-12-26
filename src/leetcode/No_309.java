package leetcode;

/**
 * Created by YS
 * 2020/12/18 14:51
 */

public class No_309 {
    public int maxProfit(int[] prices) {
        int dp0=0;
        int dp1=Integer.MIN_VALUE;
        int dp_pre=0;
        for(int i=0;i<prices.length;i++){
            int temp=dp0;
            dp0= Math.max(dp0,dp1+prices[i]);
            dp1=Math.max(dp1,dp_pre-prices[i]);
            dp_pre=temp;
        }
        return dp0;
    }
}
