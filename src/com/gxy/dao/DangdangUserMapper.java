package com.gxy.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.gxy.entity.DangdangUser;
import java.math.BigDecimal;

public interface DangdangUserMapper {

    int insert(DangdangUser dangdangUser);

    List<DangdangUser> selectByDdUserEmailAndDdUserPassword(@Param("ddUserEmail")String ddUserEmail,@Param("ddUserPassword")String ddUserPassword);

    String selectDdUserSaltByDdUserEmail(@Param("ddUserEmail")String ddUserEmail);




}