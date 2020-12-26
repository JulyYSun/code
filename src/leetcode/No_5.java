package leetcode;

/**
 * Created by YS
 * 2020/12/17 11:08
 */

public class No_5 {
    public String longestPalindrome(String s) {
        char[] chars=s.toCharArray();
        if(chars.length<=1)
            return s;
        int maxLength=1;
        int begin=0;
        for(int i=0;i<chars.length-1;i++){
            for(int j=i+1;j<chars.length;j++){
                if(is(chars,i,j)&&(j-i+1)>maxLength){
                    maxLength=j-i+1;
                    begin=i;
                }

            }
        }
        return s.substring(begin,begin+maxLength);
    }
    public boolean is(char[] chars,int left,int right){
        while (left<right){
            if(chars[left]!=chars[right])
                return false;
            left++;
            right--;
        }
        return true;

    }

    public String longestPalindrome2(String s) {
        if(s.length()<=1)
            return s;
        int maxLength=1;
        int begin=0;
        char[] chars=s.toCharArray();
        for(int i=0;i<chars.length-1;i++){
            int odd=expandLength(chars,i,i);
            int even=expandLength(chars,i,i+1);
            int len=Math.max(odd,even);
            if(len>maxLength){
                maxLength=len;
                begin=i-(maxLength-1)/2;
            }
        }
        return s.substring(begin,begin+maxLength);
    }
    public int expandLength(char[] chars,int left,int right){
        while (left>=0&&right<chars.length&&chars[left]==chars[right]){
            left--;
            right++;
        }
        return right-left-1;
    }
    public String longestPalindrome3(String s) {
        if(s.length()<=1){
            return s;
        }
        int len=s.length();
        char[] chars=s.toCharArray();
        boolean[][] dp=new boolean[len][len];
        for(int i=0;i<len;i++){
            dp[i][i]=true;
        }
        int maxLength=1;
        int begin=0;
        for(int j=1;j<len;j++){
            for(int i=0;i<j;i++){
                if(chars[i]!=chars[j]){
                    dp[i][j]=false;
                }else {
                    if(j-i<3)
                        dp[i][j]=true;
                    else
                        dp[i][j]=dp[i+1][j-1];
                }
                if(dp[i][j]&&(j-i+1)>maxLength){
                    maxLength=j-i+1;
                    begin=i;
                }
            }

        }
        return s.substring(begin,begin+maxLength);
    }
}
