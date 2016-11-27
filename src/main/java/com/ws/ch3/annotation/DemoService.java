package com.ws.ch3.annotation;

import org.springframework.stereotype.Service;

/**
 * Created by martin on 11/27/16.
 */
@Service
public class DemoService {

    public void outputResult(){
        System.out.println("从组合注解中获取Bean");
    }
}
