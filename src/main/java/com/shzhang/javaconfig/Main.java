package com.shzhang.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService useFunctionService = annotationConfigApplicationContext.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("world"));
        annotationConfigApplicationContext.close();
    }
}
