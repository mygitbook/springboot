package com.ws.ch3.taskscheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by martin on 11/27/16.
 *
 * 计划任务:
 * 1.在配置类中通过 @EnableScheduling 开启对计划任务支持
 * 2.在要执行计划任务的方法上 @Scheduled,声明这是一个计划任务
 */
public class MainClass {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
    }
}
