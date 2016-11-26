package com.ws.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by martin on 11/25/16.
 */
public class MainClass {

    /**
     * 声明 Bean 的注解:
     * @Component 组件,没有明确角色
     * @Service 在业务逻辑层使用
     * @Repository 在数据访问层使用
     * @Controller 在展现层使用
     *
     * 注入 Bean 的注解,习惯于在属性上使用:
     * @Autowired Spring提供的注解
     * @Inject JSR-330提供的注解
     * @Resource JSR-250提供的注解
     *
     */

    public static void main(String[] args){
        // 使用 AnnotationConfigApplicationContext 作为 Spring 容器,接受一个配置类作为参数
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);

        //获得声明配置的 UseFunctionService 的 Bean
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);

        System.out.print(useFunctionService.sayHello("di"));

        context.close();
    }
}
