package com.example.demo.controller.test;

/**
 * Created by xuwencong on 2018/8/9
 */
public class MyClass extends Test3{

    Person person = new Person("MyClass");
    static{
        System.out.println("myclass static");
    }

    public MyClass() {
        System.out.println("myclass constructor");
    }
}
