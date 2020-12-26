package leetcode;
/*
    Created by YS
    2020/6/6 13:11
*/


import java.util.HashMap;
import java.util.Map;

public class No_169 {
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else {
                map.put(nums[i],1);
            }
        }
        int count=0;
        int max=0;
        //遍历hashmap
        for(Map.Entry<Integer,Integer> nums2 :map.entrySet()){
            if(nums2.getValue()>count){
                count=nums2.getValue();
                max=nums2.getKey();
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
