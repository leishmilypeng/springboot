package com.lp.mapper;

import com.lp.bean.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by CPR161 on 2019-05-30.
 */
@Mapper
public interface UserMapper {
    User get(int id);
}
