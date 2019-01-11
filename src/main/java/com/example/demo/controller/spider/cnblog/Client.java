//package com.example.demo.controller.spider.cnblog;
//
//import com.sun.deploy.net.HttpResponse;
//import org.springframework.http.HttpEntity;
//
//import javax.lang.model.util.Elements;
//import javax.swing.text.Document;
//import javax.swing.text.Element;
//import java.io.IOException;
//
///**
// * Created by xuwencong on 2018/8/9
// */
//public class Client {
//
//    // SendPost,cnblog專用
//    public static String SendPostCnBlog(String url, JSONObject jo) {
//        CloseableHttpClient client = HttpClients.createDefault();
//        String result = "查询失败";
//        try {
//            HttpPost httpPost = new HttpPost(url);
//            StringEntity entity = new StringEntity(jo.toString(), "utf-8");// 解决中文乱码问题
//            entity.setContentEncoding("UTF-8");
//            entity.setContentType("application/json");
//            httpPost.setEntity(entity);
//            HttpResponse resp = client.execute(httpPost);
//
//            if (resp.getStatusLine().getStatusCode() == 200) {
//                HttpEntity he = resp.getEntity();
//                result = EntityUtils.toString(he, "UTF-8");
//            }
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } finally {
//            try {
//                client.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
//        }
//        return result;
//    }
//
//    //cnblog -post请求
//    public static JSONObject jsonMaker(int i){
//        JSONObject jo = new JSONObject();
//        jo.put("CategoryType", "TopDiggs");
//        jo.put("ParentCategoryId", 0);
//        jo.put("CategoryId", 0);
//        jo.put("PageIndex", i);
//        jo.put("TotalPostCount", 0);
//        jo.put("ItemListActionName", "PostList");
//
//        return jo;
//    }
//
//    // 获取cnblog详细内容
//    public static ArrayList<Cnblog> GetContens(String content) {
//        ArrayList<Cnblog> results = new ArrayList<Cnblog>();
//        Document doc = Jsoup.parse(content);
//        Elements items = doc.getElementsByClass("post_item_body");
//        for (Element item : items) {
//            Element h2TagEle = item.getElementsByTag("h3").first(); // 推荐内容标题元素
//            Element aTagEl = h2TagEle.getElementsByTag("a").first(); // 推荐内容的Url超链接元素
//            String href = aTagEl.attr("href");
//            System.out.println(aTagEl.text() + "  " + href);
//        }
//        return results;
//    }
//}
