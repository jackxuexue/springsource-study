package com.jackxue.test;

import com.jackxue.pojo.Car;
import com.jackxue.pojo.User;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(basePackages = {"com.jackxue"}
        ,excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class}),
        @ComponentScan.Filter(type = FilterType.CUSTOM, value = {MyFilterType.class})}
        , useDefaultFilters = false) //必须要加
public class MainConfig {

    /**
     * 默认为方法名
     * @return
     */
    @Bean
    public User user(){
        return new User();
    }

    @Bean("car")
    @Conditional(value = {MyCondition.class})
    public Car getCar(){
        return new Car();
    }
}
