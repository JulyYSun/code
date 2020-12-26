package leetcode;

/**
 * Created by YS
 * 2020/12/23 12:43
 */

public class No_167 {
    public int[] twoSum(int[] numbers, int target) {
        int p=0,q=numbers.length;
        while (p<q){
            int sum=numbers[p]+numbers[q];
            if(sum>target) q--;
            else if(sum<target) p++;
            else  return new int[]{p,q};
        }
        return new int[]{-1,-1};
    }
}
