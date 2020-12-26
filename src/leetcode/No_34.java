package leetcode;

/**
 * Created by YS
 * 2020/12/1 10:43
 */

public class No_34 {
    public int[] searchRange(int[] nums, int target) {
        int[] result={-1,-1};
        boolean first=true;
        for(int i=0;i< nums.length;i++){
            if(nums[i]==target){
                if(first){
                    result[0]=i;
                    result[1]=i;
                    first=!first;
                }else{
                    result[1]=i;
                }

            }
        }

        return result;
    }
}
