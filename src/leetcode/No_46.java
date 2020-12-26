package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by YS
 * 2020/11/27 15:22
 */

public class No_46 {
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> track=new LinkedList<>();
        backtrack(track,nums);
        return result;
    }
    public void backtrack(LinkedList<Integer> track,int[] nums){
        if(track.size()==nums.length){
            result.add(new LinkedList(track));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(track.contains(nums[i]))
                continue;
            track.add(nums[i]);
            backtrack(track,nums);
            track.removeLast();
        }
    }
}
