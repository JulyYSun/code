package leetcode;
/*
    Created by YS
    2020/10/14 14:43
*/

import java.util.Arrays;

public class No_268 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int result=-1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]!=(nums[i]+1))
                result=nums[i]+1;
        }

        if(nums[0]!=0)
            result=0;
        else if(result==-1)
            result=nums.length;
        return result;
    }
}
