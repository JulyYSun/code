package javalearn.thread;

/**
 * Created by YS
 * 2020/11/28 18:41
 */


//thread.join让join的线程先执行完再执行其他的线程
public class TestJoin implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Vip is coming..."+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TestJoin testJoin=new TestJoin();
        Thread thread=new Thread(testJoin);
        thread.start();
        for (int i = 0; i < 1000; i++) {
            if(i==200){
                thread.join();
            }
            System.out.println("Main "+i);
        }
    }
}
