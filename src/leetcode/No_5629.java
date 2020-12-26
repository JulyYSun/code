package leetcode;

/**
 * Created by YS
 * 2020/12/20 10:32
 */

public class No_5629 {
    public static String reformatNumber(String number) {
        number=number.replace("-","").replace(" ","");
        StringBuilder stringBuilder=new StringBuilder();
        int left=number.length();
        int i=0;
        while (left>0){
            if(left<=4){
                if(left==4){
                    stringBuilder.append("-");
                    stringBuilder.append(number.substring(number.length()-4,number.length()-2));
                    stringBuilder.append("-");
                    stringBuilder.append(number.substring(number.length()-2));
                }
                else if(left==3){
                    stringBuilder.append("-");
                    stringBuilder.append(number.substring(number.length()-3));
                }else {
                    stringBuilder.append("-");
                    stringBuilder.append(number.substring(number.length()-2));
                }
                break;
            }else {

                stringBuilder.append(number.charAt(i));
                left--;
                i++;
                if(i%3==0)
                    stringBuilder.append("-");
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(reformatNumber("1-23-45 6"));
    }
}
