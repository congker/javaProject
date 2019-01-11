package com.example.demo.controller.test.teiba;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by xuwencong on 2018/10/22
 */
public class Page {

    public static Document GetHtml(String url, int page) throws IOException {
        Document document = Jsoup.connect("http://tieba.baidu.com" + url + "?pn=" + page)
                .userAgent("Mozilla/5.0 (Windows; U; Windows NT 5.1; zh-CN; rv:1.9.2.15)")
                .timeout(3000)
                .get();
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return document;
    }

    public static int GetPage(Document doc) {
        Elements resultPage = doc.getElementsByClass("l_reply_num");
        Element result0 = resultPage.get(0);
        Element result1 = result0.getElementsByTag("span").get(1);
        System.out.println(result1.text());
        String number = result1.text();
        int page = Integer.parseInt(number);
        return page;
    }
}
