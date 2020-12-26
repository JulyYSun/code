package leetcode;
/*
    Created by YS
    2020/10/20 16:49
*/

import java.util.ArrayList;
import java.util.List;

public class No_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        if(numRows==0)
            return result;
        result.add(new ArrayList<>());
        result.get(0).add(1);
        for(int i=1;i<numRows;i++){
            List<Integer> cur=new ArrayList<>();
            List<Integer> prev=result.get(i-1);
            cur.add(1);
            for(int j=1;j<i;j++){
                cur.add(prev.get(j-1)+prev.get(j));
            }
            cur.add(1);
            result.add(cur);
        }
        return result;


    }
}
