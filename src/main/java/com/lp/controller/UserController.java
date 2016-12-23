package com.lp.controller;

import com.lp.bean.TmUser;
import com.lp.bean.User;
import com.lp.service.IUserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by CPR161 on 2016-12-16.
 */
@ComponentScan
@Configuration
@RestController
@RequestMapping("/user")
public class UserController {

    Logger logger = LogManager.getLogger(UserController.class.getName());

    @Autowired
    private IUserService userService;

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

    @RequestMapping("/get-by-email/{email}")
    @ResponseBody
    public String getByEmail(@PathVariable String email) {
        String userId;
        User user = userService.findByEmail(email);
        if (user != null) {
            userId = String.valueOf(user.getId());
            return "The user id is: " + userId;
        }
        return "user " + email + " is not exist.";
    }

    @RequestMapping("/getUser")
    @ResponseBody
    public Object getUser() {
        logger.info(" info 日志输出");
        Map<String,Object> cond = new HashMap<String,Object>();
        return userService.queryUser(cond);
    }
}
