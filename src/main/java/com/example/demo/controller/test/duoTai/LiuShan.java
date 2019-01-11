package com.example.demo.controller.test.duoTai;

/**
 * Created by xuwencong on 2018/12/14
 */
public class LiuShan extends LiuBei {
    public void write() {
        System.out.println("记住仇恨，表明我们要奋发图强的心智");
    }

    public void eat() {
        System.out.println("我不喜欢读书，我就喜欢吃");
    }

    public static void main(String[] args) {
        LiuBei[] wangsis = { new LiuBei(), new LiuShan() };

        // wangsis[1]能够向下转型
        ((LiuShan) wangsis[1]).write();
        // wangsis[0]不能向下转型
        ((LiuShan)wangsis[0]).write();
    }
}
