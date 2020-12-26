package leetcode;

/**
 * Created by YS
 * 2020/12/21 21:05
 */

public class No_746 {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length];
        dp[0]=0;
        dp[1]=Math.min(cost[0],cost[1]);
        for(int i=2;i<cost.length;i++){
            dp[i]=Math.min(dp[i-2]+cost[i-1],dp[i-1]+cost[i]);
        }
        return dp[cost.length-1];
    }
    public int minCostClimbingStairs2(int[] cost) {
        int pre=0;
        int cur=Math.min(cost[0],cost[1]);
        for (int i = 2; i < cost.length; i++) {
            int temp=cur;
            cur=Math.min(pre+cost[i-1],cur+cost[i]);
            pre=cur;
        }
        return cur;
    }
}
