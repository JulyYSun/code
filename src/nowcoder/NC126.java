package nowcoder;

/**
 * Created by YS
 * 2020/12/17 18:27
 */

public class NC126 {
    public int minMoney (int[] arr, int aim) {
        // write code here
        int[] dp=new int[aim+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=aim+1;
        }
        for(int i=1;i<dp.length;i++){
            for(int coin : arr){
                if(i-coin<0)
                    continue;
                else {
                    dp[i]=Math.min(dp[i],dp[i-coin]+1);
                }
            }
        }
        return dp[aim]==aim+1? -1:dp[aim];
    }
}
