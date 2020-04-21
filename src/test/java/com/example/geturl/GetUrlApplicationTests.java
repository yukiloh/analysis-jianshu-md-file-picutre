package com.example.geturl;

import com.example.geturl.utils.GetImgUrlUtil;
import com.google.common.base.Charsets;
import com.google.common.graph.Traverser;
import com.google.common.io.Files;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//@SpringBootTest
class GetUrlApplicationTests {

    @Test
    void contextLoads() {
        //需要设置根文件夹的路径,注意win下的\在java中需要更改为\\
        String path = "C:\\Users\\Me\\Desktop\\user-1234567-1587011352";

        GetImgUrlUtil.getImgUrlUtil(path);
        System.out.println("done");
    }
}
