package leetcode;

/**
 * Created by YS
 * 2020/12/18 19:19
 */

public class No_213 {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)
            return nums[0];
        return Math.max(robRange(nums,0,n-2),robRange(nums,1,n-1));
    }

    public int robRange(int[] nums,int start,int end) {
        int prev=0;
        int cur=0;
        for(int i=start;i<=end;i++){
            int temp=Math.max(cur,prev+nums[i]);
            prev=cur;
            cur=temp;
        }
        return cur;
    }
}
