package leetcode;
/*
    Created by YS
    2020/6/8 23:46
*/

import java.util.ArrayList;
import java.util.List;

public class No_376 {
    public static int wiggleMaxLength(int[] nums) {
        int max=0;
        if(nums.length<1){
            max= nums.length==0? 0:1;
        }
        else {
            int delete=0;
            List<Integer> delta=new ArrayList<>();
            for(int i=1;i<nums.length;i++){
                if(nums[i]-nums[i-1]!=0)
                    delta.add(nums[i]-nums[i-1]);
                else delete++;
            }
            int i=0,j=1;
            while (j<delta.size()){
                if(delta.get(i)==0){
                    i++;
                }
                else if(delta.get(i)/Math.abs(delta.get(i)) *delta.get(j)/Math.abs(delta.get(j))==-1){
                    i++;
                    j++;
                }else {
                    delta.set(j,0);
                    j++;
                    delete++;

                }
            }
            max= nums.length-delete;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(wiggleMaxLength(new int[]{0,0}));

    }
}
