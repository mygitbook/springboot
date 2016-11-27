package com.ws.ch2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by martin on 11/27/16.
 */
@Component
public class DemoPublisher {

    @Autowired  //注入 applicationContext,用来发布事件
    ApplicationContext applicationContext;

    public void publish(String msg){
        applicationContext.publishEvent(new DemoEvent(this,msg)); //调用 publishEvent 来发布事件
    }
}
