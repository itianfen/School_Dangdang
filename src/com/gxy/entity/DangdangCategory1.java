package com.gxy.entity;

import javax.persistence.Transient;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class DangdangCategory1 implements Serializable {
    private BigDecimal ddCategory1Id;

    private String ddCategory1Name;

    private Date ddCategory1CreateDate;
    @Transient
    private List<DangdangCategory2> listCategory2;
    @Transient
    private BigDecimal ddCategory1Count;

    private static final long serialVersionUID = 1L;

    public BigDecimal getDdCategory1Count() {
        return ddCategory1Count;
    }

    public void setDdCategory1Count(BigDecimal ddCategory1Count) {
        this.ddCategory1Count = ddCategory1Count;
    }

    public BigDecimal getDdCategory1Id() {
        return ddCategory1Id;
    }

    public void setDdCategory1Id(BigDecimal ddCategory1Id) {
        this.ddCategory1Id = ddCategory1Id;
    }

    public String getDdCategory1Name() {
        return ddCategory1Name;
    }

    public void setDdCategory1Name(String ddCategory1Name) {
        this.ddCategory1Name = ddCategory1Name;
    }

    public Date getDdCategory1CreateDate() {
        return ddCategory1CreateDate;
    }

    public void setDdCategory1CreateDate(Date ddCategory1CreateDate) {
        this.ddCategory1CreateDate = ddCategory1CreateDate;
    }

    public List<DangdangCategory2> getListCategory2() {
        return listCategory2;
    }

    public void setListCategory2(List<DangdangCategory2> listCategory2) {
        this.listCategory2 = listCategory2;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "DangdangCategory1{" +
                "ddCategory1Id=" + ddCategory1Id +
                ", ddCategory1Name='" + ddCategory1Name + '\'' +
                ", ddCategory1CreateDate=" + ddCategory1CreateDate +
                ", listCategory2=" + listCategory2 +
                ", ddCategory1Count=" + ddCategory1Count +
                '}';
    }
}