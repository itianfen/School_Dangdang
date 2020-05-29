package com.gxy.service;

import java.math.BigDecimal;
import java.util.List;

import com.gxy.entity.DangdangUser;
public interface DangdangUserService{

    int insert(DangdangUser record);

    List<DangdangUser> selectByDdUserEmailAndDdUserPassword(String ddUserEmail, String ddUserPassword);

    String selectDdUserSaltByDdUserEmail(String ddUserEmail);

}
