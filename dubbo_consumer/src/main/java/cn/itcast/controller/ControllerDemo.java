package cn.itcast.controller;

import com.alibaba.dubbo.config.annotation.Reference;

import org.jboss.netty.handler.codec.http.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletResponse;

import cn.itcast.service.ServiceDemo;

/**
 * TODO: 增加描述
 *
 * @author li.xh
 * @version 1.0.0
 * @date 2019-11-25 23:59
 * @copyright wonhigh.cn
 */
@Controller
public class ControllerDemo {

    @Reference
    private ServiceDemo serviceDemo;

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String sayHello(String name) throws UnsupportedEncodingException {
        return serviceDemo.sayHello(name);
    }
}
