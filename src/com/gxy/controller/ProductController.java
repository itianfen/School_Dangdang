package com.gxy.controller;

import com.gxy.entity.DangdangProduct;
import com.gxy.service.DangdangProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private DangdangProductService dangdangProductService;

    @RequestMapping("/selectRecommed")
    public String selectRecommed(HttpServletRequest request) {
        List<DangdangProduct> dangdangProducts = dangdangProductService.selectAll(2);
        request.setAttribute("list",dangdangProducts);
        return "forward:/main/recommend.jsp";
    }

    @RequestMapping("/selectHot")
    public String selectHot(HttpServletRequest request) {
        List<DangdangProduct> dangdangProducts = dangdangProductService.selectAll(4);
        request.setAttribute("list",dangdangProducts);
        return "forward:/main/hot.jsp";
    }
    @RequestMapping("/more")
    public String hotMore(HttpServletRequest request,String itemN) {
        String url = request.getHeader("Referer");
        System.out.println(url);
        List<DangdangProduct> dangdangProducts = dangdangProductService.selectAll(8);
        request.setAttribute("list",dangdangProducts);
        return "forward:/main/hot.jsp";
    }

    @RequestMapping("/selectNew")
    public String selectNew(HttpServletRequest request) {
        List<DangdangProduct> dangdangProducts = dangdangProductService.selectAll(4);
        request.setAttribute("list",dangdangProducts);
        return "forward:/main/new.jsp";
    }
    @RequestMapping("/selectHotBoard")
    public String selectHotBoard(HttpServletRequest request) {
        List<DangdangProduct> dangdangProducts = dangdangProductService.selectAll(10);
        request.setAttribute("list",dangdangProducts);
        return "forward:/main/hotBoard.jsp";
    }



    @RequestMapping("/selectById")
    public String selectById(HttpServletRequest request,String ddProductId) {
        DangdangProduct dangdangProduct = dangdangProductService.selectByDdProductId(new BigDecimal(ddProductId));
        request.setAttribute("product",dangdangProduct);
        return "forward:/main/product.jsp";
    }
}
