package com.dubboexample.provider.serviceimp;

import com.huashuikun.serviceiml.TestDubboService;
import org.apache.dubbo.config.annotation.Service;


@Service
public class RealService implements TestDubboService {
    @Override
    public String sayName(String name) {
        return "你好啊 DUBBO测试成功啦："+name;
    }

    @Override
    public String sayHello() {
        return "hello";
    }
}
