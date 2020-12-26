package leetcode;
/*
    Created by YS
    2020/10/19 15:51
*/

import java.util.ArrayList;
import java.util.List;

public class No_73 {
    public void setZeroes(int[][] matrix) {
        List<Integer> x=new ArrayList<>();
        List<Integer> y=new ArrayList<>();

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    int x_length=matrix.length;
                    int y_length=matrix[0].length;
                    while (x_length>0){
                        x.add(x_length-1);
                        y.add(j);
                        x_length--;
                    }
                    while (y_length>0){
                        x.add(i);
                        y.add(y_length-1);
                        y_length--;
                    }
                }
            }
        }
        for(int i=0;i<x.size();i++){
            matrix[x.get(i)][y.get(i)]=0;
        }

    }
}
