package leetcode;
/*
    Created by YS
    2020/10/18 23:52
*/

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class No_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i])-1;
            if(nums[index]>0)
                nums[index]*=-1;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
                result.add(i+1);
        }
        return result;
    }
}
