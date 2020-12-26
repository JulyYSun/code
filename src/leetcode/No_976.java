package leetcode;

import java.util.Arrays;

/**
 * Created by YS
 * 2020/11/29 19:52
 */

public class No_976 {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for(int i=A.length-1;i>=2;i--){
            if(A[i-2]+A[i-1]>A[i])
                return A[i-2]+A[i-1]+A[i];
        }
       return 0;
    }
}
