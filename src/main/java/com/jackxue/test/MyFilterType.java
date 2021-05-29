package com.jackxue.test;


import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

public class MyFilterType implements TypeFilter {
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        if(classMetadata.getClassName().contains("UserService") ||
           classMetadata.getClassName().contains("Car")){ //在Configuration中通过@Bean生成的不会排除
            System.out.println("排除的类："+classMetadata.getClassName());
           return true;
        }
        return false;
    }
}
