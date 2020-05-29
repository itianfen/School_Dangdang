package com.gxy.util;

import com.gxy.entity.Book;

import java.math.BigDecimal;
import java.util.ArrayList;

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


//        for (Book b :
//                books) {
//            if (b.equals(book)){
//                b.setBookCount(b.getBookCount().add(new BigDecimal("1")));
//                return books;
//            }
//        }
//        books.add(book);
//        return books;
//    }
}
