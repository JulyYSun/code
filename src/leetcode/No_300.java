package leetcode;

import java.util.Arrays;

/**
 * Created by YS
 * 2020/12/22 12:38
 */

public class No_300 {
    public int lengthOfLIS(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,1);
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int max=0;
        for(int d:dp){
            if(d>max)
                max=d;
        }
        return max;
    }
}
