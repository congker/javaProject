package com.example.demo.controller.test.CGLIB.p3;

import com.example.demo.controller.test.CGLIB.p1.TargetObject;
import org.springframework.cglib.proxy.Dispatcher;

/**
 * Created by xuwencong on 2018/12/17
 */
public class ConcreteClassDispatcher implements Dispatcher {

    @Override
    public Object loadObject() throws Exception {
        System.out.println("before Dispatcher...");
        PropertyBean propertyBean = new PropertyBean();
        propertyBean.setKey("xxx");
        propertyBean.setValue(new TargetObject());
        System.out.println("after Dispatcher...");
        return propertyBean;
    }

}
