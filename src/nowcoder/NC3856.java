package nowcoder;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by YS
 * 2020/12/25 15:46
 */

public class NC3856 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int M=scanner.nextInt();
        int[][] city=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(i==j)
                    city[i][j]=0;
                else
                    city[i][j]=Integer.MAX_VALUE;
            }

        }
        for(int i=0;i<M;i++){
            int length= (int) Math.pow(2,i);
            int startCity=scanner.nextInt();
            int endCity=scanner.nextInt();
            city[startCity][endCity]=length;
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++)
                System.out.print(city[i][j]+" ");
            System.out.println();
        }
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(0);
        while (!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                int cur=queue.poll();
                for(int j=0;j<N ;j++)
                    if(j!=cur && city[cur][j] <Integer.MAX_VALUE){
                        queue.offer(j);
                        city[0][j]=Math.min(city[0][j],city[cur][j]+city[0][cur]);
                    }
            }
        }
        for(int i=1;i<N;i++)
            System.out.println(city[0][i]);

    }
}
