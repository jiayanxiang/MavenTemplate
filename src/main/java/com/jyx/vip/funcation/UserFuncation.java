package com.jyx.vip.funcation;

import com.jyx.vip.entity.UserEntity;

/**
 * @author:jyx
 * @date:2019-05-29 16:51
 * @desc(描述):
 */
public interface UserFuncation {
    UserEntity login(String account,String password) throws Exception;
}
