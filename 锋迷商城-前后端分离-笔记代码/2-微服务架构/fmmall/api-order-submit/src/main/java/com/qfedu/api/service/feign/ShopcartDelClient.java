package com.qfedu.api.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("shopcart-del")
public interface ShopcartDelClient {

    @DeleteMapping("/shopcart/del")
    public int delete(@RequestParam("cids") String cids);

}
