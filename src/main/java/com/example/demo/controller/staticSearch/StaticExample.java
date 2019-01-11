package com.example.demo.controller.staticSearch;

/**
 * Created by xuwencong on 2018/8/15
 */
public class StaticExample {

    static int A = 0;           //静态常量
    static int B;               //静态变量
    private String str = "abc";         //非静态常量
    public void method1(){                    //非静态方法

        System.out.println(StaticExample.A);  //调用静态常量
        System.out.println(StaticExample.B);  //调用静态变量
        System.out.println(str);              //调用非静态常量
        method2();                            //调用静态方法
    }
    private static void method2(){             //静态方法
        StaticExample.A=2;
        System.out.println(StaticExample.A);  //调用静态常量
        System.out.println(StaticExample.B);  //调用静态变量
//        System.out.println(str);              //不能调用非静态常量
//        method1();                            //不能调用静态方法
    }
    static{
        method2();
        System.out.println("A1:"+A);                //调用静态常量
        //System.out.println(str);              //不能调用静态方法
    }
    static class InnerClass{                       //静态内部类
        static void method3(){                     //静态内部类的方法
            System.out.println(A);                 //调用外部类的静态常量
     }

    public static void main(String args[]){    //定义主方法
            System.out.println(StaticExample.A);   //调用静态常量
            System.out.println(StaticExample.B);   //调用静态变量
            //System.out.println(str);               //不能调用非静态常量
            //method1();                             //不能调用静态方法
            method3();                             //调用内部类的方法
        }
    }

}
