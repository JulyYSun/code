package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by YS
 * 2020/12/3 9:44
 */

public class No_202 {
    public boolean isHappy(int n) {
        int slow=n,fast=n;
        do {
            slow=byteSquareSum(slow);
            fast=byteSquareSum(fast);
            fast=byteSquareSum(fast);
        }while (slow!=fast);

        Set<Integer> set=new HashSet<>();
        while (n!=1&&!set.contains(n)){
            set.add(n);
            n=byteSquareSum(n);
        }
        return slow==1;

    }
    public static int byteSquareSum(int n){
        int sum=0;
        while (n>0){
            byte byt= (byte) (n%10);
            sum+=byt*byt;
            n=n/10;
        }
        return sum;
    }
}
