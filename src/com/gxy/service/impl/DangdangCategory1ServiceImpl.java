package com.gxy.service.impl;

import com.gxy.entity.DangdangCategory1;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.gxy.dao.DangdangCategory1Mapper;
import com.gxy.service.DangdangCategory1Service;

import java.util.List;

@Service
public class DangdangCategory1ServiceImpl implements DangdangCategory1Service{

    @Resource
    private DangdangCategory1Mapper dangdangCategory1Mapper;
    /**
     * 获取总目录
     *
     * @return
     */
    @Override
    public List<DangdangCategory1> selectAll() {
        return dangdangCategory1Mapper.selectAll();
    }
}
