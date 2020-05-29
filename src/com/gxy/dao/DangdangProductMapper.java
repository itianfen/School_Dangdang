package com.gxy.dao;
import java.math.BigDecimal;

import com.gxy.entity.DangdangProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DangdangProductMapper {
    List<DangdangProduct> selectAll(@Param("count")Integer count);
    DangdangProduct selectByDdProductId(@Param("ddProductId")BigDecimal ddProductId);
}