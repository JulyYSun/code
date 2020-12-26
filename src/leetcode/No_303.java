package leetcode;

/**
 * Created by YS
 * 2020/12/2 14:18
 */

public class No_303 {
    private int[] nums;
    public No_303(int[] nums) {
        this.nums=nums;
    }

    public int sumRange(int i, int j) {
        int sum=0;
        for(int k=i;k<=j;k++){
            sum+=nums[k];
        }
        return sum;
    }
}
