package leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by YS
 * 2020/12/21 19:15
 */

public class No_51 {
    List<List<String>> result=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i], '.');
        }
        backtrack(board,0);
        return result;


    }
    void backtrack(char[][] board,int row){
        if(row==board.length){
            result.add(char2String(board));
            return;
        }
        int n=board.length;
        for(int col=0;col<n;col++){
            if(!isValid(board,row,col))
                continue;
            board[row][col]='Q';
            backtrack(board,row+1);
            board[row][col]='.';
        }
    }

    List<String> char2String(char[][] board){
        List<String> result=new ArrayList<>();

        for(char[] chars: board){
            StringBuilder stringBuilder=new StringBuilder();
            for(char c :chars)
                stringBuilder.append(c);
            result.add(stringBuilder.toString());
        }
        return result;

    }

    private boolean isValid(char[][] board, int row, int col) {
        int n=board.length;
        for (char[] s : board) {
            if (s[col] == 'Q')
                return false;
        }
        for(int i=row-1,j=col+1;i>=0&&j<n;i--,j++){
            if(board[i][j]=='Q')
                return false;
        }
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q')
                return false;
        }
        return true;
    }
}
