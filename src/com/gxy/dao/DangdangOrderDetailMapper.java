package com.gxy.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.gxy.entity.DangdangOrderDetail;

public interface DangdangOrderDetailMapper {
    int insert(DangdangOrderDetail record);

    int insertList(@Param("list")List<DangdangOrderDetail> list);


}