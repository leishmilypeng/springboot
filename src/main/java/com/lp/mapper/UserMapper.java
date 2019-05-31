package com.lp.mapper;

import com.lp.bean.User;
import com.lp.vo.UserVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by CPR161 on 2019-05-30.
 */
@Mapper
public interface UserMapper extends MyMapper<User> {
    //User get(int id);
    List<UserVo> getMapList(@Param("id") int id);

    Integer getCountByKey(@Param("key") String key);
}
