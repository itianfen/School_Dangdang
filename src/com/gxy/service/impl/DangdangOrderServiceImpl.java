package com.gxy.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.gxy.entity.DangdangOrder;
import com.gxy.dao.DangdangOrderMapper;
import com.gxy.service.DangdangOrderService;
@Service
public class DangdangOrderServiceImpl implements DangdangOrderService{

    @Resource
    private DangdangOrderMapper dangdangOrderMapper;

    @Override
    public int insert(DangdangOrder record) {
        return dangdangOrderMapper.insert(record);
    }

}
