package com.example.demo.controller.java7;

/**
 * Created by xuwencong on 2018/9/12
 */
public class Test extends WithInner.Inner {
    Test(WithInner wi){
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi =new WithInner();
        Test test=new Test(wi);
    }
}
