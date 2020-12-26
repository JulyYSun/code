package meituan2020;
/*
    Created by YS
    2020/11/2 20:00
*/

    import java.util.Scanner;

    public class No_7 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String a=scanner.nextLine();
            String b=scanner.nextLine();

            long a1=Long.parseLong(a.substring(1,a.length()-1));
            long b1=Long.parseLong(b.substring(1,b.length()-1));

            long result=a1+b1;
            System.out.println("\""+result+"\"");

        }
    }
