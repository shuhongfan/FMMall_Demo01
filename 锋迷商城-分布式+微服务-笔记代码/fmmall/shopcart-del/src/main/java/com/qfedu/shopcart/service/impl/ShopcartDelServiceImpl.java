package com.qfedu.shopcart.service.impl;

import com.qfedu.shopcart.dao.ShoppingCartMapper;
import com.qfedu.shopcart.service.ShopcartDelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopcartDelServiceImpl implements ShopcartDelService {

    @Autowired
    private ShoppingCartMapper shoppingCartMapper;

    @Override
    public int deleteShopcart(String cids) {
        int k = 1;
        String[] arr = cids.split(",");
        for (int i = 0; i < arr.length; i++) {
            int cid = Integer.parseInt(arr[i]);
            int j = shoppingCartMapper.deleteByPrimaryKey(cid);
            k *=j;
        }
        return k;
    }
}
