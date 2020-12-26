package leetcode;

/**
 * Created by YS
 * 2020/12/6 21:14
 */

public class No_121 {
    public int maxProfit(int[] prices) {
        int dp0=0,dp1=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            dp0=Math.max(dp0,dp1+prices[i]);
            dp1=Math.max(dp1,-prices[i]);
        }
        return  dp0;
    }
}
