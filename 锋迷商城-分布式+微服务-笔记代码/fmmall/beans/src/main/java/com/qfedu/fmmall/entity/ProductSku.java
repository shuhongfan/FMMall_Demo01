package com.qfedu.fmmall.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "product_sku")
public class ProductSku {
    /**
     * sku编号
     */
    @Id
    @Column(name = "sku_id")
    private String skuId;

    /**
     * 商品id
     */
    @Column(name = "product_id")
    private String productId;

    /**
     * sku名称
     */
    @Column(name = "sku_name")
    private String skuName;

    /**
     * sku图片
     */
    @Column(name = "sku_img")
    private String skuImg;

    /**
     * 属性组合（格式是p1:v1;p2:v2）
     */
    private String untitled;

    /**
     * 原价
     */
    @Column(name = "original_price")
    private Integer originalPrice;

    /**
     * 销售价格
     */
    @Column(name = "sell_price")
    private Integer sellPrice;

    /**
     * 折扣力度
     */
    private BigDecimal discounts;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * sku状态(1启用，0禁用，-1删除)
     */
    private Integer status;

    /**
     * 获取sku编号
     *
     * @return sku_id - sku编号
     */
    public String getSkuId() {
        return skuId;
    }

    /**
     * 设置sku编号
     *
     * @param skuId sku编号
     */
    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    /**
     * 获取商品id
     *
     * @return product_id - 商品id
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置商品id
     *
     * @param productId 商品id
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * 获取sku名称
     *
     * @return sku_name - sku名称
     */
    public String getSkuName() {
        return skuName;
    }

    /**
     * 设置sku名称
     *
     * @param skuName sku名称
     */
    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    /**
     * 获取sku图片
     *
     * @return sku_img - sku图片
     */
    public String getSkuImg() {
        return skuImg;
    }

    /**
     * 设置sku图片
     *
     * @param skuImg sku图片
     */
    public void setSkuImg(String skuImg) {
        this.skuImg = skuImg;
    }

    /**
     * 获取属性组合（格式是p1:v1;p2:v2）
     *
     * @return untitled - 属性组合（格式是p1:v1;p2:v2）
     */
    public String getUntitled() {
        return untitled;
    }

    /**
     * 设置属性组合（格式是p1:v1;p2:v2）
     *
     * @param untitled 属性组合（格式是p1:v1;p2:v2）
     */
    public void setUntitled(String untitled) {
        this.untitled = untitled;
    }

    /**
     * 获取原价
     *
     * @return original_price - 原价
     */
    public Integer getOriginalPrice() {
        return originalPrice;
    }

    /**
     * 设置原价
     *
     * @param originalPrice 原价
     */
    public void setOriginalPrice(Integer originalPrice) {
        this.originalPrice = originalPrice;
    }

    /**
     * 获取销售价格
     *
     * @return sell_price - 销售价格
     */
    public Integer getSellPrice() {
        return sellPrice;
    }

    /**
     * 设置销售价格
     *
     * @param sellPrice 销售价格
     */
    public void setSellPrice(Integer sellPrice) {
        this.sellPrice = sellPrice;
    }

    /**
     * 获取折扣力度
     *
     * @return discounts - 折扣力度
     */
    public BigDecimal getDiscounts() {
        return discounts;
    }

    /**
     * 设置折扣力度
     *
     * @param discounts 折扣力度
     */
    public void setDiscounts(BigDecimal discounts) {
        this.discounts = discounts;
    }

    /**
     * 获取库存
     *
     * @return stock - 库存
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * 设置库存
     *
     * @param stock 库存
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取sku状态(1启用，0禁用，-1删除)
     *
     * @return status - sku状态(1启用，0禁用，-1删除)
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置sku状态(1启用，0禁用，-1删除)
     *
     * @param status sku状态(1启用，0禁用，-1删除)
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}