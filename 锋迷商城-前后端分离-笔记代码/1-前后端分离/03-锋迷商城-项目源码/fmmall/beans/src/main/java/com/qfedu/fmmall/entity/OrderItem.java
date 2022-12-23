package com.qfedu.fmmall.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "order_item")
public class OrderItem {

    public OrderItem() {
    }

    public OrderItem(String itemId, String orderId, String productId, String productName, String productImg, String skuId, String skuName, BigDecimal productPrice, Integer buyCounts, BigDecimal totalAmount, Date basketDate, Date buyTime, Integer isComment) {
        this.itemId = itemId;
        this.orderId = orderId;
        this.productId = productId;
        this.productName = productName;
        this.productImg = productImg;
        this.skuId = skuId;
        this.skuName = skuName;
        this.productPrice = productPrice;
        this.buyCounts = buyCounts;
        this.totalAmount = totalAmount;
        this.basketDate = basketDate;
        this.buyTime = buyTime;
        this.isComment = isComment;
    }

    /**
     * 订单项ID
     */
    @Id
    @Column(name = "item_id")
    private String itemId;

    /**
     * 订单ID
     */
    @Column(name = "order_id")
    private String orderId;

    /**
     * 商品ID
     */
    @Column(name = "product_id")
    private String productId;

    /**
     * 商品名称
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 商品图片
     */
    @Column(name = "product_img")
    private String productImg;

    /**
     * skuID
     */
    @Column(name = "sku_id")
    private String skuId;

    /**
     * sku名称
     */
    @Column(name = "sku_name")
    private String skuName;

    /**
     * 商品价格
     */
    @Column(name = "product_price")
    private BigDecimal productPrice;

    /**
     * 购买数量
     */
    @Column(name = "buy_counts")
    private Integer buyCounts;

    /**
     * 商品总金额
     */
    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    /**
     * 加入购物车时间
     */
    @Column(name = "basket_date")
    private Date basketDate;

    /**
     * 购买时间
     */
    @Column(name = "buy_time")
    private Date buyTime;

    /**
     * 评论状态： 0 未评价  1 已评价
     */
    @Column(name = "is_comment")
    private Integer isComment;

    /**
     * 获取订单项ID
     *
     * @return item_id - 订单项ID
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * 设置订单项ID
     *
     * @param itemId 订单项ID
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * 获取订单ID
     *
     * @return order_id - 订单ID
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置订单ID
     *
     * @param orderId 订单ID
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
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
     * 获取商品名称
     *
     * @return product_name - 商品名称
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置商品名称
     *
     * @param productName 商品名称
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * 获取商品图片
     *
     * @return product_img - 商品图片
     */
    public String getProductImg() {
        return productImg;
    }

    /**
     * 设置商品图片
     *
     * @param productImg 商品图片
     */
    public void setProductImg(String productImg) {
        this.productImg = productImg;
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
     * 获取商品价格
     *
     * @return product_price - 商品价格
     */
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    /**
     * 设置商品价格
     *
     * @param productPrice 商品价格
     */
    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * 获取购买数量
     *
     * @return buy_counts - 购买数量
     */
    public Integer getBuyCounts() {
        return buyCounts;
    }

    /**
     * 设置购买数量
     *
     * @param buyCounts 购买数量
     */
    public void setBuyCounts(Integer buyCounts) {
        this.buyCounts = buyCounts;
    }

    /**
     * 获取商品总金额
     *
     * @return total_amount - 商品总金额
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * 设置商品总金额
     *
     * @param totalAmount 商品总金额
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 获取加入购物车时间
     *
     * @return basket_date - 加入购物车时间
     */
    public Date getBasketDate() {
        return basketDate;
    }

    /**
     * 设置加入购物车时间
     *
     * @param basketDate 加入购物车时间
     */
    public void setBasketDate(Date basketDate) {
        this.basketDate = basketDate;
    }

    /**
     * 获取购买时间
     *
     * @return buy_time - 购买时间
     */
    public Date getBuyTime() {
        return buyTime;
    }

    /**
     * 设置购买时间
     *
     * @param buyTime 购买时间
     */
    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    /**
     * 获取评论状态： 0 未评价  1 已评价
     *
     * @return is_comment - 评论状态： 0 未评价  1 已评价
     */
    public Integer getIsComment() {
        return isComment;
    }

    /**
     * 设置评论状态： 0 未评价  1 已评价
     *
     * @param isComment 评论状态： 0 未评价  1 已评价
     */
    public void setIsComment(Integer isComment) {
        this.isComment = isComment;
    }
}