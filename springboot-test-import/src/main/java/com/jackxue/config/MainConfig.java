package com.jackxue.config;

import com.jackxue.factorybean.MyFactoryBean;
import com.jackxue.importSelector.MyImportRegister;
import com.jackxue.importSelector.MyImportSelector;
import com.jackxue.pojo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {Person.class, MyImportSelector.class, MyImportRegister.class})
public class MainConfig {

    @Bean
    public MyFactoryBean factoryBean(){
        return new MyFactoryBean();
    }
}
