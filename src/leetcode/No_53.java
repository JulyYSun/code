package leetcode;
/*
    Created by YS
    2020/6/2 13:02
*/

public class No_53 {
    public static int maxSubArray(int[] nums) {

        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        int max=dp[0];
        for(int i=1;i<nums.length;i++){
            dp[i]=Math.max(dp[i-1]+nums[i],nums[i]);
            if(max<dp[i])
                max=dp[i];

        }

        return max;
    }
    public int maxSubArray2(int[] nums){
        int max=nums[0];
        int sum=0;
        for(int num:nums){
            if(sum>0)
                sum+=num;
            else
                sum=num;
            max=Math.max(max,sum);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
