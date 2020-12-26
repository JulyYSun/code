package nowcoder.game_163;
/*
    Created by YS
    2020/5/29 23:47
*/

import java.util.Scanner;

public class Swim_pool {

    public static void main(String[] args) {
        int m,t,m1,t1,m2,t2;

        Scanner scanner=new Scanner(System.in);
        int T=scanner.nextInt();
        for(int i=0;i<T;i++){
            m=scanner.nextInt();
            t=scanner.nextInt();
            m1=scanner.nextInt();
            t1=scanner.nextInt();
            m2=scanner.nextInt();
            t2=scanner.nextInt();
            int water_t=0;
            int in =0;
            int out=0;
            for(int cur_time=0;cur_time<t;cur_time++){
                if(cur_time%t1==0) in=1-in;
                if(cur_time%t2==0) out=1-out;
                water_t=water_t+in*m1-out*m2;
                if(water_t<0) water_t=0;
                if(water_t>m) water_t=m;
            }
            System.out.println(water_t);
        }
    }
}
