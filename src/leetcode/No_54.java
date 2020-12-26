package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YS
 * 2020/11/29 20:45
 */

public class No_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();
        int y_botumn=matrix.length;
        int x_right=matrix[0].length;
        int x_left=0;
        int y_top=0;
        int i=0,j=0;
        while (result.size()<matrix.length*matrix[0].length){
            result.add(matrix[i][j]);
            
        }
        return result;

    }
}
