package com.shzhang.service.impl;

import com.shzhang.service.FunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FunctionServiceImpl {

    @Autowired
    private FunctionService functionService;

    public String SayHello(String word) {
        return functionService.sayHello(word);
    }
}
