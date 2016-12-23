package com.lp.service.impl;

import com.lp.bean.User;
import com.lp.dao.IUserDao;
import com.lp.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        userDao.test(user);

        return userDao.findByEmail(email);
    }

    @Override
    public List<Map<String, Object>> queryUser(Map<String, Object> cond) {
        return userDao.queryUserBySql(cond);
    }
}
