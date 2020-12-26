package leetcode;

/**
 * Created by YS
 * 2020/11/22 19:16
 */
public class No_657 {
    public boolean judgeCircle(String moves) {
        int[] arr=new int[2];
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='R')
                arr[0]+=1;
            else if(moves.charAt(i)=='L')
                arr[0]-=1;
            else if(moves.charAt(i)=='U')
                arr[1]+=1;
            else
                arr[1]-=1;
        }
        if(arr[0]==0&&arr[1]==0)
            return true;
        else
            return false;
    }
}
