package com.shzhang.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemoSingletonService demoSingletonService1 = context.getBean(DemoSingletonService.class);

        DemoSingletonService demoSingletonService2 = context.getBean(DemoSingletonService.class);

        DemoPrototypeService demoPrototypeService1 = context.getBean(DemoPrototypeService.class);

        DemoPrototypeService demoPrototypeService2 = context.getBean(DemoPrototypeService.class);

        System.out.println("s1 和 s2 是否相等：" + demoSingletonService1.equals(demoSingletonService2));

        System.out.println("p1 和 p2 是否相等：" + demoPrototypeService1.equals(demoPrototypeService2));

        context.close();
    }
}
