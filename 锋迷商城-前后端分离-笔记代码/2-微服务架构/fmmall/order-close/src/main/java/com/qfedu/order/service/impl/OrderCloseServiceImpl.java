package com.qfedu.order.service.impl;

import com.qfedu.fmmall.beans.OrderItem;
import com.qfedu.fmmall.beans.Orders;
import com.qfedu.fmmall.beans.ProductSku;
import com.qfedu.order.service.OrderCloseService;
import com.qfedu.order.service.feign.OrderItemQueryClient;
import com.qfedu.order.service.feign.OrderStatusUpdateClient;
import com.qfedu.order.service.feign.ProductSkuQueryClient;
import com.qfedu.order.service.feign.StockUpdateClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderCloseServiceImpl implements OrderCloseService {

    @Autowired
    private OrderStatusUpdateClient orderStatusUpdateClient;
    @Autowired
    private OrderItemQueryClient orderItemQueryClient;
    @Autowired
    private ProductSkuQueryClient productSkuQueryClient;
    @Autowired
    private StockUpdateClient stockUpdateClient;

    @Override
    public int closeOrder(String orderId,int closeType) {
        //1. 调用 order-status-update 服务 修改订单状态为6
        Orders order = new Orders();
        order.setOrderId(orderId);
        order.setStatus("6");
        order.setCloseType(closeType);
        int i = orderStatusUpdateClient.update(order);

        if(i > 0){
            //2. 调用 orderitem-query 服务 查询当前订单包含的商品信息（订单快照）
            List<OrderItem> orderItems = orderItemQueryClient.query(orderId);

            //3. 还原库存：调用 stock-update服务 修改商品库存
            if(orderItems != null && orderItems.size()>0){
                List<ProductSku> skus = new ArrayList<>();
                for (OrderItem item: orderItems) {
                    String skuId = item.getSkuId();
                    //调用 product-sku-query 服务根据skuId查询当前商品的套餐信息（套餐信息中包含库存）
                    ProductSku sku = productSkuQueryClient.query(skuId);
                    int newStock = sku.getStock()+item.getBuyCounts();
                    sku.setStock(newStock);
                    skus.add(sku);
                }
                // 调用stock-update服务进行库存修改
                int j = stockUpdateClient.update(skus);
                return j;
            }
        }
        return 0;
    }
}
