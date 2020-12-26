package leetcode;
/*
    Created by YS
    2020/10/31 23:07
*/

public class No_219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<=i+k;j++){
                if(j>=nums.length)
                    break;
                if(nums[i]==nums[j])
                    return true;
            }
        }
        return false;
    }
}
