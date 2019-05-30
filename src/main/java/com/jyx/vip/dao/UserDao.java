package com.jyx.vip.dao;

import com.jyx.vip.entity.UserEntity;
import org.apache.ibatis.annotations.Param;

/**
 * @author:jyx
 * @date:2019-05-29 16:48
 * @desc(描述):
 */
public interface UserDao {
    public UserEntity selectByAccount(@Param("account") String account) throws Exception;
}
