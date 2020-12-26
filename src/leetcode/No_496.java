package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

/**
 * Created by YS
 * 2020/12/23 20:57
 */

public class No_496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack=new Stack<>();
        int[] res=new int[nums1.length];
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
            while (!stack.isEmpty() && stack.peek()<=nums2[i]){
                stack.pop();
            }
            hashMap.put(nums2[i], stack.isEmpty()? -1:stack.peek());
            stack.push(nums2[i]);
        }
        for(int i=0;i<res.length;i++){
            res[i]=hashMap.get(nums1[i]);
        }
        return res;
    }
    public int[] nextGreaterElement2(int[] nums1, int[] nums2) {
        int[] res=new int[nums1.length];
        Arrays.fill(res,-1);
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]>nums1[i]){
                    res[i]=nums2[j];
                    break;
                }
            }

        }
        return res;
    }
}
