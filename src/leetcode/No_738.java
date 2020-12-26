package leetcode;

/**
 * Created by YS
 * 2020/12/15 21:57
 */

public class No_738 {
    public  static int monotoneIncreasingDigits(int N) {
        char[] arr=Integer.toString(N).toCharArray();
        int result=0;
        int i=1;
        while (i<arr.length&&arr[i-1]<=arr[i]){
            i++;
        }
        if(i<arr.length){
            while (i>0&&arr[i-1]>arr[i]){
                arr[i-1]-=1;
                i--;
            }
            i++;
            for(;i<arr.length;i++){
                arr[i]='9';
            }
        }
        return Integer.parseInt(new String(arr));
    }


    public static void main(String[] args) {
        System.out.println(monotoneIncreasingDigits(11));
    }
}
