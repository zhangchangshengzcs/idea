package com.hgc.anno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContextLoaderTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ParentConfig.class);
        Car car= (Car) context.getBean("toyota");
        car.print();
    }
}
