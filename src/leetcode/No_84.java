package leetcode;

/**
 * Created by YS
 * 2020/12/18 17:34
 */

public class No_84 {
    public int largestRectangleArea(int[] heights) {
        int ans=0;
        for(int i=0;i<heights.length;i++){
            int min=Integer.MAX_VALUE;
            for(int j=i;j<heights.length;j++){
                min=Math.min(min,heights[j]);
                ans=Math.max(ans,(j-i+1)*min);
            }
        }
        return ans;
    }
}
