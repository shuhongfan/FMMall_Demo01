package com.qfedu.fmmall.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Orders {
    /**
     * 订单ID 同时也是订单编号
     */
    @Id
    @Column(name = "order_id")
    private String orderId;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 产品名称（多个产品用,隔开）
     */
    private String untitled;

    /**
     * 收货人快照
     */
    @Column(name = "receiver_name")
    private String receiverName;

    /**
     * 收货人手机号快照
     */
    @Column(name = "receiver_mobile")
    private String receiverMobile;

    /**
     * 收货地址快照
     */
    @Column(name = "receiver_address")
    private String receiverAddress;

    /**
     * 订单总价格
     */
    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    /**
     * 实际支付总价格
     */
    @Column(name = "actual_amount")
    private Integer actualAmount;

    /**
     * 支付方式 1:微信 2:支付宝
     */
    @Column(name = "pay_type")
    private Integer payType;

    /**
     * 订单备注
     */
    @Column(name = "order_remark")
    private String orderRemark;

    /**
     * 订单状态 1:待付款 2:待发货 3:待收货 4:待评价 5:已完成 6:已关闭
     */
    private String status;

    /**
     * 配送方式
     */
    @Column(name = "delivery_type")
    private String deliveryType;

    /**
     * 物流单号
     */
    @Column(name = "delivery_flow_id")
    private String deliveryFlowId;

    /**
     * 订单运费 默认可以为零，代表包邮
     */
    @Column(name = "order_freight")
    private BigDecimal orderFreight;

    /**
     * 逻辑删除状态 1: 删除 0:未删除
     */
    @Column(name = "delete_status")
    private Integer deleteStatus;

    /**
     * 创建时间（成交时间）
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 付款时间
     */
    @Column(name = "pay_time")
    private Date payTime;

    /**
     * 发货时间
     */
    @Column(name = "delivery_time")
    private Date deliveryTime;

    /**
     * 完成时间
     */
    @Column(name = "flish_time")
    private Date flishTime;

    /**
     * 取消时间
     */
    @Column(name = "cancel_time")
    private Date cancelTime;

    /**
     * 订单关闭类型1-超时未支付 2-退款关闭 4-买家取消 15-已通过货到付款交易
     */
    @Column(name = "close_type")
    private Integer closeType;

    /**
     * 获取订单ID 同时也是订单编号
     *
     * @return order_id - 订单ID 同时也是订单编号
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置订单ID 同时也是订单编号
     *
     * @param orderId 订单ID 同时也是订单编号
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
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
     * 获取产品名称（多个产品用,隔开）
     *
     * @return untitled - 产品名称（多个产品用,隔开）
     */
    public String getUntitled() {
        return untitled;
    }

    /**
     * 设置产品名称（多个产品用,隔开）
     *
     * @param untitled 产品名称（多个产品用,隔开）
     */
    public void setUntitled(String untitled) {
        this.untitled = untitled;
    }

    /**
     * 获取收货人快照
     *
     * @return receiver_name - 收货人快照
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * 设置收货人快照
     *
     * @param receiverName 收货人快照
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    /**
     * 获取收货人手机号快照
     *
     * @return receiver_mobile - 收货人手机号快照
     */
    public String getReceiverMobile() {
        return receiverMobile;
    }

    /**
     * 设置收货人手机号快照
     *
     * @param receiverMobile 收货人手机号快照
     */
    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    /**
     * 获取收货地址快照
     *
     * @return receiver_address - 收货地址快照
     */
    public String getReceiverAddress() {
        return receiverAddress;
    }

    /**
     * 设置收货地址快照
     *
     * @param receiverAddress 收货地址快照
     */
    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    /**
     * 获取订单总价格
     *
     * @return total_amount - 订单总价格
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * 设置订单总价格
     *
     * @param totalAmount 订单总价格
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 获取实际支付总价格
     *
     * @return actual_amount - 实际支付总价格
     */
    public Integer getActualAmount() {
        return actualAmount;
    }

    /**
     * 设置实际支付总价格
     *
     * @param actualAmount 实际支付总价格
     */
    public void setActualAmount(Integer actualAmount) {
        this.actualAmount = actualAmount;
    }

    /**
     * 获取支付方式 1:微信 2:支付宝
     *
     * @return pay_type - 支付方式 1:微信 2:支付宝
     */
    public Integer getPayType() {
        return payType;
    }

    /**
     * 设置支付方式 1:微信 2:支付宝
     *
     * @param payType 支付方式 1:微信 2:支付宝
     */
    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    /**
     * 获取订单备注
     *
     * @return order_remark - 订单备注
     */
    public String getOrderRemark() {
        return orderRemark;
    }

    /**
     * 设置订单备注
     *
     * @param orderRemark 订单备注
     */
    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark;
    }

    /**
     * 获取订单状态 1:待付款 2:待发货 3:待收货 4:待评价 5:已完成 6:已关闭
     *
     * @return status - 订单状态 1:待付款 2:待发货 3:待收货 4:待评价 5:已完成 6:已关闭
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置订单状态 1:待付款 2:待发货 3:待收货 4:待评价 5:已完成 6:已关闭
     *
     * @param status 订单状态 1:待付款 2:待发货 3:待收货 4:待评价 5:已完成 6:已关闭
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取配送方式
     *
     * @return delivery_type - 配送方式
     */
    public String getDeliveryType() {
        return deliveryType;
    }

    /**
     * 设置配送方式
     *
     * @param deliveryType 配送方式
     */
    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    /**
     * 获取物流单号
     *
     * @return delivery_flow_id - 物流单号
     */
    public String getDeliveryFlowId() {
        return deliveryFlowId;
    }

    /**
     * 设置物流单号
     *
     * @param deliveryFlowId 物流单号
     */
    public void setDeliveryFlowId(String deliveryFlowId) {
        this.deliveryFlowId = deliveryFlowId;
    }

    /**
     * 获取订单运费 默认可以为零，代表包邮
     *
     * @return order_freight - 订单运费 默认可以为零，代表包邮
     */
    public BigDecimal getOrderFreight() {
        return orderFreight;
    }

    /**
     * 设置订单运费 默认可以为零，代表包邮
     *
     * @param orderFreight 订单运费 默认可以为零，代表包邮
     */
    public void setOrderFreight(BigDecimal orderFreight) {
        this.orderFreight = orderFreight;
    }

    /**
     * 获取逻辑删除状态 1: 删除 0:未删除
     *
     * @return delete_status - 逻辑删除状态 1: 删除 0:未删除
     */
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * 设置逻辑删除状态 1: 删除 0:未删除
     *
     * @param deleteStatus 逻辑删除状态 1: 删除 0:未删除
     */
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    /**
     * 获取创建时间（成交时间）
     *
     * @return create_time - 创建时间（成交时间）
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间（成交时间）
     *
     * @param createTime 创建时间（成交时间）
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
     * 获取付款时间
     *
     * @return pay_time - 付款时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置付款时间
     *
     * @param payTime 付款时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 获取发货时间
     *
     * @return delivery_time - 发货时间
     */
    public Date getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * 设置发货时间
     *
     * @param deliveryTime 发货时间
     */
    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    /**
     * 获取完成时间
     *
     * @return flish_time - 完成时间
     */
    public Date getFlishTime() {
        return flishTime;
    }

    /**
     * 设置完成时间
     *
     * @param flishTime 完成时间
     */
    public void setFlishTime(Date flishTime) {
        this.flishTime = flishTime;
    }

    /**
     * 获取取消时间
     *
     * @return cancel_time - 取消时间
     */
    public Date getCancelTime() {
        return cancelTime;
    }

    /**
     * 设置取消时间
     *
     * @param cancelTime 取消时间
     */
    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    /**
     * 获取订单关闭类型1-超时未支付 2-退款关闭 4-买家取消 15-已通过货到付款交易
     *
     * @return close_type - 订单关闭类型1-超时未支付 2-退款关闭 4-买家取消 15-已通过货到付款交易
     */
    public Integer getCloseType() {
        return closeType;
    }

    /**
     * 设置订单关闭类型1-超时未支付 2-退款关闭 4-买家取消 15-已通过货到付款交易
     *
     * @param closeType 订单关闭类型1-超时未支付 2-退款关闭 4-买家取消 15-已通过货到付款交易
     */
    public void setCloseType(Integer closeType) {
        this.closeType = closeType;
    }
}