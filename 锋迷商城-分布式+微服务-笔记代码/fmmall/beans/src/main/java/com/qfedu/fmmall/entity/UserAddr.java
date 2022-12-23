package com.qfedu.fmmall.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_addr")
public class UserAddr {
    /**
     * 地址主键id
     */
    @Id
    @Column(name = "addr_id")
    private String addrId;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 收件人姓名
     */
    @Column(name = "receiver_name")
    private String receiverName;

    /**
     * 收件人手机号
     */
    @Column(name = "receiver_mobile")
    private String receiverMobile;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 区县
     */
    private String area;

    /**
     * 详细地址
     */
    private String addr;

    /**
     * 邮编
     */
    @Column(name = "post_code")
    private String postCode;

    /**
     * 状态,1正常，0无效
     */
    private Integer status;

    /**
     * 是否默认地址 1是 1:是  0:否
     */
    @Column(name = "common_addr")
    private Integer commonAddr;

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
     * 获取地址主键id
     *
     * @return addr_id - 地址主键id
     */
    public String getAddrId() {
        return addrId;
    }

    /**
     * 设置地址主键id
     *
     * @param addrId 地址主键id
     */
    public void setAddrId(String addrId) {
        this.addrId = addrId;
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
     * 获取收件人姓名
     *
     * @return receiver_name - 收件人姓名
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * 设置收件人姓名
     *
     * @param receiverName 收件人姓名
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    /**
     * 获取收件人手机号
     *
     * @return receiver_mobile - 收件人手机号
     */
    public String getReceiverMobile() {
        return receiverMobile;
    }

    /**
     * 设置收件人手机号
     *
     * @param receiverMobile 收件人手机号
     */
    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    /**
     * 获取省份
     *
     * @return province - 省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省份
     *
     * @param province 省份
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取城市
     *
     * @return city - 城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置城市
     *
     * @param city 城市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取区县
     *
     * @return area - 区县
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置区县
     *
     * @param area 区县
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * 获取详细地址
     *
     * @return addr - 详细地址
     */
    public String getAddr() {
        return addr;
    }

    /**
     * 设置详细地址
     *
     * @param addr 详细地址
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }

    /**
     * 获取邮编
     *
     * @return post_code - 邮编
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * 设置邮编
     *
     * @param postCode 邮编
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    /**
     * 获取状态,1正常，0无效
     *
     * @return status - 状态,1正常，0无效
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态,1正常，0无效
     *
     * @param status 状态,1正常，0无效
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取是否默认地址 1是 1:是  0:否
     *
     * @return common_addr - 是否默认地址 1是 1:是  0:否
     */
    public Integer getCommonAddr() {
        return commonAddr;
    }

    /**
     * 设置是否默认地址 1是 1:是  0:否
     *
     * @param commonAddr 是否默认地址 1是 1:是  0:否
     */
    public void setCommonAddr(Integer commonAddr) {
        this.commonAddr = commonAddr;
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
}