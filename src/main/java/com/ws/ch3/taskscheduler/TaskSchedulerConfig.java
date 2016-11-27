package com.ws.ch3.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by martin on 11/27/16.
 */
@Configuration
@ComponentScan("com.ws.ch3.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {
}
