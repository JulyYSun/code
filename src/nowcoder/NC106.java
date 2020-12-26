package nowcoder;
/*
    Created by YS
    2020/9/24 15:11
*/

import java.util.Arrays;

public class NC106 {
    public long solve (int[] A) {
        Arrays.sort(A);
        int length=A.length-1;
        int negative=0;
        for(int i=0;i<2;i++){
            if(A[i]<0)
                negative++;
        }
        long right=(long)A[length]*(long)A[length-1]*(long)A[length-2];
        long left=(long)A[0]*(long)A[1]*(long)A[length];
        return negative<=1? right:Math.max(left,right);
    }
}
