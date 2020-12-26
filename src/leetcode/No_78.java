package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by YS
 * 2020/11/28 15:02
 */

public class No_78 {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> item=new ArrayList<>();
        result.add(item);
        generate(0,nums,item,result);
        return result;
    }
    static void generate(int i,int[] nums,List<Integer> item,List<List<Integer>> result){
        if(i>=nums.length){
            return;
        }
        item.add(nums[i]);
        result.add(item);
        generate(i+1,nums,item,result);
        item.remove(item.size()-1);
        generate(i+1,nums,item,result);
    }

    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1,2,3}));
    }
}
