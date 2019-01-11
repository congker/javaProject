package com.example.demo.controller.test.image;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

/**
 * Created by xuwencong on 2019/1/2
 */
public class DownloadPicFromURL {
    public static void main(String[] args) {
//        String url = "http://hi-163-qn.nosdn.127.net/upload/201812/20/a7b1e330046211e9b66add561925cd5b";
        List<String> urlList = Arrays.asList(

                /* 1 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/20/a7b1e330046211e9b66add561925cd5b",

                /* 2 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/241f6f100c6911e9a5f5a15332fc07bf",

                /* 3 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/7ffd31f00c6911e9a5f5a15332fc07bf",

                /* 4 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/4285c3400c6a11e9a5f5a15332fc07bf",

                /* 5 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/b5ed38400c6a11e9a5f5a15332fc07bf",

                /* 6 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/03c7f1e00c6b11e9a5f5a15332fc07bf",

                /* 7 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/251dba500c6b11e9a5f5a15332fc07bf",

                /* 8 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/94a4e7e00c6b11e9a5f5a15332fc07bf",

                /* 9 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/3ed812a00c6c11e9a5f5a15332fc07bf",

                /* 10 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/a67ef4500c6c11e9a5f5a15332fc07bf",

                /* 11 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/28ed26f00c6d11e9a5f5a15332fc07bf",

                /* 12 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/51c1e1600c6d11e9a5f5a15332fc07bf",

                /* 13 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/9cd082b00c6d11e9a5f5a15332fc07bf",

                /* 14 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/a5af04b00c6d11e9a5f5a15332fc07bf",

                /* 15 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/dc7256000c6d11e9a5f5a15332fc07bf",

                /* 16 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/e2bb60100c6d11e9a5f5a15332fc07bf",

                /* 17 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/eaed4e600c6d11e9a5f5a15332fc07bf",

                /* 18 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/f521ea800c6d11e9a5f5a15332fc07bf",

                /* 19 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/4ad28fc00c6e11e9a5f5a15332fc07bf",

                /* 20 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/35f071d00ccd11e9a08723e7b5532bd1",

                /* 21 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/45526ed00ccd11e9a08723e7b5532bd1",

                /* 22 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/5a1252900ccd11e9a08723e7b5532bd1",

                /* 23 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/a4cf03500ccd11e9a08723e7b5532bd1",

                /* 24 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/335e54400cd811e9aadad3842c9f2176",

                /* 25 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/4fb98ba00cd811e9aadad3842c9f2176",

                /* 26 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/c2f9bd000ced11e9922681bcdec64aca",

                /* 27 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/8e5a67b00cee11e9922681bcdec64aca",

                /* 28 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/b8a23a200cee11e9922681bcdec64aca",

                /* 29 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/da470cf00cee11e9922681bcdec64aca",

                /* 30 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/f51c19800cee11e9922681bcdec64aca",

                /* 31 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/1f8ecc800cef11e9922681bcdec64aca",

                /* 32 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/52b373400cef11e9922681bcdec64aca",

                /* 33 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/69bc0e800cef11e9922681bcdec64aca",

                /* 34 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/8de988000cef11e9922681bcdec64aca",

                /* 35 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/a8e41df00cef11e9922681bcdec64aca",

                /* 36 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/07363c300cf011e9922681bcdec64aca",

                /* 37 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/80f337000cf311e98a9169256e000151",

                /* 38 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/d62f48800cf311e98a9169256e000151",

                /* 39 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/eb5827400cf311e98a9169256e000151",

                /* 40 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/275a17800cf411e98a9169256e000151",

                /* 41 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/414783300cf411e98a9169256e000151",

                /* 42 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/67b10a000cf411e98a9169256e000151",

                /* 43 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/d435cd000cf411e98a9169256e000151",

                /* 44 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/dfc27f100cf411e98a9169256e000151",

                /* 45 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/130f6e500cf511e98a9169256e000151",

                /* 46 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/5474c3900cf511e98a9169256e000151",

                /* 47 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/929f12100cf511e98a9169256e000151",

                /* 48 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/c2eca4000cf511e98a9169256e000151",

                /* 49 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/cd338fa00cf511e98a9169256e000151",

                /* 50 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/d44540e00cf511e98a9169256e000151",

                /* 51 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/df1a3bb00cf511e98a9169256e000151",

                /* 52 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/e73baf400cf511e98a9169256e000151",

                /* 53 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/edb120800cf511e98a9169256e000151",

                /* 54 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/f75c1a400cf511e98a9169256e000151"
        );

        int i = 1;
        for (String item : urlList) {
            String path = "E:/Download/programImage/6/" + i + ".jpg";
            downloadPicture(item, path);
            i++;
        }

    }

    //链接url下载图片
    private static void downloadPicture(String urlList, String path) {
        URL url;
        try {
            url = new URL(urlList);
            DataInputStream dataInputStream = new DataInputStream(url.openStream());

            FileOutputStream fileOutputStream = new FileOutputStream(new File(path));
            ByteArrayOutputStream output = new ByteArrayOutputStream();

            byte[] buffer = new byte[1024];
            int length;

            while ((length = dataInputStream.read(buffer)) > 0) {
                output.write(buffer, 0, length);
            }
            fileOutputStream.write(output.toByteArray());
            dataInputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
