package com.jyx.vip.funcation.impl;

import com.jyx.vip.common.ThisSystemUtils;
import com.jyx.vip.dao.UserDao;
import com.jyx.vip.entity.UserEntity;
import com.jyx.vip.funcation.UserFuncation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author:jyx
 * @date:2019-05-29 16:52
 * @desc(描述):
 */
@Service
public class UserFuncationImpl implements UserFuncation {

    @Autowired
    UserDao userDao;

    @Override
    public UserEntity login(String account, String password) throws Exception {

        account = ThisSystemUtils.throwIsNull("账户不能为空",account);
        password = ThisSystemUtils.throwIsNull("密码不能为空",password);

        UserEntity userEntity = userDao.selectByAccount(account);
        if (userEntity ==null){
            ThisSystemUtils.throwSystemException("账户不存在");
        }

        if (!password.equals(userEntity.getPassword())) {
            ThisSystemUtils.throwSystemException("密码错误");
        }
        return userEntity;
    }
}
