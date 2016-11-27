package com.ws.ch3.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by martin on 11/27/16.
 */
public class MainClass {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        // TODO: 11/27/16  NoSuchBeanDefinitionException: No qualifying bean of type [com.ws.ch3.conditional.ListService] is defined
        ListService listService = context.getBean(ListService.class);

        System.out.println(context.getEnvironment().getProperty("os.name")+"系统下的列表命令:"+listService.showListCmd());

        context.close();
    }
}
