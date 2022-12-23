package com.qfedu.fmmall.service;

import com.qfedu.fmmall.entity.Orders;
import com.qfedu.fmmall.vo.ResultVO;

import java.sql.SQLException;
import java.util.Map;

public interface OrderService {

    public Map<String,String> addOrder(String cids, Orders order) throws SQLException;

    public int updateOrderStatus(String orderId, String status);

    public ResultVO getOrderById(String orderId);

    public void closeOrder(String orderId);

    public ResultVO listOrders(String userId,String status,int pageNum, int limit);

}
