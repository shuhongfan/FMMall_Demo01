package com.qfedu.fmmall.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {

    private String itemId;
    private String orderId;
    private String productId;
    private String productName;
    private String productImg;
    private String skuId;
    private String skuName;
    private BigDecimal productPrice;
    private Integer buyCounts;
    private BigDecimal totalAmount;
    private Date basketDate;
    private Date buyTime;
    private Integer isComment;
}