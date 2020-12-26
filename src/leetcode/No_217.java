package leetcode;
/*
    Created by YS
    2020/10/31 23:02
*/

import java.util.HashMap;

public class No_217 {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i))
                return true;
            else
                map.put(i,1);
        }
        return false;
    }
}
