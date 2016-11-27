package com.ws.ch3.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by martin on 11/27/16.
 */
public class WindowsCondition implements Condition {

    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata metadata){
        return conditionContext.getEnvironment().getProperty("os.name").contains("Windows");
    }
}
