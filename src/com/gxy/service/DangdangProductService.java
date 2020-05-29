package com.gxy.service;

import com.gxy.entity.DangdangProduct;

import java.math.BigDecimal;
import java.util.List;

public interface DangdangProductService{
    List<DangdangProduct>selectAll(Integer count);
    DangdangProduct selectByDdProductId(BigDecimal ddProductId);
}
