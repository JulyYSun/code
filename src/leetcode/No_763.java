package leetcode;
/*
    Created by YS
    2020/10/22 9:53
*/

import java.util.ArrayList;
import java.util.List;

public class No_763 {
    public List<Integer> partitionLabels(String S) {
        List<Integer> result=new ArrayList<>();
        int[] lastIndex=new int[26];
        for(int i=0;i<S.length();i++){
            lastIndex[S.charAt(i)-'a']=i;
        }

        int start=0,end=0;
        for(int i=0;i<S.length();i++){
            end=Math.max(end,lastIndex[S.charAt(i)-'a']);
            if(i==end){
                result.add(end-start+1);
                start=end+1;
            }
        }
        return result;
    }
}
