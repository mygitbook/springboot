package com.ws.ch1.aop;

import java.lang.annotation.*;

/**
 * Created by martin on 11/25/16.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {

    String name();
}
