package leetcode;
/*
    Created by YS
    2020/11/1 11:20
*/

import java.util.Arrays;

public class No_414 {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int result=Integer.MIN_VALUE;
        if(nums.length<3)
            result= nums[nums.length-1];
        int k=0;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i-1]<nums[i])
                k++;
            if(k==3)
                result= nums[i-1];
        }


           return result;

    }
}
