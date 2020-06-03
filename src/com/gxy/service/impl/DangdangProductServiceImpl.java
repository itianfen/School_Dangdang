package com.gxy.service.impl;

import com.gxy.entity.DangdangCategory2;
import com.gxy.entity.DangdangProduct;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.gxy.dao.DangdangProductMapper;
import com.gxy.service.DangdangProductService;

import java.math.BigDecimal;
import java.util.List;

@Service
public class DangdangProductServiceImpl implements DangdangProductService {

    @Resource
    private DangdangProductMapper dangdangProductMapper;

    @Override
    public List<DangdangProduct> selectAll(Integer count) {
        return dangdangProductMapper.selectAll(count + 1);
    }

    @Override
    public DangdangProduct selectByDdProductId(BigDecimal ddProductId) {
        return dangdangProductMapper.selectByDdProductId(ddProductId);
    }

    @Override
    public List<DangdangProduct> selectByDdCategory2Id(BigDecimal categoryId) {
        return dangdangProductMapper.selectByDdCategory2Id(categoryId);
    }

    @Override
    public List<DangdangProduct> selectByDdCategory2IdList(List<DangdangCategory2> list) {
        return dangdangProductMapper.selectByDdCategory2IdList(list);
    }


}
