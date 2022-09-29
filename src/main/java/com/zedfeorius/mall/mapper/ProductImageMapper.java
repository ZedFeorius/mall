package com.zedfeorius.mall.mapper;

import com.zedfeorius.mall.entity.ProductImage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ZedFeorius
 * @version 1.0.0
 * @date 09 29 2022  11:42:09
 * @packageName com.zedfeorius.mall.mapper
 * @className ProductImageImageMapper
 * @describe TODO
 */
@Repository
@Mapper
public interface ProductImageMapper {
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
    Integer insertProductImage(ProductImage productImage);

    /**
     * 更新
     * @param productImage
     * @return
     */
    Integer updateProductImage(ProductImage productImage);

    /**
     * 删除
     * @param productImageId
     * @return
     */
    Integer deleteProductImage(@Param("productImageId") Integer productImageId);
}
