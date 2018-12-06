package com.shzhang.controller;

import com.shzhang.service.impl.FunctionServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);

        FunctionServiceImpl functionService = context.getBean(FunctionServiceImpl.class);

        System.out.println(functionService.SayHello("hello world"));

        context.close();
    }
 }
