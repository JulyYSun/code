package leetcode;
/*
    Created by YS
    2020/10/14 13:02
*/

import java.util.*;

public class No_1002 {
    public List<String> commonChars(String[] A) {
        List<String> result=new ArrayList<>();
        int[] www=new int[26];
        Arrays.fill(www,Integer.MAX_VALUE);
        for(String str:A){
            int[] count2=new int[26];
            for(int i=0;i<str.length();i++){
                count2[str.charAt(i)-'a']++;
            }
            for(int i=0;i<26;i++){
                www[i]=Math.min(www[i],count2[i]);
            }
        }

        for(int i=0;i<26;i++){
            for(int j=0;j<www[i];j++)
                result.add(String.valueOf((char)(i+'a')));
        }
        return result;
    }
    
}
