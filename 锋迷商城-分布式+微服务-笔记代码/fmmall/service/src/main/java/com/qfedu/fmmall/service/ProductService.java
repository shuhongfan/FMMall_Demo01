package com.qfedu.fmmall.service;

import com.qfedu.fmmall.vo.ResultVO;

public interface ProductService {

    public ResultVO listRecommendProducts();

    public ResultVO getProductBasicInfo(String productId);

    public ResultVO getProductParamsById(String productId);

    public ResultVO getProductsByCategoryId(int categoryId,int pageNum,int limit);

    public ResultVO listBrands(int categoryId);

    public ResultVO searchProduct(String kw,int pageNum,int limit);

    public ResultVO listBrands(String kw);
}

