package com.gxy.service;

import com.gxy.entity.DangdangOrderDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DangdangOrderDetailService{


    int insert(DangdangOrderDetail record);

    int insertList(List<DangdangOrderDetail> list);

}
