package com.ws.ch2.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;


/**
 * Created by martin on 11/26/16.
 */
@Configuration
@ComponentScan("com.ws.ch2.el")
//@PropertySource("classpath:com.ws.ch2.el.test.properties")
public class ElConfig {

    @Value("I Love You!") //注入普通字符
    private String noraml;

    @Value("#{SystemProperties['os.name']}")  //注入系统属性
    private String osName;

    @Value("#{T(java.lang.Math).random()*100.0}")  //注入表达式
    private double randomNumber;

    @Value("#{demoService.another}")  //注入其他 Bean 属性
    private String fromAnother;

//    @Value("classpath:com.ws.ch2.el.test.txt")  //注入文件资源
//    private Resource testFile;

    @Value("http://www.baidu.com")  //注入网址资源
    private Resource testUrl;

//    @Value("${book.name}")  //注入配置文件
//    private String bookName;

    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigure(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource(){
        try{
            System.out.println(noraml);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAnother);
//            System.out.println(IOUtils.toString(testFile.getInputStream()));
//            System.out.println(IOUtils.toString(testUrl.getInputStream()));
//            System.out.println(bookName);
//            System.out.println(environment.getProperty("book.author"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
