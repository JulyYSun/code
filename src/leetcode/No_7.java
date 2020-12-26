package leetcode;

/**
 * Created by YS
 * 2020/12/1 11:05
 */

public class No_7 {
    public int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            if ((ans * 10) / 10 != ans) {
                ans = 0;
                break;
            }
            ans = ans * 10 + x % 10;
            x = x / 10;
        }
        return ans;

    }
}
