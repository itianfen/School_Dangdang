package com.gxy.service;

import com.gxy.entity.DangdangCategory2;
import com.gxy.entity.DangdangProduct;
import org.apache.ibatis.annotations.Param;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.List;

public interface DangdangProductService{
    List<DangdangProduct>selectAll(Integer count);
    DangdangProduct selectByDdProductId(BigDecimal ddProductId);
    List<DangdangProduct> selectByDdCategory2Id(BigDecimal categoryId);
    List<DangdangProduct> selectByDdCategory2IdList(List<DangdangCategory2> list);
}
