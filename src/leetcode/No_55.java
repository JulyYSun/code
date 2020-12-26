package leetcode;

/**
 * Created by YS
 * 2020/12/23 14:23
 */

public class No_55 {
    public boolean canJump(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,i+nums[i]);
            if(max<=i) return false;
        }
        return max >= nums.length - 1;
    }
}
