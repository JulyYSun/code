package nowcoder.zijietiaodong.zijie2018bigdata.dev2019;
/*
    Created by YS
    2020/10/13 15:57
*/


//正则表达式
import java.util.Scanner;

public class No_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<num;i++){
            String str=scanner.nextLine();
            System.out.println(str.replaceAll("(.)\\1+","$1$1").replaceAll("(.)\\1(.)\\2","$1$1$2"));
        }

    }
}
