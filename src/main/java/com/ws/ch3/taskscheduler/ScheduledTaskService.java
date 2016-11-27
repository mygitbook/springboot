package com.ws.ch3.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by martin on 11/27/16.
 */
@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000) //每隔固定间隔执行
    public void reportCurrentTime(){
        System.out.println("每隔5秒执行一次:"+dateFormat.format(new Date()));
    }

    @Scheduled(cron = "0 12 12 ? * *") // 支持 cron 表达式
    public void fixTimeExecution(){
        System.out.println("指定时间执行:"+dateFormat.format(new Date()));
    }
}
