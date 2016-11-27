package com.ws.ch2.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by martin on 11/27/16.
 */
@Configuration
public class ProfileConfig {

    @Bean
    @Profile("dev")  //profile 为 dev 时,实例化devDemoBean
    public DemoBean devDemoBean(){
        return new DemoBean("from dev profile");
    }

    @Bean
    @Profile("prod") //profile 为 prod 时,实例化prodDemoBean
    public DemoBean prodDemoBean(){
        return new DemoBean("from prod profile");
    }
}
