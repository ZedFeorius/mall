package com.zedfeorius.mall.mapper;

import com.zedfeorius.mall.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ZedFeorius
 * @version 1.0.0
 * @date 09 29 2022  10:18:31
 * @packageName com.zedfeorius.mall.mapper
 * @className CategoryMapper
 * @describe TODO
 */
@Repository
@Mapper
public interface CategoryMapper {
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
    Category getCategoryById(@Param("categoryId") Integer categoryId);

    /**
     * 新增
     * @param category
     * @return
     */
    Integer insertCategory(Category category);

    /**
     * 更新
     * @param category
     * @return
     */
    Integer updateCategory(Category category);

    /**
     * 删除
     * @param categoryId
     * @return
     */
    Integer deleteCategory(@Param("categoryId") Integer categoryId);
}
