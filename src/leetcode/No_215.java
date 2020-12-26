package leetcode;
/*
    Created by YS
    2020/10/17 22:44
*/

import java.util.Arrays;

public class No_215 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
