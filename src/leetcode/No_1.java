package leetcode;
/*
    Created by YS
    2020/10/14 14:23
*/

import java.util.Arrays;
import java.util.HashMap;

public class No_1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hashMap.containsKey(target-nums[i])){
                return new int[]{hashMap.get(target-nums[i]),i};
            }else
                hashMap.put(nums[i],i);
        }
        return new int[0];
    }
    public int[] twoSum2(int[] nums, int target) {
        Arrays.sort(nums);
        int p=0,q=nums.length-1;
        while (p<q){
            int left=nums[p];
            int right=nums[q];
            int sum=left+right;
            if(sum<target)
                while (p<q && nums[p]==left) p++;
            else if (sum>target)
                while (p<q && nums[q]==right) q--;
            else
                return new int[]{left,right};
        }
        return new int[]{};
    }
    public static void main(String args[]) {
    	
    	System.out.println();
		
	}
}
