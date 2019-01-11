package com.example.demo.controller.test;


import com.example.demo.entity.pojo.NullClass;
import com.example.demo.entity.pojo.User;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Created by xuwencong on 2018/9/28
 */
public class Test6 {

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


//
//    private static NullClass.myTest1.myTest2 testSimple(NullClass req) throws Exception {
//        Class nullClass = Class.forName("NullClass");
//
//        if (req == null) {
//            return "";
//        }
//        if (req.getTest1() == null) {
//            return "";
//        }
//        if (req.getTest1().getTest2() == null) {
//            return "";
//        }
////        if (req.getTest1().getTest2().getInfo() == null) {
////            return "";
////        }
//        return req.getTest1();
//    }
//
//    public String testOptional(Test test) {
//        return Optional.ofNullable(test).flatMap(Test::getTest3)
//                .flatMap(Test3::getTest2)
//                .map(Test2::getInfo)
//                .orElse("");
//    }


    public static void main(String[] args) {
        // 用匿名内部类的方式来创建线程
//        new Thread(new Runnable() {
//            @Override public void run() {
//                System.out.println("公众号：Java3y---回复1进群交流");
//            }
//        }
//        );
        // 使用Lambda来创建线程
//        new Thread(() -> System.out.println("公众号：Java3y---回复1进群交流"));

//        Map<String, String> hashMap = new HashMap<>();
//        hashMap.put("公众号", "Java3y");
//        hashMap.put("交流群", "回复1");

        // 使用增强for的方式来遍历hashMap
//        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
//            System.out.println(entry.getKey()+":"+entry.getValue());
//        }

//        hashMap.forEach((s,s2)-> System.out.println(s+":"+s2));


//        User user = new User();
//        User user1 = null;
//
//        Optional<User> op1 = Optional.ofNullable(user);
//        System.out.println(op1.isPresent());
//        System.out.println(op1.orElse(user1));
//        System.out.println(op1.get());


        System.out.println(System.getProperty("sun.boot.class.path"));

    }


}
