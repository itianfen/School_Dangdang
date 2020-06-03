package com.gxy.entity;

import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;

public class DangdangCategory2 {
    private static final long serialVersionUID = 1L;
    private BigDecimal ddCategory2Id;

    private String ddCategory2Name;

    private BigDecimal ddCategory1Id;

    private Date ddCategory2CreateDate;
    @Transient
    private BigDecimal ddCategory2Count;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public BigDecimal getDdCategory2Count() {
        return ddCategory2Count;
    }

    public void setDdCategory2Count(BigDecimal ddCategory2Count) {
        if (ddCategory2Count == null) ddCategory2Count = BigDecimal.ZERO;
        this.ddCategory2Count = ddCategory2Count;
    }

    public BigDecimal getDdCategory2Id() {
        return ddCategory2Id;
    }

    public void setDdCategory2Id(BigDecimal ddCategory2Id) {
        this.ddCategory2Id = ddCategory2Id;
    }

    public String getDdCategory2Name() {
        return ddCategory2Name;
    }

    public void setDdCategory2Name(String ddCategory2Name) {
        this.ddCategory2Name = ddCategory2Name;
    }

    public BigDecimal getDdCategory1Id() {
        return ddCategory1Id;
    }

    public void setDdCategory1Id(BigDecimal ddCategory1Id) {
        this.ddCategory1Id = ddCategory1Id;
    }

    public Date getDdCategory2CreateDate() {
        return ddCategory2CreateDate;
    }

    public void setDdCategory2CreateDate(Date ddCategory2CreateDate) {
        this.ddCategory2CreateDate = ddCategory2CreateDate;
    }

    @Override
    public String toString() {
        return "DangdangCategory2{" +
                "ddCategory2Id=" + ddCategory2Id +
                ", ddCategory2Name='" + ddCategory2Name + '\'' +
                ", ddCategory1Id=" + ddCategory1Id +
                ", ddCategory2CreateDate=" + ddCategory2CreateDate +
                ", ddCategory2Count=" + ddCategory2Count +
                '}';
    }
}