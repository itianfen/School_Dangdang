package com.gxy.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DangdangProduct implements Serializable {
    private BigDecimal ddProductId;

    private String ddProductName;

    private String ddProductAuthor;

    private String ddProductImg;

    private String ddProductPress;

    private String ddProductPresstime;

    private String ddProductEdition;

    private String ddProductPrinttime;

    private BigDecimal ddProductPrintcount;

    private String ddProductIsbn;

    private String ddProductWordcount;

    private String ddProductPagecount;

    private String ddProductFormat;

    private String ddProductPaper;

    private String ddProductPack;

    private BigDecimal ddProductPrice;

    private BigDecimal ddProductDdprice;

    private BigDecimal ddProductCount;

    private Date ddProductAddtime;

    private String ddProductRecommend;

    private String ddProductBrief;

    private String ddProductAuthorbrief;

    private String ddProductDirectory;

    private String ddProductMediacomment;

    private String ddProductExcerpt;

    private BigDecimal ddCategory2Id;

    private Date ddProductCreateDate;

    private static final long serialVersionUID = 1L;

    public BigDecimal getDdProductId() {
        return ddProductId;
    }

    public void setDdProductId(BigDecimal ddProductId) {
        this.ddProductId = ddProductId;
    }

    public String getDdProductName() {
        return ddProductName;
    }

    public void setDdProductName(String ddProductName) {
        this.ddProductName = ddProductName;
    }

    public String getDdProductAuthor() {
        return ddProductAuthor;
    }

    public void setDdProductAuthor(String ddProductAuthor) {
        this.ddProductAuthor = ddProductAuthor;
    }

    public String getDdProductImg() {
        return ddProductImg;
    }

    public void setDdProductImg(String ddProductImg) {
        this.ddProductImg = ddProductImg;
    }

    public String getDdProductPress() {
        return ddProductPress;
    }

    public void setDdProductPress(String ddProductPress) {
        this.ddProductPress = ddProductPress;
    }

    public String getDdProductPresstime() {
        return ddProductPresstime;
    }

    public void setDdProductPresstime(String ddProductPresstime) {
        this.ddProductPresstime = ddProductPresstime;
    }

    public String getDdProductEdition() {
        return ddProductEdition;
    }

    public void setDdProductEdition(String ddProductEdition) {
        this.ddProductEdition = ddProductEdition;
    }

    public String getDdProductPrinttime() {
        return ddProductPrinttime;
    }

    public void setDdProductPrinttime(String ddProductPrinttime) {
        this.ddProductPrinttime = ddProductPrinttime;
    }

    public BigDecimal getDdProductPrintcount() {
        return ddProductPrintcount;
    }

    public void setDdProductPrintcount(BigDecimal ddProductPrintcount) {
        this.ddProductPrintcount = ddProductPrintcount;
    }

    public String getDdProductIsbn() {
        return ddProductIsbn;
    }

    public void setDdProductIsbn(String ddProductIsbn) {
        this.ddProductIsbn = ddProductIsbn;
    }

    public String getDdProductWordcount() {
        return ddProductWordcount;
    }

    public void setDdProductWordcount(String ddProductWordcount) {
        this.ddProductWordcount = ddProductWordcount;
    }

    public String getDdProductPagecount() {
        return ddProductPagecount;
    }

    public void setDdProductPagecount(String ddProductPagecount) {
        this.ddProductPagecount = ddProductPagecount;
    }

    public String getDdProductFormat() {
        return ddProductFormat;
    }

    public void setDdProductFormat(String ddProductFormat) {
        this.ddProductFormat = ddProductFormat;
    }

    public String getDdProductPaper() {
        return ddProductPaper;
    }

    public void setDdProductPaper(String ddProductPaper) {
        this.ddProductPaper = ddProductPaper;
    }

    public String getDdProductPack() {
        return ddProductPack;
    }

    public void setDdProductPack(String ddProductPack) {
        this.ddProductPack = ddProductPack;
    }

    public BigDecimal getDdProductPrice() {
        return ddProductPrice;
    }

    public void setDdProductPrice(BigDecimal ddProductPrice) {
        this.ddProductPrice = ddProductPrice;
    }

    public BigDecimal getDdProductDdprice() {
        return ddProductDdprice;
    }

    public void setDdProductDdprice(BigDecimal ddProductDdprice) {
        this.ddProductDdprice = ddProductDdprice;
    }

    public BigDecimal getDdProductCount() {
        return ddProductCount;
    }

    public void setDdProductCount(BigDecimal ddProductCount) {
        this.ddProductCount = ddProductCount;
    }

    public Date getDdProductAddtime() {
        return ddProductAddtime;
    }

    public void setDdProductAddtime(Date ddProductAddtime) {
        this.ddProductAddtime = ddProductAddtime;
    }

    public String getDdProductRecommend() {
        return ddProductRecommend;
    }

    public void setDdProductRecommend(String ddProductRecommend) {
        this.ddProductRecommend = ddProductRecommend;
    }

    public String getDdProductBrief() {
        return ddProductBrief;
    }

    public void setDdProductBrief(String ddProductBrief) {
        this.ddProductBrief = ddProductBrief;
    }

    public String getDdProductAuthorbrief() {
        return ddProductAuthorbrief;
    }

    public void setDdProductAuthorbrief(String ddProductAuthorbrief) {
        this.ddProductAuthorbrief = ddProductAuthorbrief;
    }

    public String getDdProductDirectory() {
        return ddProductDirectory;
    }

    public void setDdProductDirectory(String ddProductDirectory) {
        this.ddProductDirectory = ddProductDirectory;
    }

    public String getDdProductMediacomment() {
        return ddProductMediacomment;
    }

    public void setDdProductMediacomment(String ddProductMediacomment) {
        this.ddProductMediacomment = ddProductMediacomment;
    }

    public String getDdProductExcerpt() {
        return ddProductExcerpt;
    }

    public void setDdProductExcerpt(String ddProductExcerpt) {
        this.ddProductExcerpt = ddProductExcerpt;
    }

    public BigDecimal getDdCategory2Id() {
        return ddCategory2Id;
    }

    public void setDdCategory2Id(BigDecimal ddCategory2Id) {
        this.ddCategory2Id = ddCategory2Id;
    }

    public Date getDdProductCreateDate() {
        return ddProductCreateDate;
    }

    public void setDdProductCreateDate(Date ddProductCreateDate) {
        this.ddProductCreateDate = ddProductCreateDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ddProductId=").append(ddProductId);
        sb.append(", ddProductName=").append(ddProductName);
        sb.append(", ddProductAuthor=").append(ddProductAuthor);
        sb.append(", ddProductImg=").append(ddProductImg);
        sb.append(", ddProductPress=").append(ddProductPress);
        sb.append(", ddProductPresstime=").append(ddProductPresstime);
        sb.append(", ddProductEdition=").append(ddProductEdition);
        sb.append(", ddProductPrinttime=").append(ddProductPrinttime);
        sb.append(", ddProductPrintcount=").append(ddProductPrintcount);
        sb.append(", ddProductIsbn=").append(ddProductIsbn);
        sb.append(", ddProductWordcount=").append(ddProductWordcount);
        sb.append(", ddProductPagecount=").append(ddProductPagecount);
        sb.append(", ddProductFormat=").append(ddProductFormat);
        sb.append(", ddProductPaper=").append(ddProductPaper);
        sb.append(", ddProductPack=").append(ddProductPack);
        sb.append(", ddProductPrice=").append(ddProductPrice);
        sb.append(", ddProductDdprice=").append(ddProductDdprice);
        sb.append(", ddProductCount=").append(ddProductCount);
        sb.append(", ddProductAddtime=").append(ddProductAddtime);
        sb.append(", ddProductRecommend=").append(ddProductRecommend);
        sb.append(", ddProductBrief=").append(ddProductBrief);
        sb.append(", ddProductAuthorbrief=").append(ddProductAuthorbrief);
        sb.append(", ddProductDirectory=").append(ddProductDirectory);
        sb.append(", ddProductMediacomment=").append(ddProductMediacomment);
        sb.append(", ddProductExcerpt=").append(ddProductExcerpt);
        sb.append(", ddCategory2Id=").append(ddCategory2Id);
        sb.append(", ddProductCreateDate=").append(ddProductCreateDate);
        sb.append("]");
        return sb.toString();
    }
}