package com.ws.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by martin on 11/26/16.
 */
@Configuration
@ComponentScan("com.ws.ch1.aop")
@EnableAspectJAutoProxy //使用 @EnableAspectJAutoProxy 开启 Spring 对 AspectJ 的支持
public class AopConfig {
}
