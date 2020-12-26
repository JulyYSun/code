package leetcode;

import java.util.HashMap;

/**
 * Created by YS
 * 2020/12/23 11:19
 */

public class No_387 {
    public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++)
            if (s.lastIndexOf(s.charAt(i))==s.indexOf(s.charAt(i)))
                return i;
        return -1;
    }
    public int firstUniqChar2(String s) {
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            hashMap.put(ch,hashMap.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(hashMap.get(s.charAt(i))==1)
                return i;

        }
        return -1;
    }
}
