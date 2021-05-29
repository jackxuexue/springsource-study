package com.jackxue;

import com.jackxue.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        for (String beanDefinitionName : applicationContext.getBeanDefinitionNames()) {
            System.out.println("容器中的bean："+ beanDefinitionName);
        }

        System.out.println(applicationContext.getBean("factoryBean")); //返回的是com.jackxue.pojo.Dog@4c40b76e
        System.out.println(applicationContext.getBean("&factoryBean")); //返回的是com.jackxue.factorybean.MyFactoryBean@2ea6137
    }
}
