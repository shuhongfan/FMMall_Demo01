package com.qfedu.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
//@EnableScheduling
public class OrderTimeoutCancleApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderTimeoutCancleApplication.class, args);
    }

}
