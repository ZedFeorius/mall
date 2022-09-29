package com.zedfeorius.mall.service.impl;

import com.zedfeorius.mall.entity.ProductImage;
import com.zedfeorius.mall.mapper.ProductImageMapper;
import com.zedfeorius.mall.service.ProductImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZedFeorius
 * @version 1.0.0
 * @date 09 29 2022  11:50:22
 * @packageName com.zedfeorius.mall.service.impl
 * @className ProductImageServiceImpl
 * @describe TODO
 */
@Service("ProductImageService")
public class ProductImageServiceImpl implements ProductImageService {
    @Autowired
    private ProductImageMapper productImageMapper;
    @Override
    public List<ProductImage> getProductImageList() {
        return productImageMapper.getProductImageList();
    }

    @Override
    public ProductImage getProductImageById(Integer productImageId) {
        return productImageMapper.getProductImageById(productImageId);
    }

    @Override
    public Boolean insertProductImage(ProductImage productImage) {
        return productImageMapper.insertProductImage(productImage) > 0;
    }

    @Override
    public Boolean updateProductImage(ProductImage productImage) {
        return productImageMapper.updateProductImage(productImage) > 0;
    }

    @Override
    public Boolean deleteProductImage(Integer productImageId) {
        return productImageMapper.deleteProductImage(productImageId) > 0;
    }
}
