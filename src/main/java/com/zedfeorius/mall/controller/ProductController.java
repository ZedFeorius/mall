package com.zedfeorius.mall.controller;

import com.zedfeorius.mall.entity.Category;
import com.zedfeorius.mall.entity.Product;
import com.zedfeorius.mall.entity.ProductImage;
import com.zedfeorius.mall.service.CategoryService;
import com.zedfeorius.mall.service.ProductImageService;
import com.zedfeorius.mall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

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
    @Autowired
    private ProductService productService;
    @Autowired
    private ProductImageService productImageService;

    @RequestMapping("/home")
    public String home(HttpServletRequest request) {
        List<Category> categoryList = categoryService.getCategoryList();
        List<Product> productList = productService.getProductList();
        List<ProductImage> productImages = productImageService.getProductImageList();
        List<Product> specialProductList = new ArrayList<>();
        for (Product product : productList) {
            List<ProductImage> productImageList = new ArrayList<>();
            for (ProductImage productImage : productImages) {
                if (productImage.getProductImageProductId().equals(product.getProductId())){
                    productImageList.add(productImage);
                }
            }
            product.setSingleProductImageList(productImageList);
            if (product.getProductIsEnabled().equals(2)){
                specialProductList.add(product);
            }
        }

        for (Category category : categoryList) {
            List<Product> ps = new ArrayList<>();
            for (Product product : productList) {
                if (product.getProductCategoryId().equals(category.getCategoryId())){
                    ps.add(product);
                }
            }
            category.setProductList(ps);
        }
        request.setAttribute("categoryList",categoryList);
        request.setAttribute("specialProductList",specialProductList);
        return "fore/homePage";
    }
}
