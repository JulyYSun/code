package leetcode;
/*
    Created by YS
    2020/11/2 19:39
*/

public class No_75 {
    public void sortColors(int[] nums) {
        int p0=0,p1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                int temp=nums[p1];
                nums[p1]=1;
                nums[i]=temp;
                p1++;
            }else if(nums[i]==0){
                int temp=nums[p0];
                nums[p0]=0;
                nums[i]=temp;
                if(p0<p1){
                    temp=nums[i];
                    nums[i]=nums[p1];
                    nums[p1]=temp;
                }
                p0++;
                p1++;
            }
        }
    }
}
