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
    public int insert(DangdangAddress dangdangAddress) {
        return dangdangAddressMapper.insert(dangdangAddress);
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


}
