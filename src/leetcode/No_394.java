package leetcode;
/*
    Created by YS
    2020/9/28 19:03
*/

public class No_394 {
    public String decodeString(String s) {
        String result="";
        int braket_num=0;
        int first_right=0;
        int last_left=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='['){
                braket_num++;
                last_left=i;
            }
            if(s.charAt(i)==']'){
                first_right=i;
                break;
            }

        }





        return result;
    }
}
