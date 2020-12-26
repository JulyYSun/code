package leetcode;

import java.util.Arrays;

/**
 * Created by YS
 * 2020/11/23 14:27
 */
public class No_452 {
    public int findMinArrowShots(int[][] points) {
        int result=1;
//        按照右侧大小排序
        Arrays.sort(points,(a,b)->a[1]>b[1]?1:-1);
        int last=points[0][1];
//        如果下一个区间的左侧大于last，说明箭数加一，并更新last
        for(int[] p :points){
            if(p[0]>last){
                result++;
                last=p[1];
            }
        }
        return result;
    }
}
