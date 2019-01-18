package com.ts.service.impl;

import com.ts.service.IHelloService;

/**
 * @author: Owen Jia
 * @time: 2019/1/18 17:56
 */
public class HelloServiceImpl implements IHelloService {

    @Override
    public String showSelf() {
        return "i am " + this.getClass().getName();
    }
}
