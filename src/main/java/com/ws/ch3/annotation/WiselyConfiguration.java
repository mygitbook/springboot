package com.ws.ch3.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * Created by martin on 11/27/16.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration //组合 @Configuration 注解
@ComponentScan  //组合 @ComponentScan 注解
public @interface WiselyConfiguration {

    String[] value() default {}; //覆盖 value 参数
}
