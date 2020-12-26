package leetcode;
/*
    Created by YS
    2020/6/10 16:07
*/

import java.util.Arrays;

public class No_1471 {
    public static int[] getStrongest(int[] arr, int k) {
        int[] kmax=new int[k];
        Arrays.sort(arr);
        int medium=arr[(arr.length-1)/2];
        int i=0,j=arr.length-1;
        int count=0;
        while (count<k){
            if(Math.abs(arr[i]-medium)>Math.abs(arr[j]-medium)){
                kmax[count]=arr[i];
                count++;
                i++;
            }else {
                kmax[count]=arr[j];
                count++;
                j--;
            }
        }


        return kmax;
    }

    public static void main(String[] args) {
        for(int i : getStrongest(new int[]{6,7,11,7,6,8},5))
            System.out.println(i);
    }
}
