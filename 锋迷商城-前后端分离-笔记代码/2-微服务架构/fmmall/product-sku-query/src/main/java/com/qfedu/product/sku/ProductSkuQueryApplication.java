package com.qfedu.product.sku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.qfedu.product.sku.dao")
public class ProductSkuQueryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductSkuQueryApplication.class, args);
    }

}
