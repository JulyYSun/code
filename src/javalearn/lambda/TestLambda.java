package javalearn.lambda;

/**
 * Created by YS
 * 2020/11/27 22:51
 */

public class TestLambda {
    public static void main(String[] args) {
        Like iLike=new Like();
        iLike.lambda(2);

        ILike iLike1 = b-> {
            System.out.println("I like lambda2"+b);
        };
        iLike1.lambda(520);
    }
}

interface ILike{
    void lambda(int a);
}

class Like implements ILike{

    @Override
    public void lambda(int a) {
        System.out.println("I like lambda");
    }
}
