package com.lp.dao.impl;

import com.lp.bean.User;
import com.lp.dao.IUserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by CPR161 on 2016-12-16.
 */
@Repository
@Component
public class UserDaoImpl extends  BaseDaoImpl<User,Serializable>  implements IUserDao  {
    @Override
    public User findByEmail(String email) {
        User user = new User();
        user.setId(1);
        //user.setEmail("891880796@qq.com");
        //user.setName("leipeng");
        return user;
    }

    @Override
    public List<Map<String, Object>> queryUserBySql(Map<String,Object> cond) {

        StringBuffer sql = new StringBuffer();
        sql.append(" select * from user ");


        StringBuffer sql2 = new StringBuffer();
        sql2.append(" select name from user ");
        List<String> list = this.queryColumnForList(sql2.toString(),String.class);
        for(String s:list){
            System.out.println(s);
        }
        return this.queryForList(sql.toString());
    }


}
