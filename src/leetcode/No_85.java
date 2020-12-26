package leetcode;

/**
 * Created by YS
 * 2020/12/26 10:57
 */

public class No_85 {
    public int maximalRectangle(char[][] matrix) {
        int m=matrix.length;
        if(m==0)
            return 0;
        int n=matrix[0].length;
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]=='1'){
                    dp[i][j]= j==0? 1:dp[i][j-1]+1;
                }
            }
        }
        int max=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]=='0')
                    continue;
                int width=dp[i][j];
                for(int k=i;k>=0;k--){
                    width=Math.min(width,dp[k][j]);
                    max=Math.max(max,width*(i-k+1));
                }
            }
        }
        return max;
    }
}
