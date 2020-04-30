package com.example.getUrl.utils;

import com.google.common.base.Charsets;
import com.google.common.graph.Traverser;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetImgUrlUtil {
    public static void getImgUrlUtil(String path) {
        File root = new File(path);

        //利用guava的深度优先+先序遍历
        Traverser<File> fileTraverser = Files.fileTraverser();
        Iterable<File> files = fileTraverser.depthFirstPreOrder(root);

        //正则匹配,参考地址:https://upload-images.jianshu.io/upload_images/5858534-c171c323f995413f.png
        Pattern pattern = Pattern.compile("https?:\\/\\/.*\\.(png|jpg|jpeg|gif)");

        //进行文件夹的遍历
        files.forEach(file -> {
            if (file.isFile()) {
                try {
                    List<String> post = Files.readLines(file, Charsets.UTF_8);

                    //遍历单篇文章的每一行
                    post.forEach(line->{
                        Matcher matcher = pattern.matcher(line);
                        while (matcher.find()) {
                            //匹配则打印结果
                            if (!matcher.group().isEmpty()) System.out.println(matcher.group());
                        }
                    });
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
