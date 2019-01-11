package com.example.demo.controller.test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by xuwencong on 2018/12/3
 */
public class Test7 {

    private static final ThreadLocal<String> LOG_BEAN_THREAD_LOCAL = ThreadLocal.withInitial(String::new);

    public static void main(String[] args) throws Exception{
//      float f1=6.6f;
//      float f2=1.3f;
//      double d1=6.6;
//      double d2=1.3;
//        System.out.println(d1+d2);

//        String str = null;
//        str = String.format("Hi,%s", "王力");
//        System.out.println(str);
//        str = String.format("Hi,%s:%s.%s", "王南", "王力", "王张");
//        System.out.println(str);
//        System.out.printf("字母a的大写是：%c %n", 'A');
//        System.out.printf("3>7的结果是：%b %n", 3 > 7);
//        System.out.printf("100的一半是：%d %n", 100 / 2);
//        System.out.printf("100的16进制数是：%x %n", 100);
//        System.out.printf("100的8进制数是：%o %n", 100);
//        System.out.printf("50元的书打8.5折扣是：%f 元%n", 50 * 0.85);
//        System.out.printf("上面价格的16进制数是：%a %n", 50 * 0.85);
//        System.out.printf("上面价格的指数表示：%e %n", 50 * 0.85);
//        System.out.printf("上面价格的指数和浮点数结果的长度较短的是：%g %n", 50 * 0.85);
//        System.out.printf("上面的折扣是%d%% %n", 85);
//        System.out.printf("字母A的散列码是：%h %n", 'A');
        String thread = LOG_BEAN_THREAD_LOCAL.get();
        System.out.println("thread:" + thread);
        System.out.println("2:" + Class.forName(thread));
//        List<Integer> integers = Arrays.asList(1, 2);
//        processIntegers(integers);
    }

    public static void processIntegers(List<Integer> integers) {

        for (Integer value : integers) {
            for (int i = integers.size() - 1; i >= 0; i--) {
                value += integers.get(i);
                System.out.println("value:" + value);
            }
        }
    }
}
