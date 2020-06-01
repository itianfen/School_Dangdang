package com.gxy.service;

import com.gxy.entity.DangdangAddress;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface DangdangAddressService {

    /**
     * 插入地址
     *
     * @param dangdangAddress
     * @return
     */
    int insert(DangdangAddress dangdangAddress);

    /**
     * 根据用户ID查询地址
     *
     * @param ddUserId
     * @return
     */
    List<DangdangAddress> selectByDdUserId(BigDecimal ddUserId);

    /**
     * 根据地址ID查询地址
     *
     * @param addressId
     * @return
     */
    List<DangdangAddress> selectByAddressId(BigDecimal addressId);
}
