package com.qfedu.order;

import org.mapstruct.Mapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.qfedu.order.dao")
public class OrderQuerybyidApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderQuerybyidApplication.class, args);
    }

}
