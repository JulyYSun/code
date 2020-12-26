package leetcode;

/**
 * Created by YS
 * 2020/12/16 11:45
 */

public class No_1688 {
    public static int numberOfMatches(int n) {
        int count = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                count += n / 2;
                n = n / 2;
            } else {
                count += (n - 1) / 2;
                n = (n - 1) / 2 + 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOfMatches( 7));
    }
}
