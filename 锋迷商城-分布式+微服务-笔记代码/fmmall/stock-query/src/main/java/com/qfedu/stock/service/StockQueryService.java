package com.qfedu.stock.service;

import com.qfedu.fmmall.entity.ShoppingCartVO;

import java.util.List;

public interface StockQueryService {

    public List<ShoppingCartVO> selectShopcartByCids(String cids);

}
