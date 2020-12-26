package leetcode;

import java.util.Arrays;

/**
 * Created by YS
 * 2020/12/20 11:05
 */

public class No_5631 {
    public static int maxResult(int[] nums, int k) {
        int[] dp=new int[nums.length+1];
        Arrays.fill(dp,Integer.MIN_VALUE);
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            for(int j=1;j<=k;j++){
                if(i-j>=0)
                    dp[i]=Math.max(dp[i],dp[i-j]+nums[i] );
            }
        }
        return dp[nums.length-1];

    }

    public static void main(String[] args) {
        System.out.println(maxResult(new int[]{1,-5,-20,4,-1,3,-6,-3},2));
    }
}
