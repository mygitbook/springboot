package com.ws.ch2.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by martin on 11/27/16.
 *
 * Spring 的事件为 Bean 与 Bean 之间的消息通讯提供了支持,流程:
 * 1.自定义事件,继承 ApplicationEvent
 * 2.自定义事件监听器,实现 ApplicationListener
 * 3.使用容器发布事件
 */
public class MainClass {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publish("Hello application event!");

        context.close();
    }
}
