package leetcode;

/**
 * Created by YS
 * 2020/12/18 11:32
 */

public class No_389 {
    public char findTheDifference(String s, String t) {
        int[] s1=new int[26];
        for(int i=0;i<s.length();i++){
            s1[s.charAt(i)-'a']++;
            s1[t.charAt(i)-'a']--;
        }
        s1[t.charAt(t.length()-1)-'a']--;
        for(int i=0;i<26;i++){
            if(s1[i]==-1)
                return (char) (i+'a');
        }
        return ' ';
    }
    public char find(String s,String t){
        int res=0;
        for(int i=0;i<s.length();i++){
            res^=s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            res^=t.charAt(i);
        }
        return (char)res;
    }
}
