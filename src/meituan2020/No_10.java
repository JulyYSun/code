package meituan2020;
/*
    Created by YS
    2020/11/2 20:36
*/

public class No_10 {
    public static void main(String[] args) {
    }
    public static int compare(String str1,String str2){
        int min_index=0;
        for(int i=0;i<str1.length();i++){
            if(i>=str2.length())
                return i;
            if(str1.charAt(i)==str2.charAt(i)){
                min_index=i;
                continue;

            }else {
                break;
            }


        }
        return min_index;
    }
}
