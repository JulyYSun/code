package leetcode;

/**
 * Created by YS
 * 2020/11/28 11:00
 */

public class No_493 {
    public int reversePairs(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            for (int i1 = i+1; i1 < nums.length; i1++) {
                if(nums[i]>2*nums[i1])
                    count++;

            }
        }
        return count;
    }
}
