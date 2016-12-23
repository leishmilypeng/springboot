package com.lp.dao;


import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by CPR161 on 2016-12-22.
 */
public interface IBaseDao<T,ID extends Serializable>  {
    /**
     *定义一通用方法
     * @param t
     */
    void test(T t);

    List<Map<String, Object>> queryForList(String sql);

    List<T> queryBeanForList(String sql);

    List queryColumnForList(String sql,Class clz);
}
