package leetcode;

/**
 * Created by YS
 * 2020/11/26 23:05
 */

public class No_168 {
    public static String convertToTitle(int n) {
        StringBuilder stringBuilder=new StringBuilder();
        while (n!=0){
            n--;
            stringBuilder.append((char)('A'+n%26));
            n=n/26;
        }
        return stringBuilder.reverse().toString();
    }



    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }
}
