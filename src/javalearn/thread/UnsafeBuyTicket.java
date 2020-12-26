package javalearn.thread;

/**
 * Created by YS
 * 2020/11/28 19:46
 */

public class UnsafeBuyTicket {
    public static void main(String[] args) {
        BuyTicket buyTicket = new BuyTicket();
        new Thread(buyTicket,"A").start();
        new Thread(buyTicket,"B").start();
        new Thread(buyTicket,"C").start();
    }
}

class BuyTicket implements Runnable{
    private int ticketNums=10;
    boolean flag=true;
    @Override
    public void run() {
        while (flag){
            try {
                buy();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized void buy()  {
        if(ticketNums<=0){
            flag=false;
            return;
        }

        System.out.println(Thread.currentThread().getName()+" get the "+ticketNums--+" ticket");
    }
}
