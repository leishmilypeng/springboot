package com.lp.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by CPR161 on 2019-05-30.
 * 用于提取一些通用的
 *
 *  Mapper接口：基本的增、删、改、查方法
 *  MySqlMapper：针对MySQL的额外补充接口，支持批量插入
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
    T get(int id);
}
