package nowcoder;

/**
 * Created by YS
 * 2020/12/9 22:56
 */

public class NC7 {
    public int maxProfit (int[] prices) {
        // write code here
        if(prices==null|| prices.length<=1)
            return 0;
        int buy=prices[0];
        int max=0;
        for(int i=0;i<prices.length;i++){
            buy=Math.min(buy,prices[i]);
            max=Math.max(max,prices[i]-buy);
        }
        return max;

    }
}
