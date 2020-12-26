package leetcode;
/*
    Created by YS
    2020/11/2 18:52
*/

import java.util.List;

public class No_48 {
    public void rotate(int[][] matrix) {
        int size=matrix.length;
        //两次翻转矩阵，第一次从右上角到左下角
        //第二次沿着水平中线翻转
        for(int i=0;i<size;i++) {

            for (int j = 0; j < size - i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[size - j - 1][size - 1 - i];
                matrix[size - j - 1][size - 1 - i] = temp;
            }
        }
        for(int i=0;i<size/2;i++){
            for(int j=0;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[size-i-1][j];
                matrix[size-i-1][j]=temp;
            }
        }
    }
}
