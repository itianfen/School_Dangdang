package com.gxy.entity;

import java.math.BigDecimal;
import java.util.Date;

public class DangdangOrder {
    private BigDecimal orderId;

    private String orderSsid;

    private BigDecimal orderTotalprice;

    private Short orderState;

    private BigDecimal ddUserId;

    private Date orderCreatedate;

    public DangdangOrder(String orderSsid, BigDecimal orderTotalprice, BigDecimal ddUserId) {
        this.orderSsid = orderSsid;
        this.orderTotalprice = orderTotalprice;
        this.ddUserId = ddUserId;
    }

    public BigDecimal getOrderId() {
        return orderId;
    }

    public void setOrderId(BigDecimal orderId) {
        this.orderId = orderId;
    }

    public String getOrderSsid() {
        return orderSsid;
    }

    public void setOrderSsid(String orderSsid) {
        this.orderSsid = orderSsid;
    }

    public BigDecimal getOrderTotalprice() {
        return orderTotalprice;
    }

    public void setOrderTotalprice(BigDecimal orderTotalprice) {
        this.orderTotalprice = orderTotalprice;
    }

    public Short getOrderState() {
        return orderState;
    }

    public void setOrderState(Short orderState) {
        this.orderState = orderState;
    }

    public BigDecimal getDdUserId() {
        return ddUserId;
    }

    public void setDdUserId(BigDecimal ddUserId) {
        this.ddUserId = ddUserId;
    }

    public Date getOrderCreatedate() {
        return orderCreatedate;
    }

    public void setOrderCreatedate(Date orderCreatedate) {
        this.orderCreatedate = orderCreatedate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", orderSsid=").append(orderSsid);
        sb.append(", orderTotalprice=").append(orderTotalprice);
        sb.append(", orderState=").append(orderState);
        sb.append(", ddUserId=").append(ddUserId);
        sb.append(", orderCreatedate=").append(orderCreatedate);
        sb.append("]");
        return sb.toString();
    }
}