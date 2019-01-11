package com.example.demo.controller.test.image;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

/**
 * Created by xuwencong on 2019/1/2
 */
public class DownloadPicFromURL2 {
    public static void main(String[] args) {
//        String url = "http://hi-163-qn.nosdn.127.net/upload/201812/20/a7b1e330046211e9b66add561925cd5b";
        List<String> urlList = Arrays.asList(

                /* 1 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/11/fa93c780fd5011e8b91a3fcbd43fb61c",

                /* 2 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/11/137e1b10fd5111e8b91a3fcbd43fb61c",

                /* 3 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/11/1b143e90fd5111e8b91a3fcbd43fb61c",

                /* 4 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/12/ce955210fe1911e88f9fc7b1558ed363",

                /* 5 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/12/34cdfdc0fe1a11e88f9fc7b1558ed363",

                /* 6 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/12/5350d010fe1a11e88f9fc7b1558ed363",

                /* 7 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/13/f72a25a0fecf11e8bb675d6f329f15dc",

                /* 8 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/13/5f296080fed011e8b561d3dcb9eb611b",

                /* 9 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/13/88b344b0fed111e8b561d3dcb9eb611b",

                /* 10 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/13/b9e9d710fed111e8b561d3dcb9eb611b",

                /* 11 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/13/accddd00fed211e8b561d3dcb9eb611b",

                /* 12 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/13/08a94400fed511e8b561d3dcb9eb611b",

                /* 13 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/14/79c8c7f0ff9d11e8a983b50b67ab1221",

                /* 14 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/14/af420d10ff9d11e8a983b50b67ab1221",

                /* 15 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/14/92d09920ff9e11e8a983b50b67ab1221",

                /* 16 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/14/b1292720ff9e11e8a983b50b67ab1221",

                /* 17 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/14/9bb39180ffaa11e893948b286eb71961",

                /* 18 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/16/4a5d8f2000ef11e9b56ecb816f8502a0",

                /* 19 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/16/6a87f6f000ef11e9b56ecb816f8502a0",

                /* 20 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/16/8e46820000ef11e9b56ecb816f8502a0",

                /* 21 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/16/c243d58000ef11e9b56ecb816f8502a0",

                /* 22 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/16/cc3a091000ef11e9b56ecb816f8502a0",

                /* 23 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/16/eae8cd6000ef11e9b56ecb816f8502a0",

                /* 24 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/16/52567800012f11e9963f9f4b7309b492",

                /* 25 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/16/6ff3a540012f11e9963f9f4b7309b492",

                /* 26 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/20/ebf6c3a0046011e9b66add561925cd5b",

                /* 27 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/20/c075b870046111e9b66add561925cd5b",

                /* 28 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/20/a7b1e330046211e9b66add561925cd5b",

                /* 29 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/241f6f100c6911e9a5f5a15332fc07bf",

                /* 30 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/7ffd31f00c6911e9a5f5a15332fc07bf",

                /* 31 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/4285c3400c6a11e9a5f5a15332fc07bf",

                /* 32 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/b5ed38400c6a11e9a5f5a15332fc07bf",

                /* 33 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/03c7f1e00c6b11e9a5f5a15332fc07bf",

                /* 34 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/251dba500c6b11e9a5f5a15332fc07bf",

                /* 35 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/94a4e7e00c6b11e9a5f5a15332fc07bf",

                /* 36 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/3ed812a00c6c11e9a5f5a15332fc07bf",

                /* 37 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/a67ef4500c6c11e9a5f5a15332fc07bf",

                /* 38 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/28ed26f00c6d11e9a5f5a15332fc07bf",

                /* 39 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/51c1e1600c6d11e9a5f5a15332fc07bf",

                /* 40 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/9cd082b00c6d11e9a5f5a15332fc07bf",

                /* 41 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/a5af04b00c6d11e9a5f5a15332fc07bf",

                /* 42 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/dc7256000c6d11e9a5f5a15332fc07bf",

                /* 43 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/e2bb60100c6d11e9a5f5a15332fc07bf",

                /* 44 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/eaed4e600c6d11e9a5f5a15332fc07bf",

                /* 45 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/f521ea800c6d11e9a5f5a15332fc07bf",

                /* 46 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/4ad28fc00c6e11e9a5f5a15332fc07bf",

                /* 47 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/132b61f00ccd11e9a08723e7b5532bd1",

                /* 48 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/35f071d00ccd11e9a08723e7b5532bd1",

                /* 49 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/45526ed00ccd11e9a08723e7b5532bd1",

                /* 50 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/5a1252900ccd11e9a08723e7b5532bd1",

                /* 51 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/a4cf03500ccd11e9a08723e7b5532bd1",

                /* 52 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/335e54400cd811e9aadad3842c9f2176",

                /* 53 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/4fb98ba00cd811e9aadad3842c9f2176",

                /* 54 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/c2f9bd000ced11e9922681bcdec64aca",

                /* 55 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/8e5a67b00cee11e9922681bcdec64aca",

                /* 56 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/b8a23a200cee11e9922681bcdec64aca",

                /* 57 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/da470cf00cee11e9922681bcdec64aca",

                /* 58 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/f51c19800cee11e9922681bcdec64aca",

                /* 59 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/1f8ecc800cef11e9922681bcdec64aca",

                /* 60 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/52b373400cef11e9922681bcdec64aca",

                /* 61 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/69bc0e800cef11e9922681bcdec64aca",

                /* 62 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/8de988000cef11e9922681bcdec64aca",

                /* 63 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/a8e41df00cef11e9922681bcdec64aca",

                /* 64 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/07363c300cf011e9922681bcdec64aca",

                /* 65 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/80f337000cf311e98a9169256e000151",

                /* 66 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/d62f48800cf311e98a9169256e000151",

                /* 67 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/eb5827400cf311e98a9169256e000151",

                /* 68 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/275a17800cf411e98a9169256e000151",

                /* 69 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/414783300cf411e98a9169256e000151",

                /* 70 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/67b10a000cf411e98a9169256e000151",

                /* 71 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/d435cd000cf411e98a9169256e000151",

                /* 72 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/dfc27f100cf411e98a9169256e000151",

                /* 73 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/130f6e500cf511e98a9169256e000151",

                /* 74 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/5474c3900cf511e98a9169256e000151",

                /* 75 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/929f12100cf511e98a9169256e000151",

                /* 76 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/c2eca4000cf511e98a9169256e000151",

                /* 77 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/cd338fa00cf511e98a9169256e000151",

                /* 78 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/d44540e00cf511e98a9169256e000151",

                /* 79 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/df1a3bb00cf511e98a9169256e000151",

                /* 80 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/e73baf400cf511e98a9169256e000151",

                /* 81 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/edb120800cf511e98a9169256e000151",

                /* 82 */

                "http://hi-163-qn.nosdn.127.net/upload/201812/31/f75c1a400cf511e98a9169256e000151",

                /* 83 */

                "http://hi-163-qn.nosdn.127.net/upload/201901/01/351494500d1b11e9a5811baff0b5ed9b",

                /* 84 */

                "http://hi-163-qn.nosdn.127.net/upload/201901/01/675c96b00d1b11e9a5811baff0b5ed9b",

                /* 85 */

                "http://hi-163-qn.nosdn.127.net/upload/201901/01/79ad28200d1b11e9a5811baff0b5ed9b",

                /* 86 */

                "http://hi-163-qn.nosdn.127.net/upload/201901/01/881079d00d1b11e9a5811baff0b5ed9b",

                /* 87 */

                "http://hi-163-qn.nosdn.127.net/upload/201901/01/ccfa89000d1b11e9a5811baff0b5ed9b",

                /* 88 */

                "http://hi-163-qn.nosdn.127.net/upload/201901/01/e74975a00d1b11e9a5811baff0b5ed9b",

                /* 89 */

                "http://hi-163-qn.nosdn.127.net/upload/201901/01/17540b200d1c11e9a5811baff0b5ed9b",

                /* 90 */

                "http://hi-163-qn.nosdn.127.net/upload/201901/01/3fb73f100d1c11e9a5811baff0b5ed9b",

                /* 91 */

                "http://hi-163-qn.nosdn.127.net/upload/201901/01/8b460ce00d1c11e9a5811baff0b5ed9b",

                /* 92 */

                "http://hi-163-qn.nosdn.127.net/upload/201901/01/919b9a100d1c11e9a5811baff0b5ed9b",

                /* 93 */

                "http://hi-163-qn.nosdn.127.net/upload/201901/01/b40f2e900d1c11e9a5811baff0b5ed9b",

                /* 94 */

                "http://hi-163-qn.nosdn.127.net/upload/201901/01/bab4d7900d1c11e9a5811baff0b5ed9b",

                /* 95 */

                "http://hi-163-qn.nosdn.127.net/upload/201901/01/c6d58c400d1c11e9a5811baff0b5ed9b",

                /* 96 */

                "http://hi-163-qn.nosdn.127.net/upload/201901/01/d965e5d00d1c11e9a5811baff0b5ed9b",

                /* 97 */

                "http://hi-163-qn.nosdn.127.net/upload/201901/01/f49d5db00d1c11e9a5811baff0b5ed9b",

                /* 98 */

                "http://hi-163-qn.nosdn.127.net/upload/201901/01/1bbc51d00d1d11e9a5811baff0b5ed9b",

                /* 99 */

                "http://hi-163-qn.nosdn.127.net/upload/201901/01/64ddc9200d1d11e9a5811baff0b5ed9b",

                /* 100 */

                "http://hi-163-qn.nosdn.127.net/upload/201901/01/9407c2a00d1d11e9a5811baff0b5ed9b",

                /* 101 */

                "http://hi-163-qn.nosdn.127.net/upload/201901/01/a153b0e00d1d11e9a5811baff0b5ed9b",

                /* 102 */

                "http://hi-163-qn.nosdn.127.net/upload/201901/01/acad45000d1d11e9a5811baff0b5ed9b",

                /* 103 */

                "http://hi-163-qn.nosdn.127.net/upload/201901/01/b94cedb00d1d11e9a5811baff0b5ed9b",

                /* 104 */

                "http://hi-163-qn.nosdn.127.net/upload/201901/01/c91219500d1d11e9a5811baff0b5ed9b",

                /* 105 */

                "http://hi-163-qn.nosdn.127.net/upload/201901/01/d95a30900d1d11e9a5811baff0b5ed9b",

                /* 106 */

                "http://hi-163-qn.nosdn.127.net/upload/201901/01/e19398f00d1d11e9a5811baff0b5ed9b",

                /* 107 */

                "http://hi-163-qn.nosdn.127.net/upload/201901/01/ecd649b00d1d11e9a5811baff0b5ed9b",

                /* 108 */

                "http://hi-163-qn.nosdn.127.net/upload/201901/01/feb925300d1d11e9a5811baff0b5ed9b",

                /* 109 */

                "http://hi-163-qn.nosdn.127.net/upload/201901/01/fb5e62300db111e9bdf8d7768cefdba7",

                /* 110 */

                "http://hi-163-qn.nosdn.127.net/upload/201901/01/4173f9100db211e9bdf8d7768cefdba7"

        );

        int i = 1;
        for (String item : urlList) {
            String path = "E:/Download/programImage/7/" + i + ".jpg";
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
