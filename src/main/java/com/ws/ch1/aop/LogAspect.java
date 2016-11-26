package com.ws.ch1.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by martin on 11/25/16.
 * 切面
 */
@Aspect //通过 @Aspect 注解声明一个切面
@Component //通过 @Component 让此切面成为 spring 容器管理的 Bean
public class LogAspect {

    @Pointcut("@annotation(com.ws.ch1.aop.Action)") //通过 @Pointcut 声明切点
    public void annotationPointCut(){};

    @After("annotationPointCut") //通过 @After 声明一个建言,并使用 @Pointcut 定义切点
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截:"+action.name()); //通过反射获取注解上的属性,然后做日志相关操作
    }

    @Before("execution(*.com.ws.ch1.aop.DemoMethodService.*(..))") //通过 @Before 声明一个建言,此建言直接使用拦截规则作为参数
    public void before(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println("方法规则式拦截:"+method.getName()); //通过反射获取注解上的属性,然后做日志相关操作
    }

}
