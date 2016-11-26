package com.ws.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by martin on 11/25/16.
 */
@Service //通过 @Service 注解声明当前类是 Spring 管理的一个 Bean
public class UseFunctionService {

    @Autowired //通过 @Autowired 注解将 FunctionService 的实体 Bean 注入到 UseFunctionService
    FunctionService functionService;

    public String sayHello(String word){
        return functionService.sayHello(word);
    }
}
