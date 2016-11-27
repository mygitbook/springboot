package com.ws.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by martin on 11/27/16.
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> { //实现 ApplicationListener 接口,并指定监听的事件类型

    @Override
    public void onApplicationEvent(DemoEvent event) { //处理接受到的消息
        String msg = event.getMsg();

        System.out.println("listen接收到publisher发布消息:"+msg);
    }
}
