package com.lp.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lp.bean.TmUser;
import com.lp.bean.User;
import com.lp.service.IUserService;
import com.lp.vo.UserVo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
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
    public User getUser(@PathVariable String id){
        User user  = new User();
        user.setRealName("111111");
        user.setUserName("id==="+Math.random());

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


    @RequestMapping("/queryList/{pageNum}")
    @ResponseBody
    public PageInfo getPageInfo(@PathVariable Integer pageNum){
        if(pageNum==null)
            pageNum = 1;
        // 设置分页参数
        // 第一个参数是第几页；第二个参数是每页显示条数。PageHelper实现分页的原理见项目内文档problem_remark.md
        PageHelper.startPage(pageNum,10);
        List<UserVo> list=userService.getAll();
        PageInfo<UserVo> pageInfo=new PageInfo<UserVo>(list);
        return pageInfo;
    }




}
