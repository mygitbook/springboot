package com.ws.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by martin on 11/27/16.
 */
@Service
public class AsyncTaskService {

    @Async //表明该方法是异步方法,如果是类级别,则该类所有方法均为异步方法
    public void executoAsyncTask(Integer i){
        System.out.println("执行异步任务:"+i);
    }

    @Async //表明该方法是异步方法,如果是类级别,则该类所有方法均为异步方法
    public void executoAsyncTaskPlus(Integer i){
        System.out.println("执行异步任务+1:"+(i+1));
    }
}
