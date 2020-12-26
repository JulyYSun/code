package nowcoder.zijietiaodong.zijie2018bigdata.dev2019;
/*
    Created by YS
    2020/10/13 16:31
*/

import java.util.Scanner;

public class No_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();
        int D=scanner.nextInt();
        int[] loc=new int[N];
        for(int i=0;i<N;i++){
            loc[i]=scanner.nextInt();
        }
        int right=2;
        long count=0;
        for(int i=0;i<N-2;i++){
            long temp=0;
            for(int j=i+2;j<N;j++){
                if(loc[j]-loc[i]>D){
                    break;
                }else {
                    temp=(long)loc[j]-loc[i];

                }
            }
            if(temp>2)
                count+=(temp*(temp-1)/2)&99997867;
        }
        System.out.println(count);
    }
}
