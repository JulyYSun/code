package leetcode;

/**
 * Created by YS
 * 2020/12/10 10:29
 */

public class No_860 {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5)
                five++;
            else if(bills[i]==10) {
                ten++;
                five--;
            }
            else {
                if(ten>0){
                    five--;
                    ten--;
                }else {
                    five-=3;
                }

            }
            if(five<0||ten<0)
                return false;
        }
        return true;
    }
}
