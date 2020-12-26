package leetcode;

import java.util.HashSet;

/**
 * Created by YS
 * 2020/11/22 21:29
 */
public class No_3 {
    public static int lengthOfLongestSubstring(String s) {
        int result=0;
        int rk=0;
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(i!=0)
                set.remove(s.charAt(i-1));
            while (rk<s.length()&&!set.contains(s.charAt(rk))){
                set.add(s.charAt(rk));
                rk++;
            }
            result=Math.max(result,rk-i);
        }
        return result;
    }

    public static void main(String[] args) {
        String str="abcabc";
        System.out.println(lengthOfLongestSubstring(str));
    }
}
