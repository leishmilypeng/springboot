package com.lp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by CPR161 on 2016-12-16.
 */
@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    /*
        第一种方式
        通过在SampleController中加上@EnableAutoConfiguration开启自动配置，然后通过SpringApplication.run(UserController.class);运行这个控制器；这种方式只运行一个控制器比较方便；
        第二种方式
        通过@Configuration+@ComponentScan开启注解扫描并自动注册相应的注解Bean
    */
    /*
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
    */
}