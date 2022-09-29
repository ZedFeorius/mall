package com.zedfeorius.mall.service.impl;

import com.zedfeorius.mall.entity.Product;
import com.zedfeorius.mall.mapper.ProductMapper;
import com.zedfeorius.mall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZedFeorius
 * @version 1.0.0
 * @date 09 29 2022  11:19:21
 * @packageName com.zedfeorius.mall.service.impl
 * @className ProductServiceImpl
 * @describe TODO
 */
@Service("ProductService")
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Override
    public List<Product> getProductList() {
        return productMapper.getProductList();
    }

    @Override
    public Product getProductById(Integer productId) {
        return productMapper.getProductById(productId);
    }

    @Override
    public Boolean insertProduct(Product product) {
        return productMapper.insertProduct(product) > 0;
    }

    @Override
    public Boolean updateProduct(Product product) {
        return productMapper.updateProduct(product) > 0;
    }

    @Override
    public Boolean deleteProduct(Integer productId) {
        return productMapper.deleteProduct(productId) > 0;
    }
}
