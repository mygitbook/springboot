package com.ws.ch1.aop;

import java.lang.annotation.*;

/**
 * Created by martin on 11/25/16.
 * 拦截规则注解: 注解本身没有功能,是一种元数据,即配置
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {

    String name();
}
