package nowcoder;

import java.util.Arrays;

/**
 * Created by YS
 * 2020/12/16 23:15
 */

public class NC63 {
    public boolean isContinuous(int [] numbers) {
        Arrays.sort(numbers);
        int zero=0;
        int one=0;
        for(int i=0;i<4;i++){
            if(numbers[i]==0)
                zero++;
            else if(numbers[i+1]==numbers[i]){
                return false;
            }
            else
                one+=numbers[i+1]-numbers[i]-1;
        }
        return zero>=one;
    }
}
