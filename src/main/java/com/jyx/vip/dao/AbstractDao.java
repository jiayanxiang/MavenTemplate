package com.jyx.vip.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author:jyx
 * @date:2019-05-30 9:39
 * @desc(描述): 参数注解
 */
public interface AbstractDao<T> {

    void insert(T t) throws Exception;

    void update(T t) throws Exception;

    void delete(@Param("key") String key, @Param("value") Object value) throws Exception;

    T select(@Param("key") String key, @Param("value") Object value) throws Exception;

    Boolean exsits(@Param("key") String key, @Param("value") Object value) throws Exception;

    List<T> selectLike(@Param("key") String key) throws Exception;
}
