package leetcode;

/**
 * Created by YS
 * 2020/12/18 15:03
 */

public class No_188 {
    public int maxProfit(int k, int[] prices) {
        int n=prices.length;
        int[][][] dp=new int[n][k+1][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<k+1;j++){
                dp[i][j][0]=0;
                dp[i][j][1]=Integer.MIN_VALUE;
            }
        }

        for(int i=1;i<n;i++){
            for(int j=k;j>=1;j--){
                dp[i][j][0]=Math.max(dp[i-1][j][0],dp[i-1][j][1]+prices[i]);
                dp[i][j][1]=Math.max(dp[i-1][j][1],dp[i-1][j-1][0]-prices[i]);
            }
        }
        return dp[n-1][k][0];
    }
}
