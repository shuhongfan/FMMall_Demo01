package com.qfedu.api.service;

import com.qfedu.fmmall.beans.Orders;

import java.util.Map;

public interface OrderSubmitService {

    public Map<String, String> addOrder(String cids, Orders order);
}
