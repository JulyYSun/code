package leetcode;
/*
    Created by YS
    2020/10/22 12:48
*/

public class No_739 {
    public int[] dailyTemperatures(int[] T) {
        for(int i=0;i<T.length;i++){
            int count=0;
            int j=i;
            for(j=i;j<T.length;j++){
                if (T[j]>T[i]){
                    T[i]=count;
                    break;
                }
                else
                    count++;
            }
            if(j==T.length)
                T[i]=0;
        }
        return T;
    }
}
