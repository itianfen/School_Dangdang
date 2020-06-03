package com.gxy.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.gxy.entity.DangdangOrderDetail;
import com.gxy.dao.DangdangOrderDetailMapper;
import com.gxy.service.DangdangOrderDetailService;

import java.util.List;

@Service
public class DangdangOrderDetailServiceImpl implements DangdangOrderDetailService{

    @Resource
    private DangdangOrderDetailMapper dangdangOrderDetailMapper;

    @Override
    public int insert(DangdangOrderDetail record) {
        return dangdangOrderDetailMapper.insert(record);
    }

    @Override
    public int insertList(List<DangdangOrderDetail> list) {
        return dangdangOrderDetailMapper.insertList(list);
    }

}
