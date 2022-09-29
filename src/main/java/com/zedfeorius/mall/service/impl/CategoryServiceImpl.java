package com.zedfeorius.mall.service.impl;

import com.zedfeorius.mall.entity.Category;
import com.zedfeorius.mall.mapper.CategoryMapper;
import com.zedfeorius.mall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZedFeorius
 * @version 1.0.0
 * @date 09 29 2022  10:34:56
 * @packageName com.zedfeorius.mall.service.impl
 * @className CategoryServiceImpl
 * @describe TODO
 */
@Service("CategoryService")
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;
    @Override
    public List<Category> getCategoryList() {
        return categoryMapper.getCategoryList();
    }

    @Override
    public Category getCategoryById(Integer categoryId) {
        return categoryMapper.getCategoryById(categoryId);
    }

    @Override
    public Boolean insertCategory(Category category) {
        return categoryMapper.insertCategory(category) > 0;
    }

    @Override
    public Boolean updateCategory(Category category) {
        return categoryMapper.updateCategory(category) > 0;
    }

    @Override
    public Boolean deleteCategory(Integer categoryId) {
        return categoryMapper.deleteCategory(categoryId) > 0;
    }
}
