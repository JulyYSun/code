package leetcode;
/*
    Created by YS
    2020/6/10 15:47
*/

public class No_1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] nums2=new int[n*2];
        for(int i=0;i<n;i=i+1){
            nums2[2*i]=nums[i];
            nums2[2*i+1]=nums[i+n/2];
        }
        return nums2;
    }
}
