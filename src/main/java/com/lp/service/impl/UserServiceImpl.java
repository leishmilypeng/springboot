package com.lp.service.impl;

import com.lp.bean.User;
import com.lp.dao.IUserDao;
import com.lp.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by CPR161 on 2016-12-16.
 */
@Service
public class UserServiceImpl extends BaseServiceImpl implements IUserService{

    @Resource
    private IUserDao userDao;

    @Override
    public User findByEmail(String email) {
        User user = new User();
        userDao.save(user);
        return userDao.findByEmail(email);
    }
}
