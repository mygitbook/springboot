package com.ws.ch1.di;

import org.springframework.stereotype.Service;

/**
 * Created by martin on 11/25/16.
 */
@Service
public class FunctionService {

    public String sayHello(String word){
        return "Hello " + word;
    }
}
