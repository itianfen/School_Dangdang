package com.gxy.service;

import com.gxy.entity.DangdangCategory1;
import com.gxy.entity.DangdangCategory2;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface DangdangCategory2Service{
    /**
     * 获取目录2商品总数
     *
     * @return
     */
    int totalCategoryCount();
    /**
     * 获取目录2全部内容
     *
     * @return
     */
    List<DangdangCategory2> selectAll();

    List<DangdangCategory2>selectByDdCategory1Id(BigDecimal category1Id);

}
