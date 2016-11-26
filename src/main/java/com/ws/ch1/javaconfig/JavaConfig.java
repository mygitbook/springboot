package com.ws.ch1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by martin on 11/25/16.
 */
@Configuration  // 使用 @Configuration 注解表明当前类是一个配置类,包含所有 Bean 定义
public class JavaConfig {

    @Bean //使用 @Bean 注解声明当前方法 functionService 返回值是一个 Bean, Bean 的名称是方法名
    public FunctionService functionService(){
        return new FunctionService();
    }

    @Bean
    public UseFunctionService useFunctionService(){
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService()); //调用时,注入 Bean
        return useFunctionService;
    }

//    @Bean
//    public UseFunctionService useFunctionService(FunctionService functionService){ //参数注入 Bean
//        UseFunctionService useFunctionService = new UseFunctionService();
//        useFunctionService.setFunctionService(functionService);
//        return useFunctionService;
//    }

}
