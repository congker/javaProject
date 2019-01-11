package com.example.demo.controller.test.CGLIB.p2;

import org.springframework.cglib.proxy.FixedValue;

/**
 * Created by xuwencong on 2018/12/17
 */
public class TargetResultFixed implements FixedValue {
    /**
     * 该类实现FixedValue接口，同时锁定回调值为999
     * (整型，CallbackFilter中定义的使用FixedValue型回调的方法为getConcreteMethodFixedValue，该方法返回值为整型)。
     */
    @Override
    public Object loadObject() throws Exception {
        System.out.println("锁定结果");
        Object obj = 999;
        return obj;
    }

}
