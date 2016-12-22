package com.lp.dao;


import java.io.Serializable;

/**
 * Created by CPR161 on 2016-12-22.
 */
public interface IBaseDao<T,ID extends Serializable>  {
    void save(T t);
}
