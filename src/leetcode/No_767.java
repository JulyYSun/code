package leetcode;

/**
 * Created by YS
 * 2020/11/30 14:56
 */

public class No_767 {
    public String reorganizeString(String S) {
        String result="";
        int p=0,q=0;
        int[] chars=new int[26];
        for(int i=0;i<S.length();i++){
            chars[S.charAt(i)-'a']++;
        }
        return result;
    }
    public static int minIndex(int chars[]){
        int max=0;
        int i=0;
        int index=0;
        while (i<chars.length){
            if(chars[i]>max){
                max=chars[i];
                index=i;
            }
        }
        return i;
    }
}
