package com.ws.ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by martin on 11/26/16.
 * Scope 用来描述 Spring 容器如何创建Bean实例:
 * Singleton 一个容器只有一个 Bean 实例
 * Prototype 每次调用都创建一个 Bean 实例
 *
 */
public class ClassMain {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemoSingletonService singletonService1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService singletonService2 = context.getBean(DemoSingletonService.class);

        DemoPrototypeService prototypeService1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService prototypeService2 = context.getBean(DemoPrototypeService.class);

        System.out.println("s1是否等于s2:"+singletonService1.equals(singletonService2));
        System.out.println("p1是否等于p2:"+prototypeService1.equals(prototypeService2));

        context.close();
    }
}
