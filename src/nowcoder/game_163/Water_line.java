package nowcoder.game_163;
/*
    Created by YS
    2020/5/30 19:30
*/

import java.util.Scanner;

public class Water_line {
    public static int counts(int[] heights){
        int count=0;
        for(int i=0;i<heights.length;i++){
            int j=i;
            if(heights[i]==1){
                count++;
                while (j<heights.length){
                    if(heights[j]==1){
                        heights[j]=0;
                        j++;
                    }else {
                        break;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] heights=new int[n];
        for(int i=0;i<n;i++){
            heights[i]=scanner.nextInt();
        }
        int q=scanner.nextInt();
        for(int i=0;i<q;i++){
            int water=scanner.nextInt();
            int[] heights2=new int[n];

            //根据洪水高度转换数组为0 1型
            for(int f=0;f<n;f++){
                if(heights[f]<=water){
                    heights2[f]=0;
                }else {
                    heights2[f]=1;
                }
            }
            System.out.println(counts(heights2));


        }
    }
}
