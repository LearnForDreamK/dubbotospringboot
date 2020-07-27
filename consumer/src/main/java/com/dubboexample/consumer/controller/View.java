package com.dubboexample.consumer.controller;



import com.huashuikun.serviceiml.TestDubboService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class View {

    @Reference
    public TestDubboService testDubboService;


    @RequestMapping("/takename")
    public String takename(){
        String msg=testDubboService.sayName("坤弟弟");
        System.out.println(msg);
        return msg;
    }

    @RequestMapping("/sayhello")
    public String sayHello(){

        System.out.println(testDubboService.sayHello());
        return  testDubboService.sayHello();
    }

}
