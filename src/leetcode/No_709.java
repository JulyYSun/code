package leetcode;

/**
 * Created by YS
 * 2020/11/22 18:54
 */
public class No_709 {
    public String toLowerCase(String str) {
        String result="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                result+=(char)(str.charAt(i)-'A'+'a');

            }
            else
                result+=str.charAt(i);
        }
        return result;
    }

}
