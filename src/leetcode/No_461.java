package leetcode;
/*
    Created by YS
    2020/10/18 22:19
*/

public class No_461 {
    public int hammingDistance(int x, int y) {
        String x1=Integer.toBinaryString(x);
        String x2=Integer.toBinaryString(y);
        String x11="";
        String x22="";
        int length=Math.max(x1.length(),x2.length());
        for(int i=0;i<length-x1.length();i++){
            x11+="0";
        }
        x11+=x1;
        for(int i=0;i<length-x2.length();i++){
            x22+="0";
        }
        x22+=x2;

        int count=0;
        for(int i=0;i<length;i++){
            if(x11.charAt(i)!=x22.charAt(i))
                count++;
        }
        return count;

//        return Integer.bitCount(x ^ y);
    }
}
