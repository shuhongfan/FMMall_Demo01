package com.qfedu.fmmall.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "product_comments")
public class ProductComments {

    @Id
    @Column(name = "comm_id")
    private String commId;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "order_item_id")
    private String orderItemId;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "is_anonymous")
    private Integer isAnonymous;

    @Column(name = "comm_type")
    private Integer commType;

    @Column(name = "comm_level")
    private Integer commLevel;

    @Column(name = "comm_content")
    private String commContent;

    @Column(name = "comm_imgs")
    private String commImgs;

    @Column(name = "sepc_name")
    private Date sepcName;

    @Column(name = "reply_status")
    private Integer replyStatus;

    @Column(name = "reply_content")
    private String replyContent;

    @Column(name = "reply_time")
    private Date replyTime;

    @Column(name = "is_show")
    private Integer isShow;

    /**
     * 获取ID
     *
     * @return comm_id - ID
     */
    public String getCommId() {
        return commId;
    }

    /**
     * 设置ID
     *
     * @param commId ID
     */
    public void setCommId(String commId) {
        this.commId = commId;
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
     * 获取订单项(商品快照)ID 可为空
     *
     * @return order_item_id - 订单项(商品快照)ID 可为空
     */
    public String getOrderItemId() {
        return orderItemId;
    }

    /**
     * 设置订单项(商品快照)ID 可为空
     *
     * @param orderItemId 订单项(商品快照)ID 可为空
     */
    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    /**
     * 获取评论用户id 用户名须脱敏
     *
     * @return user_id - 评论用户id 用户名须脱敏
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置评论用户id 用户名须脱敏
     *
     * @param userId 评论用户id 用户名须脱敏
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取是否匿名（1:是，0:否）
     *
     * @return is_anonymous - 是否匿名（1:是，0:否）
     */
    public Integer getIsAnonymous() {
        return isAnonymous;
    }

    /**
     * 设置是否匿名（1:是，0:否）
     *
     * @param isAnonymous 是否匿名（1:是，0:否）
     */
    public void setIsAnonymous(Integer isAnonymous) {
        this.isAnonymous = isAnonymous;
    }

    /**
     * 获取评价类型（1好评，0中评，-1差评）
     *
     * @return comm_type - 评价类型（1好评，0中评，-1差评）
     */
    public Integer getCommType() {
        return commType;
    }

    /**
     * 设置评价类型（1好评，0中评，-1差评）
     *
     * @param commType 评价类型（1好评，0中评，-1差评）
     */
    public void setCommType(Integer commType) {
        this.commType = commType;
    }

    /**
     * 获取评价等级 1：好评 2：中评 3：差评
     *
     * @return comm_level - 评价等级 1：好评 2：中评 3：差评
     */
    public Integer getCommLevel() {
        return commLevel;
    }

    /**
     * 设置评价等级 1：好评 2：中评 3：差评
     *
     * @param commLevel 评价等级 1：好评 2：中评 3：差评
     */
    public void setCommLevel(Integer commLevel) {
        this.commLevel = commLevel;
    }

    /**
     * 获取评价内容
     *
     * @return comm_content - 评价内容
     */
    public String getCommContent() {
        return commContent;
    }

    /**
     * 设置评价内容
     *
     * @param commContent 评价内容
     */
    public void setCommContent(String commContent) {
        this.commContent = commContent;
    }

    /**
     * 获取评价晒图(JSON {img1:url1,img2:url2}  )
     *
     * @return comm_imgs - 评价晒图(JSON {img1:url1,img2:url2}  )
     */
    public String getCommImgs() {
        return commImgs;
    }

    /**
     * 设置评价晒图(JSON {img1:url1,img2:url2}  )
     *
     * @param commImgs 评价晒图(JSON {img1:url1,img2:url2}  )
     */
    public void setCommImgs(String commImgs) {
        this.commImgs = commImgs;
    }

    /**
     * 获取评价时间 可为空
     *
     * @return sepc_name - 评价时间 可为空
     */
    public Date getSepcName() {
        return sepcName;
    }

    /**
     * 设置评价时间 可为空
     *
     * @param sepcName 评价时间 可为空
     */
    public void setSepcName(Date sepcName) {
        this.sepcName = sepcName;
    }

    /**
     * 获取是否回复（0:未回复，1:已回复）
     *
     * @return reply_status - 是否回复（0:未回复，1:已回复）
     */
    public Integer getReplyStatus() {
        return replyStatus;
    }

    /**
     * 设置是否回复（0:未回复，1:已回复）
     *
     * @param replyStatus 是否回复（0:未回复，1:已回复）
     */
    public void setReplyStatus(Integer replyStatus) {
        this.replyStatus = replyStatus;
    }

    /**
     * 获取回复内容
     *
     * @return reply_content - 回复内容
     */
    public String getReplyContent() {
        return replyContent;
    }

    /**
     * 设置回复内容
     *
     * @param replyContent 回复内容
     */
    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    /**
     * 获取回复时间
     *
     * @return reply_time - 回复时间
     */
    public Date getReplyTime() {
        return replyTime;
    }

    /**
     * 设置回复时间
     *
     * @param replyTime 回复时间
     */
    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    /**
     * 获取是否显示（1:是，0:否）
     *
     * @return is_show - 是否显示（1:是，0:否）
     */
    public Integer getIsShow() {
        return isShow;
    }

    /**
     * 设置是否显示（1:是，0:否）
     *
     * @param isShow 是否显示（1:是，0:否）
     */
    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }
}