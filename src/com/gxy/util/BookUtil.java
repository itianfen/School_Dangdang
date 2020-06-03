package com.gxy.util;

import com.gxy.entity.Book;
import com.gxy.entity.DangdangOrderDetail;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BookUtil {

    public static ArrayList<Book> add(ArrayList<Book>books, Book book) {
        for (int i = 0; i < books.size(); i++) {
            Book tempBook = books.get(i);
            if (tempBook.equals(book)) {
                tempBook.setBookCount(tempBook.getBookCount().add(book.getBookCount()));
                books.set(i, tempBook);
                return books;
            }
        }
        books.add(book);
        return books;
    }
    public static List<DangdangOrderDetail>trans(List<Book>cartList,String orderSSID,BigDecimal addressId,BigDecimal userId){
        List<DangdangOrderDetail>dangdangOrderDetails=new ArrayList<>();
        for (Book book : cartList) {
            DangdangOrderDetail dangdangOrderDetail =new DangdangOrderDetail(book,orderSSID,addressId,userId);
            dangdangOrderDetails.add(dangdangOrderDetail);
        }
        return dangdangOrderDetails;
    }
}
