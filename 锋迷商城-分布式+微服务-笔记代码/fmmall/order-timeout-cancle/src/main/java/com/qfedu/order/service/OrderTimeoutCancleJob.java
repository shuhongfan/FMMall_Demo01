package com.qfedu.order.service;

import com.github.wxpay.sdk.WXPay;
import com.qfedu.fmmall.beans.Orders;
import com.qfedu.order.config.MyPayConfig;
import com.qfedu.order.feign.OrderCloseClient;
import com.qfedu.order.feign.OrderStatusUpdateClient;
import com.qfedu.order.feign.OrderTimeoutQueryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class OrderTimeoutCancleJob {

    @Autowired
    private OrderTimeoutQueryClient orderTimeoutQueryClient;
    private WXPay wxPay = new WXPay(new MyPayConfig());
    @Autowired
    private OrderStatusUpdateClient orderStatusUpdateClient;
    @Autowired
    private OrderCloseClient orderCloseClient;
    private static int count = 0;

    //https://cron.qqe2.com
    //@Scheduled(cron = "0/60 * * * * ?")
    public void checkAndCancleOrder(){
        count++;
        System.out.println("定时任务-------------------"+count);
        try {
            //1.调用 order-timeout-query 查询超过30min订单状态依然为待支付状态的订单
            List<Orders> orders = orderTimeoutQueryClient.query();

            //2.访问微信平台接口，确认当前订单最终的支付状态
            for (int i = 0; i < orders.size(); i++) {
                Orders order = orders.get(i);
                HashMap<String, String> params = new HashMap<>();
                params.put("out_trade_no", order.getOrderId());
                Map<String, String> resp = wxPay.orderQuery(params);

                if("SUCCESS".equalsIgnoreCase(resp.get("trade_state"))){
                    //2.1 如果订单已经支付，则修改订单状态为"代发货/已支付"  status = 2
                    Orders updateOrder = new Orders();
                    updateOrder.setOrderId(order.getOrderId());
                    updateOrder.setStatus("2");
                    //调用 order-status-update 服务，修改订单状态为2
                    int j = orderStatusUpdateClient.update(updateOrder);
                }else if("NOTPAY".equalsIgnoreCase(resp.get("trade_state"))){
                    //2.2 如果确实未支付 则取消订单：
                    //  a.向微信支付平台发送请求，关闭当前订单的支付链接
                    //Map<String, String> map = wxPay.closeOrder(params);
                    // b.关闭订单
                    int k = orderCloseClient.close(order.getOrderId(),1);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
