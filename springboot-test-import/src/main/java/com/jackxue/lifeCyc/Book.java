package com.jackxue.lifeCyc;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Book {

    public Book(){
        System.out.println("Book 的构造方法！");
    }
    @PostConstruct
    public void postInit(){
        System.out.println("Book 的 PostConstruct 方法！");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Book 的 PreDestroy 方法！");
    }
}
