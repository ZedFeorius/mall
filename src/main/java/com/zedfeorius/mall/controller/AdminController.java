package com.zedfeorius.mall.controller;

import com.zedfeorius.mall.entity.Category;
import com.zedfeorius.mall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * @author ZedFeorius
 * @version 1.0.0
 * @date 10 08 2022  09:12:16
 * @packageName com.zedfeorius.mall.controller
 * @className AdminController
 * @describe TODO
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("home")
    public String toAdmin() {
        return "admin/homePage";
    }

    @RequestMapping("category")
    public String toCategory(HttpServletRequest request) {
        request.setAttribute("categoryList",categoryService.getCategoryList());
        request.setAttribute("categoryCount",categoryService.getCategoryList().size());
        return "admin/categoryManagePage";
    }

    @RequestMapping("categoryRefresh")
    @ResponseBody
    public Object refreshCategory() {
        return categoryService.getCategoryList();
    }

    @RequestMapping("category/new")
    public String newCategory(){
        return "admin/addOrUpdateCategoryPage";
    }

    @RequestMapping("category/{id}")
    public String updateCategory(@PathVariable("id") Integer id,HttpServletRequest request){
        request.setAttribute("category", categoryService.getCategoryById(id));
        return "admin/addOrUpdateCategoryPage";
    }

    @RequestMapping("deleteCategory/{id}")
    @ResponseBody
    public Object deleteCategory(@PathVariable("id") Integer id) {
        return categoryService.deleteCategory(id);
    }

    @RequestMapping("addOrUpdate")
    public String addOrUpdateCategory(HttpServletRequest request){
        String id = request.getParameter("categoryId");

        try {
            request.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

        //上传文件的存储路径（服务器文件系统上的绝对文件路径）
        String uploadPath = request.getSession().getServletContext().getRealPath("upload/");
        try {
            File fileSaveDir = new File(uploadPath);
            if (!fileSaveDir.exists()) {
                fileSaveDir.mkdirs();
            }
            Part part = request.getPart("categoryImageSrc");
            String fileName = extractFileName(part);
            String categoryImageSrc = null;
            if (!"".equals(fileName)){
                part.write(uploadPath + File.separator + fileName);
                request.setAttribute("message","上传成功！文件名为：" + fileName);
                categoryImageSrc = fileName;
            }
            String categoryName = request.getParameter("categoryName");
            //创建对象注入值
            Category category = new Category();
            category.setCategoryName(categoryName);
            category.setCategoryImageSrc(categoryImageSrc);
            if (id == null || "".equals(id)) {
                //添加
                categoryService.insertCategory(category);
            } else {
                //修改
                category.setCategoryId(Integer.parseInt(id));
                categoryService.updateCategory(category);
            }

        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
        return "admin/homePage";
    }

    private String extractFileName(Part part){
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        for (String item : items) {
            if (item.trim().startsWith("filename")){
                return item.substring(item.indexOf("=")+2,item.length()-1);
            }
        }
        return "";
    }

}
