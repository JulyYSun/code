package leetcode;

/**
 * Created by YS
 * 2020/12/25 11:31
 */

public class No_416 {
    public boolean canPartition(int[] nums) {
        int sum=0,n= nums.length;
        for(int num:nums)
            sum+=num;
        if(sum%2!=0) return false;
        sum=sum/2;
        boolean[] dp=new boolean[sum+1];
        dp[0]=true;
        for(int i=0;i<n;i++){
            for(int j=sum;j>=0;j--)
                if(j-nums[i]>=0)
                    dp[j]=dp[j]||dp[j-nums[i]];
        }
        return dp[sum];
    }
}
