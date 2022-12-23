package com.qfedu.stock.dao;

import com.qfedu.fmmall.entity.ProductSku;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

@Repository
public interface ProductSkuMapper extends Mapper<ProductSku>, MySqlMapper<ProductSku> {
}
