package com.gxy.dao;

import com.gxy.entity.DangdangCategory1;
import com.gxy.entity.DangdangCategory2;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface DangdangCategory2Mapper {
    /**
     * 获取目录2全部内容
     *
     * @return
     */
    List<DangdangCategory2> selectAll();

    /**
     * 获取目录2商品总数
     *
     * @return
     */
    int totalCategoryCount();

    List<DangdangCategory2>selectByDdCategory1Id(@Param("category1Id")BigDecimal category1Id);
}