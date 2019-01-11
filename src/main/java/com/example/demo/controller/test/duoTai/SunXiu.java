package com.example.demo.controller.test.duoTai;

/**
 * Created by xuwencong on 2018/12/14
 */
public class SunXiu extends SunQuan {
    private int age = 3;
    public SunXiu(int age) {
        this.age = age;
        System.out.println("王小三的年龄：" + this.age);
    }

    public void write() { // 子类覆盖父类方法
        System.out.println("我小三上幼儿园的年龄是：" + this.age);
    }

    public static void main(String[] args) {
        new SunXiu(4);
//        上幼儿园之前
//        我小三上幼儿园的年龄是：0
//        上幼儿园之后
//        王小三的年龄：4
    }
}
