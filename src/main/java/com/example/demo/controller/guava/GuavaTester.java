package com.example.demo.controller.guava;

import java.util.Optional;

/**
 * Created by xuwencong on 2018/9/10
 */
public class GuavaTester {
    public static void main(String[] args) {
        GuavaTester guavaTester = new GuavaTester();
        Integer a =  null;
        Integer b =  new Integer(10);
        System.out.println(guavaTester.sum(a,b));

    }

    private Integer sum(Integer a, Integer b){
        return a + b;
    }

    public Integer sum(Optional<Integer> a, Optional<Integer> b){
        return a.get() + b.get();
    }
}
