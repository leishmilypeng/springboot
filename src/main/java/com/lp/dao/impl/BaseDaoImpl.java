package com.lp.dao.impl;

import com.lp.dao.IBaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
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

    private Class<T> clazz;

    public Class getBeanClass(){
        Type t = getClass().getGenericSuperclass();
        if(t instanceof ParameterizedType){
            Type[] p = ((ParameterizedType)t).getActualTypeArguments();
            this.clazz = (Class<T>)p[0];
        }
        return this.clazz;
    }


    @Override
    public void test(T o) {
        System.out.printf("保存成功...");
    }

    public List<Map<String, Object>> queryForList(String sql) {
        return jdbcTemplate.queryForList(sql);
    }

    /**
     *
     * queryBeanForList 中调用 queryForList仅能用于查询一列的数据，不能用于查询实体，否则会报错，切记
     * --错误： spring-org.springframework.jdbc.IncorrectResultSetColumnCountException
     * org.springframework.jdbc.IncorrectResultSetColumnCountException: Incorrect column count: expected 1,
     * springboot Incorrect column count: expected 1, actual 3] with root cause
     * @param sql
     * @return
     */
    public List<T> queryBeanForList(String sql){
        /************ 此方法不能使用 ***************/
        List<T> list = jdbcTemplate.queryForList(sql,this.getBeanClass());
        //List<T> list = jdbcTemplate.query(sql, new UserRowMapper<T>());
        return list;
    }

    /**
     *
     * @param sql
     * @param clz
     * @return
     */
    public List queryColumnForList(String sql,Class clz){
        List list = jdbcTemplate.queryForList(sql,clz);
        return list;
    }

}
