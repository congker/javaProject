package com.example.demo;

import com.example.demo.controller.aop.TargetClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
    }


    @Test
    public void testAOP() {
        //1、创建Spring的IOC的容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:bean.xml");

        //2、从IOC容器中获取bean的实例
        TargetClass targetClass = (TargetClass) ctx.getBean("targetClass");

        //3、使用bean
        String result = targetClass.joint("spring", "aop");
        System.out.println("result:" + result);
    }


    @Test
    public void hashMapTest() {
//        long star = System.currentTimeMillis();
//
//        Set<Integer> hashset = new HashSet<>(100000000);
//        for (int i = 0; i < 100000000; i++) {
//            hashset.add(i);
//        }
//        Assert.assertTrue(hashset.contains(1));
//        Assert.assertTrue(hashset.contains(2));
//        Assert.assertTrue(hashset.contains(3));
//
//        long end = System.currentTimeMillis();
//        System.out.println("执行时间：" + (end - star));

        //取模
        int a = 5;
           int b = 3;
           System.out.println(a % b);
    }

}