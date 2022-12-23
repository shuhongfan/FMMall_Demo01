package com.qfedu.fmmall.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product4ES {

    private String productId;
    private String productName;
    private String productImg;
    private int soldNum;
    private String productSkuName;
    private double productSkuPrice;

}
