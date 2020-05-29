package com.gxy.service;

import com.gxy.entity.DangdangAddress;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface DangdangAddressService{


    int insert(DangdangAddress dangdangAddress);
    List<DangdangAddress> selectByDdUserId(BigDecimal ddUserId);
    List<DangdangAddress> selectByAddressId(BigDecimal addressId);
}
