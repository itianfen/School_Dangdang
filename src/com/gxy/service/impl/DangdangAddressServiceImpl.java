package com.gxy.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.gxy.entity.DangdangAddress;
import com.gxy.dao.DangdangAddressMapper;
import com.gxy.service.DangdangAddressService;

import java.math.BigDecimal;
import java.util.List;

@Service
public class DangdangAddressServiceImpl implements DangdangAddressService{

    @Resource
    private DangdangAddressMapper dangdangAddressMapper;

    @Override
    public int insert(DangdangAddress dangdangAddress) {
        return dangdangAddressMapper.insert(dangdangAddress);
    }

    @Override
    public List<DangdangAddress> selectByDdUserId(BigDecimal ddUserId) {
        return dangdangAddressMapper.selectByDdUserId(ddUserId);
    }

    @Override
    public List<DangdangAddress> selectByAddressId(BigDecimal addressId) {
        return dangdangAddressMapper.selectByAddressId(addressId);
    }


}
