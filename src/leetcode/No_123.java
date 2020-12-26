package leetcode;

/**
 * Created by YS
 * 2020/12/18 14:28
 */

public class No_123 {
    public int maxProfit(int[] prices) {
        int dp20=0;
        int dp21=Integer.MIN_VALUE;
        int dp10=0;
        int dp11=Integer.MIN_VALUE;
        for(int price :prices){
            dp20=Math.max(dp20,dp21+price);
            dp21=Math.max(dp21,dp10-price);
            dp10=Math.max(dp10,dp11+price);
            dp11=Math.max(dp11,-price);
        }
        return dp20;
    }
}
