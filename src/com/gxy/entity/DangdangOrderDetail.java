package com.gxy.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

public class DangdangOrderDetail {
    private BigDecimal detailId;

    private String detailSsid;

    private String detailProductName;

    private BigDecimal detailCount;

    private BigDecimal detailDdprice;

    private BigDecimal ddProductId;

    private String orderSsid;

    private BigDecimal addressId;

    private BigDecimal ddUserId;

    private Date detailCreatedate;


    public DangdangOrderDetail(Book book,String orderSsid,BigDecimal addressId,BigDecimal ddUserId) {
        this.detailSsid= UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        this.ddProductId=book.getBookId();
        this.detailCount=book.getBookCount();
        this.detailDdprice=book.getBookDdprice();
        this.detailProductName=book.getBookName();
        this.orderSsid=orderSsid;
        this.addressId=addressId;
        this.ddUserId=ddUserId;
    }

    public BigDecimal getDetailId() {
        return detailId;
    }

    public void setDetailId(BigDecimal detailId) {
        this.detailId = detailId;
    }

    public String getDetailSsid() {
        return detailSsid;
    }

    public void setDetailSsid(String detailSsid) {
        this.detailSsid = detailSsid;
    }

    public String getDetailProductName() {
        return detailProductName;
    }

    public void setDetailProductName(String detailProductName) {
        this.detailProductName = detailProductName;
    }

    public BigDecimal getDetailCount() {
        return detailCount;
    }

    public void setDetailCount(BigDecimal detailCount) {
        this.detailCount = detailCount;
    }

    public BigDecimal getDetailDdprice() {
        return detailDdprice;
    }

    public void setDetailDdprice(BigDecimal detailDdprice) {
        this.detailDdprice = detailDdprice;
    }

    public BigDecimal getDdProductId() {
        return ddProductId;
    }

    public void setDdProductId(BigDecimal ddProductId) {
        this.ddProductId = ddProductId;
    }

    public String getOrderSsid() {
        return orderSsid;
    }

    public void setOrderSsid(String orderSsid) {
        this.orderSsid = orderSsid;
    }

    public BigDecimal getAddressId() {
        return addressId;
    }

    public void setAddressId(BigDecimal addressId) {
        this.addressId = addressId;
    }

    public BigDecimal getDdUserId() {
        return ddUserId;
    }

    public void setDdUserId(BigDecimal ddUserId) {
        this.ddUserId = ddUserId;
    }

    public Date getDetailCreatedate() {
        return detailCreatedate;
    }

    public void setDetailCreatedate(Date detailCreatedate) {
        this.detailCreatedate = detailCreatedate;
    }

    @Override
    public String toString() {
        return "DangdangOrderDetail{" +
                "detailId=" + detailId +
                ", detailSsid='" + detailSsid + '\'' +
                ", detailProductName='" + detailProductName + '\'' +
                ", detailCount=" + detailCount +
                ", detailDdprice=" + detailDdprice +
                ", ddProductId=" + ddProductId +
                ", orderSsid='" + orderSsid + '\'' +
                ", addressId=" + addressId +
                ", ddUserId=" + ddUserId +
                ", detailCreatedate=" + detailCreatedate +
                '}';
    }
}