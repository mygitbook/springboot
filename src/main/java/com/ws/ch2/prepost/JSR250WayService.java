package com.ws.ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by martin on 11/27/16.
 */
public class JSR250WayService {

    @PostConstruct //在构造函数执行完后执行
    public void init(){
        System.out.println("JSR250-init-method");
    }

    public JSR250WayService() {
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }

    @PreDestroy //在销毁Bean之前执行
    public void destroy(){
        System.out.println("JSR250-destroy-method");
    }
}
