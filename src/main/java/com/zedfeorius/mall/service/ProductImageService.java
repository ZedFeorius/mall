package com.zedfeorius.mall.service;

import com.zedfeorius.mall.entity.ProductImage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ZedFeorius
 * @version 1.0.0
 * @date 09 29 2022  11:49:47
 * @packageName com.zedfeorius.mall.service
 * @className ProductImageService
 * @describe TODO
 */
public interface ProductImageService {
    /**
     * 查询全部
     * @return
     */
    List<ProductImage> getProductImageList();

    /**
     * 根据id查询
     * @param productImageId
     * @return
     */
    ProductImage getProductImageById(@Param("productImageId") Integer productImageId);

    /**
     * 新增
     * @param productImage
     * @return
     */
    Boolean insertProductImage(ProductImage productImage);

    /**
     * 更新
     * @param productImage
     * @return
     */
    Boolean updateProductImage(ProductImage productImage);

    /**
     * 删除
     * @param productImageId
     * @return
     */
    Boolean deleteProductImage(@Param("productImageId") Integer productImageId);
}
