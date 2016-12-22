package com.lp.dao.impl;

import com.lp.dao.IBaseDao;

import java.io.Serializable;

/**
 * Created by CPR161 on 2016-12-22.
 * 泛型的使用
 *  接口类中用的泛型类和实现类里面一致（用于通用方法的构建）
 *  采用抽象工厂模式用于业务扩展
 */
public class BaseDaoImpl<T,ID extends Serializable> implements IBaseDao<T,ID>{

    @Override
    public void save(T o) {
        System.out.printf("保存成功...");
    }
}
