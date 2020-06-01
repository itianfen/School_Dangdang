package com.gxy.controller;

import com.gxy.entity.DangdangCategory1;
import com.gxy.service.DangdangCategory1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private DangdangCategory1Service dangdangCategory1Service;

    /**
     * 获取图书目录信息
     *
     * @param request
     * @return
     */
    @RequestMapping("/selectCategory")
    public String selectCategory(HttpServletRequest request) {
        List<DangdangCategory1> dangdangCategory1s = dangdangCategory1Service.selectAll();
        request.setAttribute("list", dangdangCategory1s);
        return "forward:/main/category.jsp";
    }
}
