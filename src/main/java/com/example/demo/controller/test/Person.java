package com.example.demo.controller.test;

/**
 * Created by xuwencong on 2018/8/9
 */
public class Person {

    static{
        System.out.println("person static");
    }
    public Person(String str) {
        System.out.println("person "+str);
    }
}
