package com.lp.service;

import com.lp.bean.User;

import java.util.List;
import java.util.Map;

/**
 * Created by CPR161 on 2016-12-16.
 */
public interface IUserService extends IBaseService{

    User findByEmail(String email);

    List<Map<String,Object>> queryUser(Map<String,Object> cond);

}
