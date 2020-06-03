package com.gxy.controller;

import com.gxy.entity.Book;
import com.gxy.entity.DangdangOrder;
import com.gxy.entity.DangdangOrderDetail;
import com.gxy.entity.DangdangUser;
import com.gxy.service.DangdangAddressService;
import com.gxy.service.DangdangOrderDetailService;
import com.gxy.service.DangdangOrderService;
import com.gxy.util.BookUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private DangdangAddressService dangdangAddressService;
    @Autowired
    private DangdangOrderService dangdangOrderService;
    @Autowired
    private DangdangOrderDetailService dangdangOrderDetailService;
    @RequestMapping("/createOrder")
    @ResponseBody
    public boolean createOrder(HttpServletRequest request, String addressReceiveName, String addressAdd, String addressZipcode, String addressMobile) {
        String uuid = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        request.getSession().setAttribute("orderSSID",uuid);
        DangdangUser user = (DangdangUser) request.getSession().getAttribute("user");
        List<Book>cartList = (List<Book>) request.getSession().getAttribute("cartList");
        BigDecimal userId = user.getDdUserId();
        BigDecimal addressId = dangdangAddressService.checkAndReturnAddressId(addressReceiveName,addressAdd,addressZipcode,addressMobile,userId);
        BigDecimal totalPrice = (BigDecimal) request.getSession().getAttribute("totalPrice");
        DangdangOrder dangdangOrder = new DangdangOrder(uuid,totalPrice,userId);
        dangdangOrderService.insert(dangdangOrder);
        List<DangdangOrderDetail>dangdangOrderDetails = BookUtil.trans(cartList,uuid,addressId,userId);
        dangdangOrderDetailService.insertList(dangdangOrderDetails);
        return true;
    }
}
