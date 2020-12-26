package leetcode;

/**
 * Created by YS
 * 2020/11/22 18:26
 */
public class No_242 {
    public boolean isAnagram(String s, String t) {
        boolean result=false;
        if(s.length()==t.length()&&s.length()==0)
            return true;
        if(s.length()!=t.length())
            return result;
        int[] str_count=new int[26];
        for(int i=0;i<s.length();i++){
            str_count[s.charAt(i)-'a']++;
            str_count[t.charAt(i)-'a']--;
        }

        for(int i=0;i<26;i++){
            if (str_count[i]!=0)
                return false;
            else
                result=true;
        }
        return result;
    }
}
