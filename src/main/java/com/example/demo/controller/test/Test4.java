package com.example.demo.controller.test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xuwencong on 2018/9/28
 */
public class Test4 {
    public static void main(String[] args) {
        //初始化Map
        Map<String , String> map = new HashMap<String , String>(){{
             put("key1", "value122");
             put("key2", "value2");
             put("keyN", "valueN");
      }};
        System.out.println("map:"+map);
    }
}
