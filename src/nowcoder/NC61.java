package nowcoder;

import java.util.HashMap;

/**
 * Created by YS
 * 2020/12/9 22:44
 */

public class NC61 {
    public int[] twoSum (int[] numbers, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            if(map.containsKey(target-numbers[i]))
                return new int[]{map.get(target-numbers[i])+1,i+1};
            else
                map.put(numbers[i],i);
        }
        return null;
    }
}
