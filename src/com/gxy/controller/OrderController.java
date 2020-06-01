package com.gxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {
    @RequestMapping("/createOrder")
    public String createOrder() {
        return null;
    }
}
