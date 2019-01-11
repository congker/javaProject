package com.example.demo.controller.test;

/**
 * Created by xuwencong on 2018/8/9
 */
public class Test2 extends Base {

    static{
        System.out.println("test static");
    }

    private Test2(){
        System.out.println("test constructor");
    }

    public static void main(String[] args) {
        new Test2();
    }
}


