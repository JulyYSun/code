package nowcoder;

/**
 * Created by YS
 * 2020/12/10 10:49
 */

public class NC128 {
    public long maxWater (int[] arr) {
        int max=arr[0];
        int sum=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                continue;
            }else {
                sum+=(max-arr[i]);
            }
        }

        return sum;

    }
}
