package com.shzhang.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
//
//        BeanWayService beanWayService = context.getBean(BeanWayService.class);
//
//        JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);
//
//        context.close();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.getEnvironment().setActiveProfiles("dev");
        context.register(ProfileConfig.class);
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());
        context.close();
    }
}
