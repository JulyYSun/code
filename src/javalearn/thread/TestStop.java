package javalearn.thread;

/**
 * Created by YS
 * 2020/11/28 18:22
 */

public class TestStop implements Runnable{

    private boolean flag=true;
    @Override
    public void run() {
        int i=0;
        while (flag) {
            System.out.println("Run thread "+i++);
        }
    }
    public void stop(){
        this.flag=false;
    }

    public static void main(String[] args) {
        TestStop testStop = new TestStop();

        new Thread(testStop).start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("Main "+i);
            if(i==800){
                testStop.stop();
                System.out.println("Stop...");
            }

        }
    }
}
