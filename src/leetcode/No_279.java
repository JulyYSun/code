package leetcode;
/*
    Created by YS
    2020/10/17 22:56
*/

import java.util.Arrays;

public class No_279 {
    public int numSquares(int n) {
        int index=(int)Math.sqrt(n)+1;
        int[] dp=new int[n+1];

        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        int[] sqrts=new int[index];
        for(int i=1;i<index;i++){
            sqrts[i]=i*i;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<index;j++){
                if(i<sqrts[j])
                    break;
                dp[i]=Math.min(dp[i],dp[i-sqrts[j]]+1);
            }

        }
        return dp[n];


    }

}
