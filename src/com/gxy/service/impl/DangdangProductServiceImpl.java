package com.gxy.service.impl;

import com.gxy.entity.DangdangProduct;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.gxy.dao.DangdangProductMapper;
import com.gxy.service.DangdangProductService;

import java.math.BigDecimal;
import java.util.List;

@Service
public class DangdangProductServiceImpl implements DangdangProductService{

    @Resource
    private DangdangProductMapper dangdangProductMapper;

    @Override
    public List<DangdangProduct> selectAll(Integer count) {
        return dangdangProductMapper.selectAll(count+1);
    }

    public DangdangProduct selectByDdProductId(BigDecimal ddProductId) {
        return dangdangProductMapper.selectByDdProductId(ddProductId);
    }
}
