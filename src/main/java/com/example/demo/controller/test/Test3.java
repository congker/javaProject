package com.example.demo.controller.test;

/**
 * Created by xuwencong on 2018/8/9
 */
public class Test3 {
    Person person = new Person("Test");
    static{
        System.out.println("test static");
    }

    public Test3() {
        System.out.println("test constructor");
    }

    public static void main(String[] args) {
        new MyClass();
    }
}


