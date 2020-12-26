package leetcode;

/**
 * Created by YS
 * 2020/11/22 22:57
 */
public class No_13 {
    public static int romanToInt(String s) {
        int result=0;
        s=s.replace("IV","a").replace("IX","b").replace("XL","c")
                .replace("XC","d").replace("CD","e").replace("CM","f");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                result+=1;
            }else if(s.charAt(i)=='V'){
                result+=5;
            }else if(s.charAt(i)=='X'){
                result+=10;
            }else if(s.charAt(i)=='L'){
                result+=50;
            }else if(s.charAt(i)=='C'){
                result+=100;
            }else if(s.charAt(i)=='D'){
                result+=500;
            }else if(s.charAt(i)=='M'){
                result+=1000;
            }else if(s.charAt(i)=='a'){
                result+=4;
            }else if(s.charAt(i)=='b'){
                result+=9;
            }else if(s.charAt(i)=='c'){
                result+=40;
            }else if(s.charAt(i)=='d'){
                result+=90;
            }else if(s.charAt(i)=='e'){
                result+=400;
            }else if(s.charAt(i)=='f'){
                result+=900;
            }
        }
        System.out.println(s);
        return result;

    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }
}
