package com.qfedu.api.controller;

import com.github.wxpay.sdk.WXPay;
import com.qfedu.api.config.MyPayConfig;
import com.qfedu.api.service.OrderSubmitService;
import com.qfedu.api.service.impl.SendMsgToMQService;
import com.qfedu.fmmall.beans.Orders;
import com.qfedu.fmmall.vo.ResStatus;
import com.qfedu.fmmall.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/order")
public class OrderSubmitController {

    @Autowired
    private OrderSubmitService orderSubmitService;
    @Autowired
    private SendMsgToMQService sendMsgToMQService;

    @PostMapping("/add")
    public ResultVO add(String cids, @RequestBody Orders order){
        ResultVO resultVO = null;
        try {
            Map<String, String> orderInfo = orderSubmitService.addOrder(cids, order);

            if(orderInfo!=null){
                String orderId = orderInfo.get("orderId");
                //设置当前订单信息
                HashMap<String,String> data = new HashMap<>();
                data.put("body",orderInfo.get("productNames"));  //商品描述
                data.put("out_trade_no",orderId);               //使用当前用户订单的编号作为当前支付交易的交易号
                data.put("fee_type","CNY");                     //支付币种
                //data.put("total_fee",order.getActualAmount()*100+"");          //支付金额
                data.put("total_fee","1");
                data.put("trade_type","NATIVE");                //交易类型
                //data.put("notify_url","http://47.118.45.73:8080/pay/callback");           //设置支付完成时的回调方法接口
                //data.put("notify_url","http://localhost:8080/pay/callback");           //设置支付完成时的回调方法接口
                data.put("notify_url","http://ytao.free.idcfengye.com/pay/callback");           //设置支付完成时的回调方法接口

                //发送请求，获取响应
                //微信支付：申请支付连接
                WXPay wxPay = new WXPay(new MyPayConfig());
                Map<String, String> resp = wxPay.unifiedOrder(data);
                orderInfo.put("payUrl",resp.get("code_url"));
                //orderInfo中包含：订单编号，购买的商品名称，支付链接
                resultVO = new ResultVO(ResStatus.OK,"提交订单成功！",orderInfo);

                //当订单保存成功之后将订单编号写入到 死信队列 q1(ex6---key1)
                sendMsgToMQService.sendMsg(orderId);
            }else{
                resultVO = new ResultVO(ResStatus.NO,"提交订单失败！",null);
            }
        } catch (SQLException e) {
            resultVO = new ResultVO(ResStatus.NO,"提交订单失败！",null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultVO;
    }



}
