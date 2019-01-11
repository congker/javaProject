package com.example.demo.controller.test.CGLIB.p1;

import org.springframework.cglib.proxy.Enhancer;

/**
 * Created by xuwencong on 2018/12/17
 */
public class TestCglib {
    public static void main(String args[]) {

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(TargetObject.class);
        enhancer.setCallback(new TargetInterceptor());

        TargetObject targetObject2 = (TargetObject) enhancer.create();
        System.out.println(targetObject2);
        System.out.println(targetObject2.method1("传递参数"));
        System.out.println("====================");
        System.out.println(targetObject2.method2(100));
        System.out.println("====================");
        System.out.println(targetObject2.method3(200));
        System.out.println("==========end==========");
    }
}
