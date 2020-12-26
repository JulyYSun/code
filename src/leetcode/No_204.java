package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by YS
 * 2020/12/3 9:16
 */

public class No_204 {
    public int countPrimes2(int n){
        int result=0;
        boolean[] isPrime=new boolean[n];
        Arrays.fill(isPrime,true);
        for(int i=2;i*i<n;i++){
            if(isPrime[i])
                for(int j=i*i;j<n;j++)
                    isPrime[j]=false;
        }
        for(int i=2;i<n;i++)
            if(isPrime[i])
                result++;

        return result;
    }
    public static int countPrimes(int n) {
        int result=0;
        for(int i=1;i<n;i++){
            if(isPrime(i)){
                System.out.println(i);
                result++;

            }
        }

        return result;

    }
    public static boolean isPrime(int n){
        if(n==0||n==1)
            return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        countPrimes(10);
    }

}
