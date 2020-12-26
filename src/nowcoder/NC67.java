package nowcoder;

/**
 * Created by YS
 * 2020/12/9 22:29
 */

public class NC67 {
    public int FindGreatestSumOfSubArray(int[] array) {
        int[] dp=new int[array.length];
        dp[0]=array[0];
        int max=dp[0];
        for(int i=1;i<array.length;i++){
            dp[i]=array[i]+dp[i-1];
            if(dp[i]<array[i])
                dp[i]=array[i];
            if(dp[i]>max)
                max=dp[i];
        }
        return max;
    }
}
