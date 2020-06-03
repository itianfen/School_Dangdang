package com.gxy.service.impl;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.gxy.entity.DangdangAddress;
import com.gxy.dao.DangdangAddressMapper;
import com.gxy.service.DangdangAddressService;

import java.math.BigDecimal;
import java.util.List;

@Service
public class DangdangAddressServiceImpl implements DangdangAddressService {

    @Resource
    private DangdangAddressMapper dangdangAddressMapper;

    /**
     * 插入地址
     *
     * @param dangdangAddress
     * @return
     */
    @Override
    public BigDecimal insert(DangdangAddress dangdangAddress) {
        dangdangAddressMapper.insert(dangdangAddress);
        return dangdangAddress.getAddressId();
    }


    /**
     * 根据用户ID查询地址
     *
     * @param ddUserId
     * @return
     */
    @Override
    public List<DangdangAddress> selectByDdUserId(BigDecimal ddUserId) {
        return dangdangAddressMapper.selectByDdUserId(ddUserId);
    }

    /**
     * 根据地址ID查询地址
     *
     * @param addressId
     * @return
     */
    @Override
    public List<DangdangAddress> selectByAddressId(BigDecimal addressId) {
        return dangdangAddressMapper.selectByAddressId(addressId);
    }

    @Override
    public BigDecimal checkAndReturnAddressId(String addressReceiveName, String addressAdd, String addressZipcode, String addressMobile, BigDecimal userId) {
        List<BigDecimal> addressIds = dangdangAddressMapper.selectAddressIdByAddressReceiveNameAndAddressAddAndAddressZipcodeAndAddressMobileAndDdUserId(addressReceiveName, addressAdd, addressZipcode, addressMobile, userId);
        boolean flag = addressIds.isEmpty() ? true : false;
        BigDecimal addressId = null;
        if (flag) {
            DangdangAddress dangdangAddress = new DangdangAddress(addressReceiveName, addressAdd, addressMobile, addressZipcode, userId);
            dangdangAddressMapper.insert(dangdangAddress);
            addressId = dangdangAddress.getAddressId();
        } else {
            addressId = addressIds.get(0);
        }
        return addressId;
    }


}
