package leetcode;

import java.util.HashSet;

/**
 * Created by YS
 * 2020/12/20 10:53
 */

public class No_5630 {
    public int maximumUniqueSubarray(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int max=0;
        int sum=0;
        for(int i=0;i<nums.length-1;i++){
            sum=nums[i];
            HashSet set=new HashSet();
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==nums[i]||set.contains(nums[j]))
                    break;
                sum+=nums[j];
                set.add(nums[j]);
            }
            if(sum>max)
                max=sum;
        }
        return sum;
    }
}
