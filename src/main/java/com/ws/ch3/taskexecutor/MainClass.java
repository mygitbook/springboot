package com.ws.ch3.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by martin on 11/27/16.
 *
 * Spring 通过任务执行器 TaskExecutor 来实现多线程和并发编程, 使用 ThreadPoolTaskExecutor 可实现一个基于线程池的 TaskExecutor
 *
 */
public class MainClass {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);

        for (int i=0; i<10; i++){
            asyncTaskService.executoAsyncTask(i);
            asyncTaskService.executoAsyncTaskPlus(i);
        }

        context.close();
    }
}
