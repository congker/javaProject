package com.example.demo.controller.sync;

/**
 * Created by xuwencong on 2018/8/14
 */
public class Thread2 {

    private void m4t1() {
        synchronized(this) {
            int i = 5;
            while( i-- > 0) {
                System.out.println(Thread.currentThread().getName() + " =mt1= : " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ie) {
                }
            }
        }
    }

    private void m4t2() {
        synchronized(this) {
            int i = 5;
            while (i-- > 0) {
                System.out.println(Thread.currentThread().getName() + " =mt2= : " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ie) {
                }
            }
        }
    }

// l
    public static void main(String[] args) {
        final Thread2 myt2 = new Thread2();
        Thread t1 = new Thread(() -> myt2.m4t1(), "t1"  );
        Thread t2 = new Thread(() -> myt2.m4t2(), "t2"  );
        t1.start();
        t2.start();
    }

//    public static void main2(String[] args) {
//        final Thread2 myt2 = new Thread2();
//        Thread t1 = new Thread(  new Runnable() {  public void run() {  myt2.m4t1();  }  }, "t1"  );
//        Thread t2 = new Thread(  new Runnable() {  public void run() { myt2.m4t2();   }  }, "t2"  );
//        t1.start();
//        t2.start();
//    }

}
