package com.ws.ch2.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by martin on 11/27/16.
 */
public class MainClass {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProfileConfig.class);
        context.getEnvironment().setActiveProfiles("prod");
        context.register(ProfileConfig.class);

        // TODO: 11/27/16 GenericApplicationContext does not support multiple refresh attempts: just call 'refresh' once
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);

        System.out.println(demoBean.getContent());

        context.close();
    }


}
