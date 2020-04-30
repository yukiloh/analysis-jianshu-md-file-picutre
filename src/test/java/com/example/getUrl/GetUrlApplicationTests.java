package com.example.getUrl;

import com.example.getUrl.utils.GetImgUrlUtil;
import com.github.houbb.markdown.toc.core.impl.AtxMarkdownToc;
import com.github.houbb.markdown.toc.vo.TocGen;
import org.junit.jupiter.api.Test;

//@SpringBootTest
class GetUrlApplicationTests {

    @Test
    void contextLoads() {
        //需要设置根文件夹的路径,注意win下的\在java中需要更改为\\
        String path = "C:\\Users\\Me\\Desktop\\user-1234567-1587011352";

        GetImgUrlUtil.getImgUrlUtil(path);
        System.out.println("done");
    }




    //用于生成.md的目录
    @Test
    void contextLoads2() {
        TocGen tocGen = AtxMarkdownToc.newInstance().genTocFile("README2.md");
    }







}


