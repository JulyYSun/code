package leetcode;
/*
    Created by YS
    2020/6/8 22:49
*/

import java.util.Arrays;

public class No_322 {
    public static int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for (int i = 1; i < dp.length; i++) {
            for(int coin :coins){
                if(i-coin>=0)
                    dp[i]=Math.min(dp[i],dp[i-coin]+1);
            }
        }
        return dp[amount]==amount+1? -1:dp[amount];

    }

    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{1,2,5},11));
    }
}
