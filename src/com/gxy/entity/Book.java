package com.gxy.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class Book implements Serializable {

    private BigDecimal bookId;
    private String bookImg;
    private String bookName;
    private BigDecimal bookPrice;
    private BigDecimal bookDdprice;
    private BigDecimal bookCount;

    public Book(DangdangProduct product){
        this.bookId=product.getDdProductId();
        this.bookName =product.getDdProductName();
        this.bookImg=product.getDdProductImg();
        this.bookPrice=product.getDdProductPrice();
        this.bookDdprice=product.getDdProductDdprice();
        this.bookCount=new BigDecimal("1");
    }

    public BigDecimal getBookId() {
        return bookId;
    }

    public void setBookId(BigDecimal bookId) {
        this.bookId = bookId;
    }

    public String getBookImg() {
        return bookImg;
    }

    public void setBookImg(String bookImg) {
        this.bookImg = bookImg;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public BigDecimal getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(BigDecimal bookPrice) {
        this.bookPrice = bookPrice;
    }

    public BigDecimal getBookDdprice() {
        return bookDdprice;
    }

    public void setBookDdprice(BigDecimal bookDdprice) {
        this.bookDdprice = bookDdprice;
    }

    public BigDecimal getBookCount() {
        return bookCount;
    }

    public void setBookCount(BigDecimal bookCount) {
        this.bookCount = bookCount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookImg='" + bookImg + '\'' +
                ", booName='" + bookName + '\'' +
                ", bookPrice=" + bookPrice +
                ", bookDdprice=" + bookDdprice +
                ", bookCount=" + bookCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookId, book.bookId) &&
                Objects.equals(bookImg, book.bookImg) &&
                Objects.equals(bookName, book.bookName) &&
                Objects.equals(bookPrice, book.bookPrice) &&
                Objects.equals(bookDdprice, book.bookDdprice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, bookImg, bookName, bookPrice, bookDdprice, bookCount);
    }
}
