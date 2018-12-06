package com.shzhang.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.shzhang.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
