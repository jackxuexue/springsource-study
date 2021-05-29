package com.jackxue.lifeCyc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.jackxue.lifeCyc"})
public class MainConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Cat cat(){
        return new Cat();
    }
}
