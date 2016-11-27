package com.ws.ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by martin on 11/26/16.
 *
 * Spring EL-Spring 表达式语言,支持在 xml 和注解中使用表达式,主要在 @Value 中使用
 * 常用:注入普通字符,操作系统属性,表达式运算结果,其他 Bean 属性,文件内容,网址内容,属性文件等
 */
public class MainClass {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);

        // TODO: 11/27/16 Property or field 'SystemProperties' cannot be found on object of type 'org.springframework.beans.factory.config.BeanExpressionContext'
        ElConfig resourceService = context.getBean(ElConfig.class);
        resourceService.outputResource();

        context.close();
    }
}
