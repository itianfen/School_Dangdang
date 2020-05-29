package com.gxy.dao;
import java.math.BigDecimal;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.gxy.entity.DangdangAddress;

public interface DangdangAddressMapper {
    int insert(DangdangAddress dangdangAddress);
    List<DangdangAddress> selectByDdUserId(@Param("ddUserId")BigDecimal ddUserId);
    List<DangdangAddress> selectByAddressId(@Param("addressId")BigDecimal addressId);
}