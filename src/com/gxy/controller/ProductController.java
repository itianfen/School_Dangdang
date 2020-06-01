package com.gxy.controller;

import com.gxy.entity.DangdangCategory1;
import com.gxy.entity.DangdangProduct;
import com.gxy.service.DangdangCategory1Service;
import com.gxy.service.DangdangCategory2Service;
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
    @Autowired
    private DangdangCategory1Service dangdangCategory1Service;
    @Autowired
    private DangdangCategory2Service dangdangCategory2Service;

    /**
     * 获取
     *
     * @param request
     * @return
     */
    @RequestMapping("/selectRecommed")
    public String selectRecommed(HttpServletRequest request) {
        List<DangdangProduct> dangdangProducts = dangdangProductService.selectAll(2);
        request.setAttribute("list", dangdangProducts);
        return "forward:/main/recommend.jsp";
    }

    @RequestMapping("/selectHot")
    public String selectHot(HttpServletRequest request) {
        List<DangdangProduct> dangdangProducts = dangdangProductService.selectAll(4);
        request.setAttribute("list", dangdangProducts);
        return "forward:/main/hot.jsp";
    }

    //TODO:还需要获取来源信息 来返回哪一部分页面栏扩充 且 不影响 已扩充
    @RequestMapping("/more")
    public String hotMore(HttpServletRequest request, String itemN) {
        String url = request.getHeader("Referer");
        System.out.println(url);
        List<DangdangProduct> dangdangProducts = dangdangProductService.selectAll(8);
        request.setAttribute("list", dangdangProducts);
        return "forward:/main/main.jsp";
    }

    @RequestMapping("/selectNew")
    public String selectNew(HttpServletRequest request) {
        List<DangdangProduct> dangdangProducts = dangdangProductService.selectAll(4);
        request.setAttribute("list", dangdangProducts);
        return "forward:/main/new.jsp";
    }

    @RequestMapping("/selectHotBoard")
    public String selectHotBoard(HttpServletRequest request) {
        List<DangdangProduct> dangdangProducts = dangdangProductService.selectAll(10);
        request.setAttribute("list", dangdangProducts);
        return "forward:/main/hotBoard.jsp";
    }


    @RequestMapping("/selectById")
    public String selectById(HttpServletRequest request, String ddProductId) {
        DangdangProduct dangdangProduct = dangdangProductService.selectByDdProductId(new BigDecimal(ddProductId));
        request.setAttribute("product", dangdangProduct);
        return "forward:/main/product.jsp";
    }
    //TODO:一级二级目录混合查询 根据书名 作者 出版社 查询
    @RequestMapping("/selectProductAndCategory")
    public String selectProductAndCategory(String id, HttpServletRequest request) {
        List<DangdangCategory1> dangdangCategory1s = dangdangCategory1Service.selectAll();
        request.setAttribute("totalCategoryCount", dangdangCategory2Service.totalCategoryCount());
        request.setAttribute("categoryList", dangdangCategory1s);
        for (DangdangCategory1 dangdangCategory1 : dangdangCategory1s) {
            if (dangdangCategory1.getDdCategory1Id().equals(id)) {
                request.setAttribute("productList", dangdangCategory1.getListCategory2());
            }
        }
        return "forward:/main/book_list.jsp";
    }
}
