package com.example;

import java.util.Date;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.web.servlet.support.RequestContext;

@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 1, TimeUnit.HOURS, linkedBlockingDeque);
        System.out.println("hahhh");
        return "Hello, " + name + ", " + new Date();
    }

}