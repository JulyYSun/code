package leetcode;

/**
 * Created by YS
 * 2020/12/6 21:08
 */

public class No_70 {
    public int climbStairs(int n) {
        int[] steps=new int[n+1];
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        steps[1]=1;
        steps[2]=2;
        for(int i=3;i<=n;i++){
            steps[i]=steps[i-1]+steps[i-2];
        }
        return steps[n];

    }
}
