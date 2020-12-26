package leetcode;

import java.util.Arrays;

/**
 * Created by YS
 * 2020/12/25 22:50
 */

public class No_66 {
    public int[] plusOne(int[] digits) {
        int[] res=new int[digits.length+1];
        System.arraycopy(digits, 0, res, 1, res.length - 1);
        res[res.length-1]+=1;
        for(int i = res.length-1; i>=1; i--){
            if(res[i]>=10){
                res[i]=0;
                res[i-1]++;
            }
        }
        if(res[0]==0){
            System.arraycopy(res, 1, digits, 0, res.length - 1);
        }
        return res[0]==0? digits:res;
    }
    public int[] plusOne2(int[] digits) {
       digits[digits.length-1]++;
       for(int i= digits.length-1;i>=1;i--){
           if(digits[i]>=10){
               digits[i]=0;
               digits[i-1]++;
           }
       }
       if(digits[0]!=10)
           return digits;
       int[] res=new int[digits.length+1];
       res[0]=1;
       return res;
    }
}
