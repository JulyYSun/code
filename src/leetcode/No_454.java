package leetcode;

import java.util.HashMap;

/**
 * Created by YS
 * 2020/11/27 10:52
 */

public class No_454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int count=0;
        HashMap<Integer,Integer> AB=new HashMap<>();
        for(int i=0;i<A.length;i++){
            for(int j=0;j<B.length;j++){
                int sum=A[i]+B[j];
                if(AB.containsKey(sum))
                    AB.put(sum,AB.get(sum)+1);
                else
                    AB.put(sum,1);
            }
        }
        for(int i=0;i<C.length;i++){
            for(int j=0;j<D.length;j++){
                int sum=-(C[i]+D[j]);
                if(AB.containsKey(sum))
                    count+=AB.get(sum);
            }
        }
        return count;
    }
}
