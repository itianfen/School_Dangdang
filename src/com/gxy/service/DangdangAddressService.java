package com.gxy.service;

import com.gxy.entity.DangdangAddress;

import java.math.BigDecimal;
import java.util.List;

public interface DangdangAddressService {

    /**
     * 插入地址
     *
     * @param dangdangAddress
     * @return
     */
    BigDecimal insert(DangdangAddress dangdangAddress);

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

    BigDecimal checkAndReturnAddressId(String addressReceiveName,String addressAdd,String addressZipcode,String addressMobile,BigDecimal userId);
}
