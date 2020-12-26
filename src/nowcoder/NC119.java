package nowcoder;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by YS
 * 2020/12/9 23:30
 */

public class NC119 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(input);
        if(k<input.length+1){
            for(int i=0;i<k;i++){
                list.add(input[i]);
            }
        }
        return list;
    }
}
