package com.zedfeorius.mall.service;

import com.zedfeorius.mall.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ZedFeorius
 * @version 1.0.0
 * @date 09 29 2022  11:18:43
 * @packageName com.zedfeorius.mall.service
 * @className ProductService
 * @describe TODO
 */
public interface ProductService {
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
    Boolean insertProduct(Product product);

    /**
     * 更新
     * @param product
     * @return
     */
    Boolean updateProduct(Product product);

    /**
     * 删除
     * @param productId
     * @return
     */
    Boolean deleteProduct(@Param("productId") Integer productId);
}
