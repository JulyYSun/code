package leetcode;
/*
    Created by YS
    2020/9/28 19:35
*/



import java.util.Arrays;

public class No_581 {
    public int findUnsortedSubarray(int[] nums) {
        int[] nums2=nums.clone();
        Arrays.sort(nums2);
        int start=nums.length;
        int end=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums2[i]){
                start=Math.min(start,i);
                end=Math.max(end,i);
            }

        }
        return end-start>0? end-start+1 : 0;
    }
    public static void main(String args[]) {
    	
		System.out.println("sasas");
	}
}
