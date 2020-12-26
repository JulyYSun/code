package leetcode;

import java.util.*;

/**
 * Created by YS
 * 2020/12/21 22:10
 */

public class No_752 {
    public  int openLock(String[] deadends, String target) {
        Set<String> dead = new HashSet<>(Arrays.asList(deadends));
        Queue<String> queue=new LinkedList<>();
        Set<String> visited=new HashSet<>();
        queue.offer("0000");
        int step=0;
        while (!queue.isEmpty()){
            int sz=queue.size();
            for(int j=0;j<sz;j++){
                String cur=queue.poll();
                if(dead.contains(cur))
                    continue;
                if(cur.equals(target))
                    return step;
                for(int i=0;i<4;i++){
                    String up=plus(cur,i);
                    if(!visited.contains(up)){
                        queue.offer(up);
                        visited.add(up);
                    }
                    String down=minus(cur,i);
                    if(!visited.contains(down)){
                        queue.offer(down);
                        visited.add(down);
                    }
                }
            }

            step++;
        }
        return -1;

    }

    String plus(String s,int index){
        char[] chars=s.toCharArray();
        if(chars[index]=='9')
            chars[index]='0';
        else
            chars[index]++;
        return new String(chars);


    }
    String minus(String s,int index){
        char[] chars=s.toCharArray();
        if(chars[index]=='0')
            chars[index]='9';
        else
            chars[index]--;
        return new String(chars);


    }

    public static void main(String[] args) {
        No_752 no_752=new No_752();
        System.out.println(no_752.openLock(new String[]{"0201","0101","0102","1212","2002"},"0202"));
    }

}
