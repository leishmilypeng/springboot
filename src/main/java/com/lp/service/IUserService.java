package com.lp.service;

import com.lp.bean.User;

/**
 * Created by CPR161 on 2016-12-16.
 */
public interface IUserService extends IBaseService{

    User findByEmail(String email);

}
