package com.lp.controller;

import com.lp.bean.TmUser;
import com.lp.service.IUserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by CPR161 on 2016-12-16.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    Logger logger = LogManager.getLogger(UserController.class.getName());


    @Autowired
    private IUserService userService;

    @RequestMapping("getUser/{id}")
    public String getUser(@PathVariable int id){
        return userService.get(id).toString();
    }

    @RequestMapping("/{id}")
    public TmUser getUser(@PathVariable String id){
        TmUser user  = new TmUser();
        user.setId("111111");
        user.setUsername("id==="+Math.random());
        return user;
    }

    @RequestMapping("/query/{id}")
    public TmUser query(@PathVariable String id){
        TmUser user  = new TmUser();
        user.setId(id);
        user.setUsername("id2==="+Math.random());
        return user;
    }



    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
