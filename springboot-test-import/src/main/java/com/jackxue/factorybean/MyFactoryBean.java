package com.jackxue.factorybean;

import com.jackxue.pojo.Dog;
import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<Dog> {
    public Dog getObject() throws Exception {
        return new Dog();
    }

    public Class<?> getObjectType() {
        return Dog.class;
    }
}
