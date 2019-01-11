package com.example.demo.controller.test;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.CtNewMethod;

/**
 * Created by xuwencong on 2019/1/7
 */
public class Test8 {
    public static void main(String[] args) throws Exception {
        ClassPool pool = ClassPool.getDefault();
        //创建 AutoGenerateClass 类
        CtClass cc= pool.makeClass("com.guanpj.AutoGenerateClass");
        //定义 show 方法
        CtMethod method = CtNewMethod.make("public void show(){}", cc);
        //插入方法代码
        method.insertBefore("System.out.println(\"I'm just test generate .class file by javassit.....\");");
        cc.addMethod(method);
        //保存生成的字节码
        cc.writeFile("D://temp");
    }

}
