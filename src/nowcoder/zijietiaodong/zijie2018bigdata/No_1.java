package nowcoder.zijietiaodong.zijie2018bigdata;
/*
    Created by YS
    2020/10/13 11:37
*/


//首先将横坐标排序，横坐标最大的一定为目标点，然后依次往横坐标值变小的方向递减，
//如果y值大于上一个目标值的y则为目标点，同时更新当前的y值
import java.util.*;

public class No_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        HashMap<Integer,Integer> array=new HashMap<>();
        int[] x_array=new int[num];
        List<Integer> x_list=new ArrayList<>();

        for(int i=0;i<num;i++){
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            x_array[i]=x;
            array.put(x,y);

        }

        Arrays.sort(x_array);
        x_list.add(x_array[num-1]);
        int max_x=x_array[num-1];
        int max_y=array.get(max_x);
        for(int i=num-2;i>=0;i--){
            int key=x_array[i];
            int value=array.get(key);

            if(value>max_y){
                x_list.add(key);
                max_y=value;
            }
        }
        for(int i=0;i<x_list.size();i++){
            int x=x_list.get(i);
            System.out.println(x+" "+array.get(x));
        }


    }
}
