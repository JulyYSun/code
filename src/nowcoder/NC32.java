package nowcoder;

/**
 * Created by YS
 * 2020/12/16 21:33
 */

public class NC32 {
    public int sqrt_(int x){
        int result=0;
        int i=1;
        while (x>=0){
            x-=i;
            result++;
            i+=2;
        }
        return result-1;
    }
}
