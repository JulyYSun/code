package leetcode;
/*
    Created by YS
    2020/6/1 11:15
*/

public class No_198 {
    public int rob(int[] nums) {
        int prev=0;
        int cur=0;
        for(int num :nums){
            int temp=Math.max(cur,prev+num);
            prev=cur;
            cur=temp;
        }
        return cur;
    }

    public static void main(String[] args) {

    }
}
