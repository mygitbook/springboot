package com.ws.ch3.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * Created by martin on 11/27/16.
 */
@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware{

    private String beanName;

    private ResourceLoader loader;


    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    public void outputResult(){
        System.out.println("Bean name is :" + beanName);
        Resource resource = loader.getResource("classpath:com/ws/ch3/aware/test.txt");
        try {
            System.out.println("loader 加载文件内容:" + IOUtils.toString(resource.getInputStream()));
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
