package com.qfedu.stock.service;

import com.qfedu.fmmall.entity.ProductSku;

import java.util.List;

public interface StockUpdateService {

    public int updateStock(List<ProductSku> skus);

}
