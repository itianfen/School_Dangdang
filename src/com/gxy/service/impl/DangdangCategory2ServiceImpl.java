package com.gxy.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.gxy.dao.DangdangCategory2Mapper;
import com.gxy.entity.DangdangCategory2;
import com.gxy.service.DangdangCategory2Service;

import java.util.List;

@Service
public class DangdangCategory2ServiceImpl implements DangdangCategory2Service{

    @Resource
    private DangdangCategory2Mapper dangdangCategory2Mapper;

    /**
     * 获取目录2商品总数
     *
     * @return
     */
    @Override
    public int totalCategoryCount() {
        return dangdangCategory2Mapper.totalCategoryCount();
    }
    /**
     * 获取目录2全部内容
     *
     * @return
     */
    @Override
    public List<DangdangCategory2> selectAll() {
        return dangdangCategory2Mapper.selectAll();
    }
}
