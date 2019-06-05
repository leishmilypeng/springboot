package com.lp.dao;

import com.lp.bean.User;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by CPR161 on 2019-06-05.
 */
public interface IUserDao  extends IBaseDao<User,Serializable>{
    User findByEmail(String email);

    List<Map<String,Object>> queryUserBySql(Map<String,Object> cond);
}
