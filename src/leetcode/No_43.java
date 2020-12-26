package leetcode;

/**
 * Created by YS
 * 2020/11/27 16:42
 */

public class No_43 {
    public static String multiply(String num1, String num2) {
        StringBuilder stringBuilder=new StringBuilder();
        if(num1.equals("0") || num2.equals("0"))
            return "0";

        int[] add =new int[num1.length()+num2.length()];
        for(int i=num1.length()-1;i>=0;i--){
            int n1=num1.charAt(i)-'0';
            for(int j=num2.length()-1;j>=0;j--){
                int n2=num2.charAt(j)-'0';
                int product=n1*n2+add[i+j+1];
                add[i+j+1]=product%10;
                add[i+j]+=product/10;
            }
        }
        for(int i=0;i<add.length;i++){
            if(i==0&&add[i]==0)
                continue;
            stringBuilder.append(add[i]);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(multiply("123","456"));
    }
}
