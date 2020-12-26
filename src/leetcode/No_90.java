package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by YS
 * 2020/12/26 14:15
 */

public class No_90 {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<Integer> track=new ArrayList<>();
        backTrack(nums,track,0);
        return res;
    }
    void backTrack(int[] nums,List<Integer> track,int start){
        res.add(new ArrayList<>(track));
        for(int i=start;i< nums.length;i++){
            if(i>start && nums[i]==nums[i-1])
                continue;
            track.add(nums[i]);
            backTrack(nums,track,i+1);
            track.remove(track.size()-1);
        }
    }
}
