package com.lp.dao.impl;

import com.lp.dao.IBaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by CPR161 on 2016-12-22.
 * 泛型的使用
 *  接口类中用的泛型类和实现类里面一致（用于通用方法的构建）
 *  采用抽象工厂模式用于业务扩展
 */
public abstract class BaseDaoImpl<T,ID extends Serializable> implements IBaseDao<T,ID>{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void test(T o) {
        System.out.printf("保存成功...");
    }

    public List<Map<String, Object>> queryForList(String sql) {
        return jdbcTemplate.queryForList(sql);
    }

}
