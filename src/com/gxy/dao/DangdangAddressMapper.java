package com.gxy.dao;

import java.math.BigDecimal;

import org.apache.ibatis.annotations.Param;

import java.util.List;

import com.gxy.entity.DangdangAddress;

public interface DangdangAddressMapper {
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
    List<DangdangAddress> selectByDdUserId(@Param("ddUserId") BigDecimal ddUserId);

    /**
     * 根据地址ID查询地址
     *
     * @param addressId
     * @return
     */
    List<DangdangAddress> selectByAddressId(@Param("addressId") BigDecimal addressId);

    List<BigDecimal> selectAddressIdByAddressReceiveNameAndAddressAddAndAddressZipcodeAndAddressMobileAndDdUserId(@Param("addressReceiveName")String addressReceiveName,@Param("addressAdd")String addressAdd,@Param("addressZipcode")String addressZipcode,@Param("addressMobile")String addressMobile,@Param("ddUserId")BigDecimal ddUserId);




}