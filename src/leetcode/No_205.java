package leetcode;

import java.util.HashMap;

/**
 * Created by YS
 * 2020/12/3 10:16
 */

public class No_205 {
    public boolean isIsomorphic(String s, String t) {
        char[] schar=s.toCharArray();
        char[] tchar=t.toCharArray();
        int[] indexS=new int[256];
        int[] indexT=new int[256];
        for(int i=0;i<s.length();i++){
            if(indexS[schar[i]]!=indexT[tchar[i]]){
                return false;
            }
            indexS[schar[i]]=i+1;
            indexT[tchar[i]]=i+1;

        }
        return true;
    }
    
}



