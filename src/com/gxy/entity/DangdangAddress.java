package com.gxy.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DangdangAddress implements Serializable {
    private BigDecimal addressId;

    private String addressReceiveName;

    private String addressAdd;

    private String addressMobile;

    private String addressZipcode;

    private Short addressState;

    private BigDecimal ddUserId;

    private Date addressCreatedate;

    private static final long serialVersionUID = 1L;

    public DangdangAddress() {
    }

    public DangdangAddress(String addressReceiveName, String addressAdd, String addressMobile, String addressZipcode, BigDecimal ddUserId) {
        this.addressReceiveName = addressReceiveName;
        this.addressAdd = addressAdd;
        this.addressMobile = addressMobile;
        this.addressZipcode = addressZipcode;
        this.ddUserId = ddUserId;
    }

    public BigDecimal getAddressId() {
        return addressId;
    }

    public void setAddressId(BigDecimal addressId) {
        this.addressId = addressId;
    }

    public String getAddressReceiveName() {
        return addressReceiveName;
    }

    public void setAddressReceiveName(String addressReceiveName) {
        this.addressReceiveName = addressReceiveName;
    }

    public String getAddressAdd() {
        return addressAdd;
    }

    public void setAddressAdd(String addressAdd) {
        this.addressAdd = addressAdd;
    }

    public String getAddressMobile() {
        return addressMobile;
    }

    public void setAddressMobile(String addressMobile) {
        this.addressMobile = addressMobile;
    }

    public String getAddressZipcode() {
        return addressZipcode;
    }

    public void setAddressZipcode(String addressZipcode) {
        this.addressZipcode = addressZipcode;
    }

    public Short getAddressState() {
        return addressState;
    }

    public void setAddressState(Short addressState) {
        this.addressState = addressState;
    }

    public BigDecimal getDdUserId() {
        return ddUserId;
    }

    public void setDdUserId(BigDecimal ddUserId) {
        this.ddUserId = ddUserId;
    }

    public Date getAddressCreatedate() {
        return addressCreatedate;
    }

    public void setAddressCreatedate(Date addressCreatedate) {
        this.addressCreatedate = addressCreatedate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", addressId=").append(addressId);
        sb.append(", addressReceiveName=").append(addressReceiveName);
        sb.append(", addressAdd=").append(addressAdd);
        sb.append(", addressMobile=").append(addressMobile);
        sb.append(", addressZipcode=").append(addressZipcode);
        sb.append(", addressState=").append(addressState);
        sb.append(", ddUserId=").append(ddUserId);
        sb.append(", addressCreatedate=").append(addressCreatedate);
        sb.append("]");
        return sb.toString();
    }
}