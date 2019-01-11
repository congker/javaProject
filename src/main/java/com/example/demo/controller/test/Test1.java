package com.example.demo.controller.test;

/**
 * Created by xuwencong on 2018/8/9
 */
public class Test1 {

    static int value = 33;

    public static void main(String[] args) throws Exception{
        new Test1().printValue();
    }

    private void printValue(){
        int value = 3;
        System.out.println(this.value);
    }
}
