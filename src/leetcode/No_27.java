package leetcode;

import java.util.Arrays;

/**
 * Created by YS
 * 2020/12/8 17:31
 */

public class No_27 {
    public int removeElement(int[] nums, int val) {
        int count=nums.length;
       for(int i=0;i< nums.length;i++){
           if(nums[i]==val){
               nums[i]=Integer.MAX_VALUE;
               count--;
           }

       }
        Arrays.sort(nums);
       return count;
    }
}
