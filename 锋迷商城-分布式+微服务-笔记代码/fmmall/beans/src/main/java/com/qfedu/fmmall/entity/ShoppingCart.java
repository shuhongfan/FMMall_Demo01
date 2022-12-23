package com.qfedu.fmmall.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "shopping_cart")
public class ShoppingCart {
    /**
     * 主键
     */
    @Id
    @Column(name = "cart_id")
    private Integer cartId;

    /**
     * 商品ID
     */
    @Column(name = "product_id")
    private String productId;

    /**
     * skuID
     */
    @Column(name = "sku_id")
    private String skuId;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 购物车商品数量
     */
    @Column(name = "cart_num")
    private String cartNum;

    /**
     * 添加购物车时间
     */
    @Column(name = "cart_time")
    private String cartTime;

    /**
     * 添加购物车时商品价格
     */
    @Column(name = "product_price")
    private BigDecimal productPrice;

    /**
     * 选择的套餐的属性
     */
    @Column(name = "sku_props")
    private String skuProps;

    /**
     * 获取主键
     *
     * @return cart_id - 主键
     */
    public Integer getCartId() {
        return cartId;
    }

    /**
     * 设置主键
     *
     * @param cartId 主键
     */
    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    /**
     * 获取商品ID
     *
     * @return product_id - 商品ID
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置商品ID
     *
     * @param productId 商品ID
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * 获取skuID
     *
     * @return sku_id - skuID
     */
    public String getSkuId() {
        return skuId;
    }

    /**
     * 设置skuID
     *
     * @param skuId skuID
     */
    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取购物车商品数量
     *
     * @return cart_num - 购物车商品数量
     */
    public String getCartNum() {
        return cartNum;
    }

    /**
     * 设置购物车商品数量
     *
     * @param cartNum 购物车商品数量
     */
    public void setCartNum(String cartNum) {
        this.cartNum = cartNum;
    }

    /**
     * 获取添加购物车时间
     *
     * @return cart_time - 添加购物车时间
     */
    public String getCartTime() {
        return cartTime;
    }

    /**
     * 设置添加购物车时间
     *
     * @param cartTime 添加购物车时间
     */
    public void setCartTime(String cartTime) {
        this.cartTime = cartTime;
    }

    /**
     * 获取添加购物车时商品价格
     *
     * @return product_price - 添加购物车时商品价格
     */
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    /**
     * 设置添加购物车时商品价格
     *
     * @param productPrice 添加购物车时商品价格
     */
    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * 获取选择的套餐的属性
     *
     * @return sku_props - 选择的套餐的属性
     */
    public String getSkuProps() {
        return skuProps;
    }

    /**
     * 设置选择的套餐的属性
     *
     * @param skuProps 选择的套餐的属性
     */
    public void setSkuProps(String skuProps) {
        this.skuProps = skuProps;
    }
}