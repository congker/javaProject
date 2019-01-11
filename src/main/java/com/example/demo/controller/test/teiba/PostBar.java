package com.example.demo.controller.test.teiba;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * Created by xuwencong on 2018/10/22
 */
public class PostBar {

    public static Document GetHtml() throws Exception{
        //想爬哪个吧就把这里的url换掉
        //
        //http://tieba.baidu.com/f?ie=utf-8&kw=%E9%83%91%E7%A7%80%E5%A6%8D
        Document doc = Jsoup.connect("http://dq.tieba.com/f?kw=%E6%8A%97%E5%8E%8B&mo_device=1")
                .userAgent("Mozilla/5.0 (Windows; U; Windows NT 5.1; zh-CN; rv:1.9.2.15)")
                .timeout(5000)
                .get();

        return doc;
    }
}
