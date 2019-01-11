package com.example.demo.controller.test.teiba;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Created by xuwencong on 2018/9/28
 */
public class Teste {

    public static void main(String[] args) {
        try {
            int page;

            //访问总吧
            Document doc = PostBar.GetHtml();

            Elements baiduPost = doc.select("a.j_th_tit");
            System.out.println(baiduPost.attr("href"));
            for (Element item : baiduPost) {
                page = 1;
                System.out.println(item.attr("href"));
                Document doc0 = Page.GetHtml(item.attr("href"), page);
                int pageFlag = Page.GetPage(doc0);
                do {

                    Document doc1 = Page.GetHtml(item.attr("href"), page);
                    Elements resultTitle = doc1.getElementsByClass("core_title_txt");

                    System.out.println("标题:" + resultTitle.text());
                    System.out.println("第" + page + "页");

                    Elements results = doc1.getElementsByClass("d_post_content_main");
                    Elements userName = doc1.getElementsByClass("icon");

                    for (int i = 0; i < results.size(); i++) {
                        Element result = results.get(i);
                        Element links = result.getElementsByTag("div").get(0);
                        Element username = userName.get(i);
                        Elements name = username.getElementsByTag("img");
                        System.out.println(i + ",username:" + name.attr("username") + ",links:" + links.text());
                    }
                } while (pageFlag != page++);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
