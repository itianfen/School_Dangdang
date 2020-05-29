package com.gxy.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DangdangUser implements Serializable {
    private BigDecimal ddUserId;

    private String ddUserEmail;

    private String ddUserPassword;

    private String ddUserNickName;

    private Short ddUserState;

    private String ddUserSalt;

    private String ddUserRole;

    private Date ddUserCreateDate;

    public BigDecimal getDdUserId() {
        return ddUserId;
    }

    public void setDdUserId(BigDecimal ddUserId) {
        this.ddUserId = ddUserId;
    }

    public String getDdUserEmail() {
        return ddUserEmail;
    }

    public void setDdUserEmail(String ddUserEmail) {
        this.ddUserEmail = ddUserEmail;
    }

    public String getDdUserPassword() {
        return ddUserPassword;
    }

    public void setDdUserPassword(String ddUserPassword) {
        this.ddUserPassword = ddUserPassword;
    }

    public String getDdUserNickName() {
        return ddUserNickName;
    }

    public void setDdUserNickName(String ddUserNickName) {
        this.ddUserNickName = ddUserNickName;
    }

    public Short getDdUserState() {
        return ddUserState;
    }

    public void setDdUserState(Short ddUserState) {
        this.ddUserState = ddUserState;
    }

    public String getDdUserSalt() {
        return ddUserSalt;
    }

    public void setDdUserSalt(String ddUserSalt) {
        this.ddUserSalt = ddUserSalt;
    }

    public String getDdUserRole() {
        return ddUserRole;
    }

    public void setDdUserRole(String ddUserRole) {
        this.ddUserRole = ddUserRole;
    }

    public Date getDdUserCreateDate() {
        return ddUserCreateDate;
    }

    public void setDdUserCreateDate(Date ddUserCreateDate) {
        this.ddUserCreateDate = ddUserCreateDate;
    }

    @Override
    public String toString() {
        return "DangdangUser{" +
                "ddUserId=" + ddUserId +
                ", ddUserEmail='" + ddUserEmail + '\'' +
                ", ddUserPassword='" + ddUserPassword + '\'' +
                ", ddUserNickname='" + ddUserNickName + '\'' +
                ", ddUserState=" + ddUserState +
                ", ddUserSalt='" + ddUserSalt + '\'' +
                ", ddUserRole='" + ddUserRole + '\'' +
                ", ddUserCreateDate=" + ddUserCreateDate +
                '}';
    }
}