package com.ws.ch1.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by martin on 11/25/16.
 *
 * Java 配置是 Spring 4.X 推荐的配置方式,也是 Spring Boot 推荐的配置方式
 * Java 配置是通过 @Configuration 和 @Bean 来实现的
 * 使用原则:全局配置使用 Java 配置; 业务 Bean 配置使用注解配置
 */
public class MainClass {

    public static void main(String[] args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("java config"));

        context.close();
    }
}
