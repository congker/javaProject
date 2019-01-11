package com.example.demo.entity.pojo;

/**
 * Created by xuwencong on 2018/11/26
 */
public class NullClass {

    public  myTest1 getTest1(){
        return new myTest1();
    }

    class myTest1{
        public String m1(){
            System.out.println("==========");
            return "===getTest1===";
        }
        public   myTest2 getTest2(){
            return new myTest2();
        }

        class  myTest2{

            public String m2(){
                System.out.println("==========");
                return "===getTest1===";
            }

        }
    }
}
