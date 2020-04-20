package com.example.geturl.utils;

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

        //guava利用guava的深度优先+先序遍历
        Traverser<File> fileTraverser = Files.fileTraverser();
        Iterable<File> files = fileTraverser.depthFirstPreOrder(root);
        Pattern pattern = Pattern.compile("(https://.*(\\.png)||(\\.jpg))");

        //通过获取的迭代来遍历,利用Consumer来制定文件筛选规则
        files.forEach(file -> {
            if (file.isFile()) {
                try {
                    List<String> list = Files.readLines(file, Charsets.UTF_8);
                    //参考地址:https://upload-images.jianshu.io/upload_images/5858534-c171c323f995413f.png
                    list.forEach(line->{
                        Matcher matcher = pattern.matcher(line);
                        while (matcher.find()) {
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
