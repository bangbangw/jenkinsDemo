package com.wfd360.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 *
 */
@Controller
@RequestMapping("/")
public class HelloController {
    /**
     * 获取首页
     */
    @RequestMapping("/index")
    public String index(HttpServletRequest request) {
        System.out.println("---------index-1234----------");
        request.setAttribute("say", "hello word!1234");
        return "index.jsp";
    }
}
