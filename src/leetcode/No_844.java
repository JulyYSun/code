package leetcode;
/*
    Created by YS
    2020/10/19 12:00
*/

public class No_844 {
    public static boolean backspaceCompare(String S, String T) {
        StringBuilder s1=new StringBuilder();
        StringBuilder t1=new StringBuilder();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='#' ){
                if(s1.length()>0)
                    s1.deleteCharAt(s1.length()-1);
                else
                    continue;
            }else {
                s1.append(S.charAt(i));
            }
        }
        for(int i=0;i<T.length();i++){
            if(T.charAt(i)=='#'){
                if(t1.length()>0)
                    t1.deleteCharAt(t1.length()-1);
                else
                    continue;
            }else{
                t1.append(T.charAt(i));
            }
        }

        return s1.toString().equals(t1.toString()) ? true:false;

    }

    public static void main(String[] args) {
        System.out.println(new No_844().backspaceCompare("ab#c","ad#c"));

    }
}
