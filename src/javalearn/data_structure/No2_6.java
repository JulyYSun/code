package javalearn.data_structure;

/**
 * Created by YS
 * 2020/11/25 18:08
 */
public class No2_6 {
    public static int fine(int n){
        if(n==1)
            return 2;
        else
            return fine(n-1)*fine(n-1);
    }

    public static void main(String[] args) {
        System.out.println(fine(5));
    }
}
