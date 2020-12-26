package leetcode;

/**
 * Created by YS
 * 2020/12/24 10:35
 */

public class No_135 {
    public int candy(int[] ratings) {
        int[] left=new int[ratings.length];
        int res=0;
        for(int i=0;i<left.length;i++){
            if(i>0&&ratings[i]>ratings[i-1]){
                left[i]=left[i-1]+1;
            }else {
                left[i]=1;
            }
        }
        int right=0;
        for(int i=ratings.length-1;i>=0;i++){
            if(i<ratings.length-1&&ratings[i]>ratings[i+1]){
                right+=1;
            }else {
                right=1;
            }
            res+=Math.max(left[i],right);
        }
        return res;
    }
}
