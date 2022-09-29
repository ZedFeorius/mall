package com.zedfeorius.mall.controller;

import com.zedfeorius.mall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ZedFeorius
 * @version 1.0.0
 * @date 09 29 2022  10:36:21
 * @packageName com.zedfeorius.mall.controller
 * @className ProductController
 * @describe TODO
 */
@Controller
@RequestMapping("/main")
public class ProductController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/home")
    public String home(HttpServletRequest request) {
        request.setAttribute("categoryList",categoryService.getCategoryList());
        return "fore/homePage";
    }
}
