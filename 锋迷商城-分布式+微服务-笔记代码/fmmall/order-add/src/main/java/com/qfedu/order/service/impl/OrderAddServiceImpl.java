package com.qfedu.order.service.impl;

import com.qfedu.fmmall.entity.Orders;
import com.qfedu.fmmall.entity.ShoppingCartVO;
import com.qfedu.order.dao.OrdersMapper;
import com.qfedu.order.service.OrderAddService;
import com.qfedu.order.service.feign.StockQueryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class OrderAddServiceImpl implements OrderAddService {

    @Autowired
    private StockQueryClient stockQueryClient;
    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public List<ShoppingCartVO> save(Orders order, String cids) {
        //1.校验库存
        //a.调用stock-query服务查询当前订单中包含的购物车信息
        List<ShoppingCartVO> list = stockQueryClient.query(cids);
        if(list != null && list.size() > 0){
            //b.判断库存
            boolean f = true;
            String untitled = "";
            for (ShoppingCartVO sc : list) {
                if (Integer.parseInt(sc.getCartNum()) > sc.getSkuStock()) {
                    f = false;
                    break;
                }
                untitled = untitled + sc.getProductName() + ",";
            }
            if(f){
                //2.库存充足 保存订单信息
                order.setUntitled(untitled);
                order.setCreateTime(new Date());
                order.setStatus("1");
                //生成订单编号:分布式系统全局ID生成
                //String orderId = UUID.randomUUID().toString().replace("-", "");
                //order.setOrderId(orderId);
                int i = ordersMapper.insert(order);
                if(i>0){
                    return list;
                }
            }
        }
        return null;
    }
}
