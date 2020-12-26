package javalearn.thread;

/**
 * Created by YS
 * 2020/11/28 18:35
 */

public class TestYield {
    public static void main(String[] args) {
        Myyield yield=new Myyield();
        new Thread(yield,"A").start();
        new Thread(yield,"B").start();

    }


}

class Myyield implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Thread start...");
        Thread.yield();
        System.out.println(Thread.currentThread().getName()+" Thread  stop...");
    }
}
