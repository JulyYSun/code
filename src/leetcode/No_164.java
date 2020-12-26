package leetcode;

import java.util.Arrays;

/**
 *Created by YS
 *2020/11/26 22:54
 */
public class No_164 {
    public int maximumGap(int[] nums) {
        int max=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            int cur_max=nums[i+1]-nums[i];
            max=Math.max(cur_max,max);
        }
        return max;
    }
}











