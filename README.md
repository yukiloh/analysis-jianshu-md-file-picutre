# 一键获取简书.md文件中图片的url

### 简介
简书是支持一键下载所有已发表的文章的
![示意图](https://raw.githubusercontent.com/yukiloh/my-image-repo/master/%E6%89%B9%E6%B3%A8%202020-04-20%20123243.png)

但是.md中的图片并不会跟着被下载
因此设计了本工具类


### JavaScript版
##### 运行方法
入口文件: ```/javascript-version/index.html```

##### 效果图
因为跨域问题需要另外手动下载,直接ctrl+a就可以复制所有地址
![示意图](https://raw.githubusercontent.com/yukiloh/my-image-repo/master/f8e2e0cf-450f-4264-9e41-315690dc8c16.png)


### JAVA版

##### 主要依赖
```xml
<!-- https://mvnrepository.com/artifact/com.google.guava/guava -->
<dependency>
    <groupId>com.google.guava</groupId>
    <artifactId>guava</artifactId>
    <version>28.2-jre</version>
</dependency>
```

##### 运行方法
test文件夹下的```GetUrlApplicationTests.java```

##### 效果图
![示意图](https://raw.githubusercontent.com/yukiloh/my-image-repo/master/%E6%89%B9%E6%B3%A8%202020-04-20%20124228.png)



### 感受
Java比JS好写一万倍...