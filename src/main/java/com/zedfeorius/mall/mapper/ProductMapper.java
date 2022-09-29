package com.zedfeorius.mall.mapper;

import com.zedfeorius.mall.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ZedFeorius
 * @version 1.0.0
 * @date 09 29 2022  11:09:52
 * @packageName com.zedfeorius.mall.mapper
 * @className ProductMapper
 * @describe TODO
 */
@Repository
@Mapper
public interface ProductMapper {
    /**
     * 查询全部
     * @return
     */
    List<Product> getProductList();

    /**
     * 根据id查询
     * @param productId
     * @return
     */
    Product getProductById(@Param("productId") Integer productId);

    /**
     * 新增
     * @param product
     * @return
     */
    Integer insertProduct(Product product);

    /**
     * 更新
     * @param product
     * @return
     */
    Integer updateProduct(Product product);

    /**
     * 删除
     * @param productId
     * @return
     */
    Integer deleteProduct(@Param("productId") Integer productId);
}
