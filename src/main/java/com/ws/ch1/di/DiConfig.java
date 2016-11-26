package com.ws.ch1.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by martin on 11/25/16.
 */
@Configuration //通过 @Configuration 注解声明当前类一个配置类
@ComponentScan("com.ws.ch1.di") //通过 @ComponentScan 注解自动扫描包名下所有使用 声明注解 的类,并注册为 Bean
public class DiConfig {
}
