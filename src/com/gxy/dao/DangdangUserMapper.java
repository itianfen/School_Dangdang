package com.gxy.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

import com.gxy.entity.DangdangUser;

import java.math.BigDecimal;

public interface DangdangUserMapper {
    /**
     * 插入用户
     *
     * @param dangdangUser
     * @return
     */
    int insert(DangdangUser dangdangUser);

    /**
     * 根据邮箱和密码登录
     *
     * @param ddUserEmail
     * @param ddUserPassword
     * @return
     */
    List<DangdangUser> selectByDdUserEmailAndDdUserPassword(@Param("ddUserEmail") String ddUserEmail, @Param("ddUserPassword") String ddUserPassword);

    /**
     * 根据邮箱查加盐串
     *
     * @param ddUserEmail
     * @return
     */
    String selectDdUserSaltByDdUserEmail(@Param("ddUserEmail") String ddUserEmail);


}