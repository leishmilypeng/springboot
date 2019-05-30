package com.lp.controller;

import com.lp.bean.TmUser;
import com.lp.service.IUserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by CPR161 on 2016-12-16.
 *  // @RestController相当于@Controller+@ResponseBody(每一个方法上默认返回的是json串)
 */
//@RestController
@Controller
@RequestMapping("/user")
public class UserController {

    Logger logger = LogManager.getLogger(UserController.class.getName());


    @Autowired
    private IUserService userService;

    @RequestMapping("getUser/{id}")
    @ResponseBody
    public String getUser(@PathVariable int id){
        return userService.get(id).toString();
    }

    @RequestMapping("set/{id}")
    @ResponseBody
    public TmUser getUser(@PathVariable String id){
        TmUser user  = new TmUser();
        user.setId("111111");
        user.setUsername("id==="+Math.random());

        userService.doTest();
        return user;
    }

    @RequestMapping("/query/{id}")
    @ResponseBody
    public TmUser query(@PathVariable String id){
        TmUser user  = new TmUser();
        user.setId(id);
        user.setUsername("id2==="+Math.random());
        return user;
    }


    //使用ModelAndView  返回页面
    @RequestMapping("/firstPage")
    public ModelAndView firstPage() {
        ModelAndView modelAndView = new ModelAndView("first");
        modelAndView.addObject("content", "way of first");
        return modelAndView;

    }

    //通过application.yml里面的配置  返回页面
    @RequestMapping("/secondPage")
    public String waySecond(Map<String,Object> model) {
        model.put("content", "way of second");
        return "second";

    }

    @RequestMapping("/test")
    public String test(){
        return "test";
    }



}
