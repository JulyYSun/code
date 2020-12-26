package javalearn.thread;

/**
 * Created by YS
 * 2020/11/27 21:19
 */

public class  TestThread1 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("Hello World!");
        }

    }

    public static void main(String[] args) {
        TestThread1 testThread1 = new TestThread1();
        new Thread(testThread1).start();
        for(int i=0;i<100;i++){
            System.out.println("World Hello!");
        }

    }
}
