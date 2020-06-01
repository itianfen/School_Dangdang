package com.gxy.controller;

import com.alibaba.fastjson.JSONObject;
import com.gxy.entity.Book;
import com.gxy.entity.DangdangProduct;
import com.gxy.service.DangdangProductService;
import com.gxy.util.BookUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.ArrayList;

@Controller
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private DangdangProductService dangdangProductService;

    /**
     * 私有工具方法
     * 获取session中的购物车清单
     *
     * @param request
     * @return
     */
    private ArrayList<Book> getCartList(HttpServletRequest request) {
        ArrayList<Book> cartList = (ArrayList<Book>) request.getSession().getAttribute("cartList");
        if (cartList == null) cartList = new ArrayList<>();
        request.getSession().setAttribute("cartList", cartList);
        return cartList;
    }

    /**
     * 私有工具方法
     * 获取session中已删除商品清单
     *
     * @param request
     * @return
     */
    private ArrayList<Book> getCartList2(HttpServletRequest request) {
        ArrayList<Book> cartList2 = (ArrayList<Book>) request.getSession().getAttribute("cartList2");
        if (cartList2 == null) cartList2 = new ArrayList<>();
        request.getSession().setAttribute("cartList2", cartList2);
        return cartList2;
    }

    /**
     * 添加购物车
     *
     * @param request
     * @param id
     * @return
     */
    @RequestMapping("/addBook")
    @ResponseBody
    public String addBook(HttpServletRequest request, String id) {
        ArrayList<Book> cartList = getCartList(request);
        DangdangProduct dangdangProduct = dangdangProductService.selectByDdProductId(new BigDecimal(id));
        Book book = new Book(dangdangProduct);
        cartList = BookUtil.add(cartList, book);
        System.out.println(cartList);
        return "success";
    }

    /**
     * 获取购物车
     *
     * @param request
     * @return
     */
    @RequestMapping("/getCart")
    @ResponseBody
    public JSONObject getCart(HttpServletRequest request) {
        ArrayList<Book> cartList = getCartList(request);
        BigDecimal totalPrice = new BigDecimal("0");
        BigDecimal totalDDPrice = new BigDecimal("0");
        for (Book book : cartList) {
            totalPrice = book.getBookPrice().multiply(book.getBookCount()).add(totalPrice);
            totalDDPrice = book.getBookDdprice().multiply(book.getBookCount()).add(totalDDPrice);
        }
        request.getSession().setAttribute("totalPrice", totalPrice);
        request.getSession().setAttribute("totalDDPrice", totalDDPrice);
        JSONObject result = new JSONObject();
        result.put("totalPrice", totalPrice);
        result.put("totalDDPrice", totalDDPrice);
        return result;
    }

    /**
     * 设置书本数量
     *
     * @param request
     * @param id
     * @param count
     * @return
     */
    @RequestMapping("/setBookCount")
    @ResponseBody
    public JSONObject setBookCount(HttpServletRequest request, String id, String count) {
        ArrayList<Book> cartList = getCartList(request);
        for (int i = 0; i < cartList.size(); i++) {
            Book tempBook = cartList.get(i);
            if (tempBook.getBookId().equals(new BigDecimal(id))) {
                tempBook.setBookCount(new BigDecimal(count));
                cartList.set(i, tempBook);
            }
            break;
        }
        JSONObject result = new JSONObject();
        result.put("status", true);
        return result;
    }

    /**
     * 删除购物车图书，移至恢复列表
     *
     * @param request
     * @param id
     * @return
     */
    @RequestMapping("/deleteBook")
    public String deleteBook(HttpServletRequest request, String id) {
        ArrayList<Book> cartList = getCartList(request);
        ArrayList<Book> cartList2 = getCartList2(request);
        for (int i = 0; i < cartList.size(); i++) {
            Book tempBook = cartList.get(i);
            if (tempBook.getBookId().equals(new BigDecimal(id))) {
                cartList.remove(i);
                cartList2.add(tempBook);
            }
            break;
        }
        return "redirect:/cart/cart_list.jsp";
    }

    /**
     * 恢复图书
     *
     * @param request
     * @param id
     * @return
     */
    @RequestMapping("/restoreBook")
    public String restoreBook(HttpServletRequest request, String id) {
        ArrayList<Book> cartList = getCartList(request);
        ArrayList<Book> cartList2 = getCartList2(request);
        for (int i = 0; i < cartList2.size(); i++) {
            Book tempBook = cartList2.get(i);
            if (tempBook.getBookId().equals(new BigDecimal(id))) {
                cartList2.remove(i);
                cartList = BookUtil.add(cartList, tempBook);
            }
            break;
        }
        return "redirect:/cart/cart_list.jsp";
    }

    /**
     * 从恢复区彻底删除图书
     *
     * @param request
     * @param id
     * @return
     */
    @RequestMapping("/removeBook")
    public String removeBook(HttpServletRequest request, String id) {
        ArrayList<Book> cartList2 = getCartList2(request);
        for (int i = 0; i < cartList2.size(); i++) {
            Book tempBook = cartList2.get(i);
            if (tempBook.getBookId().equals(new BigDecimal(id))) {
                cartList2.remove(i);
            }
            break;
        }
        return "redirect:/cart/cart_list.jsp";
    }
}
