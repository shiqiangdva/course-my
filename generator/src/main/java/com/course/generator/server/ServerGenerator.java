package com.course.generator.server;

import com.course.generator.util.FreemarkerUtil;
import freemarker.template.TemplateException;

import java.io.IOException;

/**
 * @Author V丶x
 * @Date: 2020-05-25 11:05
 * @Email: 1114005726@qq.com
 **/
public class ServerGenerator {
    static String toPath = "generator//src//main//java//com//course//generator//test//";

    public static void main(String[] args) throws IOException, TemplateException {
        FreemarkerUtil.initConfig("test.ftl");
        FreemarkerUtil.generator(toPath + "Test.java");
    }

}
