package javalearn.thread;

/**
 * Created by YS
 * 2020/11/27 21:32
 */

public class TestThread2 implements Runnable{
    private int tickets=10;
    @Override
    public void run() {
        while (true){
            if (tickets<=0){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"获得了第"+tickets--+"张票");
        }
    }

    public static void main(String[] args) {
        TestThread2 ticket = new TestThread2();

        new Thread(ticket,"YS").start();
        new Thread(ticket,"LYZ").start();
        new Thread(ticket,"july").start();
    }
}
