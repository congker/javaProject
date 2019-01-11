package com.example.demo.controller.sync;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 多线程组件
 * Created by xuwencong on 2018/9/21
 */
public class CountDownLatchTest {

    public static void main(String[] args) {
        final CountDownLatch begin = new CountDownLatch(1);

        final ExecutorService exec = Executors.newFixedThreadPool(10);

        for (int index = 0; index < 10; index++) {
            final int NO = index + 1;

            Runnable run = () -> {
                try {
                    begin.await();
                    Thread.sleep((long) (Math.random() * 10000));
                    System.out.println("NO." + NO + " excute")
                    ;
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("this is finally");
                }
            };
            exec.submit(run);
        }

        System.out.println("开始执行");
        begin.countDown();

        exec.shutdown();
    }
}
