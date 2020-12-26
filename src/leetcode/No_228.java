package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YS
 * 2020/12/8 14:12
 */

public class No_228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        int p=0;
        while (p<nums.length){
            int q=p;
            while (q+1< nums.length && nums[q+1]==nums[q]+1)
                q++;
            if(p==q)
                list.add(String.valueOf(nums[p]));
            else
                list.add(nums[p]+"->"+nums[q]);
            p=q+1;

        }
        return list;
    }
}
