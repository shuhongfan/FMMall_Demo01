package com.qfedu.api.service.feign;

import com.qfedu.api.service.feign.fallback.OrderitemAddClientFallback;
import com.qfedu.fmmall.beans.ShoppingCartVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "orderitem-add",fallback = OrderitemAddClientFallback.class)
public interface OrderitemAddClient {

    @PostMapping("/item/save")
    public int addOrderItem(List<ShoppingCartVO> list, @RequestParam("orderId") String orderId);

}
