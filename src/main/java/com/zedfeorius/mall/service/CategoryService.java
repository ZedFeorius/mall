package com.zedfeorius.mall.service;

import com.zedfeorius.mall.entity.Category;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ZedFeorius
 * @version 1.0.0
 * @date 09 29 2022  10:34:13
 * @packageName com.zedfeorius.mall.service
 * @className CategoryService
 * @describe TODO
 */
public interface CategoryService {
    /**
     * 查询全部
     * @return
     */
    List<Category> getCategoryList();

    /**
     * 根据id查询
     * @param categoryId
     * @return
     */
    Category getCategoryById(Integer categoryId);

    /**
     * 新增
     * @param category
     * @return
     */
    Boolean insertCategory(Category category);

    /**
     * 更新
     * @param category
     * @return
     */
    Boolean updateCategory(Category category);

    /**
     * 删除
     * @param categoryId
     * @return
     */
    Boolean deleteCategory(Integer categoryId);
}
