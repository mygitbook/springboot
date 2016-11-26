package com.ws.ch1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by martin on 11/26/16.
 * AOP的目的是解藕
 * Spring支持 AspectJ 的注解式切面编程
 * 1.使用 @Aspect 声明是一个切面
 * 2.使用 @After,@Before,@Around定义建言(advice),可以直接将拦截规则作为参数
 * 3.@After,@Before,@Around 参数的拦截规则为切点(PointCut),为了使得切点复用,可使用 @Pointcut 专门定义规则
 * 4.符合条件的每一个拦截处为拦截点(JoinPoint)
 */
public class MainClass {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);

        demoMethodService.add();
        demoAnnotationService.add();

        context.close();
    }
}
