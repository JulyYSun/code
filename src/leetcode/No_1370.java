package leetcode;

/**
 * Created by YS
 * 2020/11/25 22:52
 */
public class No_1370 {
    public String sortString(String s) {
        StringBuilder result=new StringBuilder();
        int[] chars=new int[26];
        for(char c : s.toCharArray()){
            chars[c-'a']++;
        }
        while (result.length()<s.length()){
            for(int i=0;i<26;i++){
                if(chars[i]!=0){
                    result.append((char)('a'+i));
                    chars[i]--;
                }
            }
            for(int i=25;i>=0;i--){
                if(chars[i]!=0){
                    result.append((char)('a'+i));
                    chars[i]--;
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        
    }
}
