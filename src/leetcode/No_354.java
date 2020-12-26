package leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by YS
 * 2020/12/22 12:52
 */

public class No_354 {
    public int maxEnvelopes(int[][] envelopes) {
        //排序，按照w升序排列，w相同按照height降序排列
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]==o2[0]? o2[1]-o1[1]:o1[0]-o2[0];
            }
        });

        int[] height=new int[envelopes.length];
        for(int i=0;i<envelopes.length;i++){
            height[i]=envelopes[i][1];
        }
        return lengthOfLIS(height);
    }
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
