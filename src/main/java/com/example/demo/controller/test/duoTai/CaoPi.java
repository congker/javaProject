package com.example.demo.controller.test.duoTai;

/**
 * Created by xuwencong on 2018/12/14
 */
public class CaoPi extends CaoCao {

    public void write() { // 子类覆盖父类方法
        System.out.println("记住仇恨，表明我们要奋发图强的心智");
    }

    public void eat() {
        System.out.println("我不喜欢读书，我就喜欢吃");
    }

    public static void main(String[] args) {
        // 父类引用指向子类对象
        CaoCao[] wangers = { new CaoCao(), new CaoPi() };

        for (CaoCao wanger : wangers) {
            // 对象是王二的时候输出：勿忘国耻
            // 对象是王小二的时候输出：记住仇恨，表明我们要奋发图强的心智
            wanger.write();
        }
    }
}
