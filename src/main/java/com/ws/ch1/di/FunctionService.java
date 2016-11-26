package com.ws.ch1.di;

import org.springframework.stereotype.Service;

/**
 * Created by martin on 11/25/16.
 */
@Service //通过 @Service 注解声明当前类是 Spring 管理的一个 Bean
public class FunctionService {

    public String sayHello(String word){
        return "Hello " + word;
    }
}
