package javalearn.thread;

/**
 * Created by YS
 * 2020/11/27 22:22
 */

public class Race implements Runnable{
    private static String winner;
    @Override
    public void run() {

        for (int i = 0; i <= 100; i++) {
            if(Thread.currentThread().getName().equals("Rabbit")&&i%10==5) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            boolean flag=over(i);
            if(flag)
                break;
            System.out.println(Thread.currentThread().getName()+" run "+i+" steps.");
        }

    }
    public boolean over(int steps){
        if(winner!=null)
            return true;
        if(steps>=100){
            winner=Thread.currentThread().getName();
            System.out.println("Winner is "+winner);
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        @Deprecated
        Race race=new Race();

        new Thread(race,"Rabbit").start();
        new Thread(race,"Turtle").start();
    }
}
