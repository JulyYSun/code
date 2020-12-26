package javalearn.thread;

/**
 * Created by YS
 * 2020/11/28 18:47
 */

public class TestState implements Runnable{
    @Override
    public void run() {

    }

    public static void main(String[] args) {
        Thread thread=new Thread(()->{
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("-------------");
        });

        Thread.State state = thread.getState();
        System.out.println(state);
        thread.start();
        state=thread.getState();
        System.out.println(state);
        
    }
}
