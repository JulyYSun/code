package leetcode;
/*
    Created by YS
    2020/7/12 18:08
*/

public class No_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1_=new int[m];
        System.arraycopy(nums1,0,nums1_,0,m);
        int i=0,j=0;
        int k=0;
        while (i<m&& j<n){
            nums1[k++]= (nums1_[i]<nums2[j])? nums1_[i++] : nums2[j++];
        }
        if(i<m){

        }
        if(j<n){

        }
    }
}
