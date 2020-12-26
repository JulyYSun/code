package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by YS
 * 2020/11/28 15:02
 */

public class No_78 {
    List<List<Integer>> res=new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> track=new ArrayList<>();
        backTrack(nums,track,0);
        return res;
    }
    void backTrack(int[] nums,List<Integer> track,int start){
        res.add(new ArrayList<>(track));
        for(int i=start;i< nums.length;i++){
            track.add(nums[i]);
            backTrack(nums,track,i+1);
            track.remove(track.size()-1);
        }
    }

}
