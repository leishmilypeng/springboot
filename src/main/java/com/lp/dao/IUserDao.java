package com.lp.dao;

import com.lp.bean.User;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by CPR161 on 2016-12-16.
 */
public interface IUserDao extends IBaseDao<User,Serializable>{
    User findByEmail(String email);
}
