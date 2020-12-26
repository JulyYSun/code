package leetcode;
/*
    Created by YS
    2020/6/8 23:26
*/

import java.util.Arrays;

public class No_455 {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        int i=0,j=0;
        while (i<g.length&&j<s.length){
            if(s[j]>=g[i]){
                i++;
                count++;
            }
            j++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findContentChildren(new int[]{1,2,3},new int[]{1,1}));
    }
}
