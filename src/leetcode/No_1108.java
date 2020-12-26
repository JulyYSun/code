package leetcode;

/**
 * Created by YS
 * 2020/11/22 19:12
 */
public class No_1108 {
    public String defangIPaddr(String address) {
        String result="";
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)!='.')
                result+=address.charAt(i);
            else
                result+="[.]";
        }
        return result;
    }
}
