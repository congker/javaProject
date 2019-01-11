package com.example.demo.controller.test;


import redis.clients.jedis.Jedis;

/**
 * Created by xuwencong on 2018/9/28
 */
public class Test5 {

    public class DoSomething implements Runnable {
        private String name;

        private DoSomething(String name) {
            this.name = name;
        }

        public void run() {
            for (int i = 0; i < 5; i++) {
                for (long k = 0; k < 100000000; k++) ;
                System.out.println(name + ": " + i);
            }
        }
    }

    public static void main(String[] args) {

        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("127.0.0.1");
        System.out.println("连接成功");
        //查看服务是否运行
        System.out.println("服务正在运行: "+jedis.ping());
        jedis.select(15);
//        jedis.setnx()
        jedis.set("key3","eeee");
        jedis.expire("key3",20);


//        DoSomething ds1 = new DoSomething("张三");
//        DoSomething ds2 = new DoSomething("李四");
//
//        Thread t1 = new Thread(ds1);
//        Thread t2 = new Thread(ds2);
//
//        t1.start();
//        t2.start();
    }


}
