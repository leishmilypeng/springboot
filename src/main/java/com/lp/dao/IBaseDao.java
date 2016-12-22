package com.lp.dao;


import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

/**
 * Created by CPR161 on 2016-12-22.
 */
public interface IBaseDao<T,ID extends Serializable>   {
    void test(T t);
}
