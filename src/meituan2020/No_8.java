package meituan2020;
/*
    Created by YS
    2020/11/2 20:13
*/

import java.util.Scanner;

public class No_8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                if(isreverse(str.substring(i,j+1)))
                    count++;
            }
        }
        System.out.println(count);


    }
    public static boolean isreverse(String str){
        int length=str.length();
        for(int i=0;i<length/2;i++){
            if(str.charAt(i)==str.charAt(length-i-1))
                continue;
            else
                return false;
        }
        return true;
    }
}
