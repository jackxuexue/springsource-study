package com.jackxue.lifeCyc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        for (String beanDefinitionName : applicationContext.getBeanDefinitionNames()) {
            System.out.println("bean容器中的名称："+ beanDefinitionName);
        }

        applicationContext.close();
    }
}
