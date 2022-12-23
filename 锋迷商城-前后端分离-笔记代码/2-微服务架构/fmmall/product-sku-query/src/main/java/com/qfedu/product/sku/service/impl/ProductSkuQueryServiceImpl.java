package com.qfedu.product.sku.service.impl;

import com.qfedu.fmmall.entity.ProductSku;
import com.qfedu.product.sku.dao.ProductSkuMapper;
import com.qfedu.product.sku.service.ProductSkuQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductSkuQueryServiceImpl implements ProductSkuQueryService {

    @Autowired
    private ProductSkuMapper productSkuMapper;

    @Override
    public ProductSku queryProductSku(String skuId) {
        return productSkuMapper.selectByPrimaryKey(skuId);
    }
}
