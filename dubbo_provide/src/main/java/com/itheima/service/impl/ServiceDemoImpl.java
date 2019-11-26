package com.itheima.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

import cn.itcast.service.ServiceDemo;

/**
 * TODO: 增加描述
 *
 * @author li.xh
 * @version 1.0.0
 * @date 2019-11-25 23:47
 * @copyright wonhigh.cn
 */
@Service
public class ServiceDemoImpl implements ServiceDemo {

    @Override
    public String sayHello(String name) {
        return "hello,"+name;
    }
}
