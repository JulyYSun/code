package leetcode;
/*
    Created by YS
    2020/7/10 18:36
*/

public class No_58 {
    public int lengthOfLastWord(String s) {
        int length=0;
        int str_length=s.length();
        int index=str_length;
        if(str_length==0){
            length=0;
        }else{
            char c=s.charAt(str_length-1);
            while(index >0){
                index--;
                c=s.charAt(str_length-1);
            }
            length=str_length-index;
        }

        return length;
    }
}
