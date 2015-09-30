package cn.eaglefire.app.service.impl;

import cn.eaglefire.app.service.DemoService;

/**
 * DemoService实现
 *
 * Created by eagle on 15/9/30.
 */
public class DemoServiceImpl implements DemoService {

    /**
     * 测试方法 - 实现
     * @param name
     * @return
     */
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
