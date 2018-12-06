package com.shzhang.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    public void onApplicationEvent(DemoEvent event) {
        String msg = event.getMsg();

        System.out.println("我(bean-demoListener)接收到了bean-denoPubklisher发布的消息：" + msg);
    }
}
