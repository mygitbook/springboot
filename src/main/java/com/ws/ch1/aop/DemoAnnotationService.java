package com.ws.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * Created by martin on 11/25/16.
 */
@Service
public class DemoAnnotationService {

    @Action(name="注解式拦截add操作")
    public void add(){};
}