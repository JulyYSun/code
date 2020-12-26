package leetcode;

/**
 * Created by YS
 * 2020/11/27 16:04
 */

public class No_415 {
    public static String addStrings(String num1, String num2) {
        int i=num1.length()-1,j=num2.length()-1;
        int ten=0;
        StringBuilder stringBuilder=new StringBuilder();
        while (i>=0||j>=0){
            int numi=(i>=0)? num1.charAt(i)-'0':0;
            int numj=(j>=0)? num2.charAt(j)-'0':0;
            int add=numi+numj+ten;

            stringBuilder.append(add%10);
            ten=add/10;
            i--;
            j--;

        }
        if(ten==1)
            stringBuilder.append(1);
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addStrings("123","12345"));
    }
}
