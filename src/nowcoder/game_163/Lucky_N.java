package nowcoder.game_163;
/*
    Created by YS
    2020/5/29 23:22
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lucky_N {
    public static int check_one(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1')
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int T=scanner.nextInt();

        for(int i=0;i<T;i++){
            List<Integer> contain_one_num=new ArrayList<>();
            int N=scanner.nextInt();
            int[] nums=new int[N];
            for(int j=0;j<N;j++){
                nums[j]=scanner.nextInt();
                String str=Integer.toBinaryString(nums[j]);
                int count=check_one(str);
                if(!contain_one_num.contains(count))
                    contain_one_num.add(count);
            }
            System.out.println(contain_one_num.size());
        }
    }
}
