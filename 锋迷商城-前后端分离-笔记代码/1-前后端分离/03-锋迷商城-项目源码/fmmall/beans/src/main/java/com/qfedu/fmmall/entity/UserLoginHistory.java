package com.qfedu.fmmall.entity;

import javax.persistence.*;

@Table(name = "user_login_history")
public class UserLoginHistory {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    private Integer id;

    /**
     * 地区
     */
    @Column(name = "AREA")
    private String area;

    /**
     * 国家
     */
    @Column(name = "COUNTRY")
    private String country;

    /**
     * 用户id
     */
    @Column(name = "USER_ID")
    private String userId;

    /**
     * IP
     */
    @Column(name = "IP")
    private String ip;

    /**
     * 时间
     */
    @Column(name = "LOGIN_TIME")
    private String loginTime;

    /**
     * 获取ID
     *
     * @return ID - ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取地区
     *
     * @return AREA - 地区
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置地区
     *
     * @param area 地区
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * 获取国家
     *
     * @return COUNTRY - 国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国家
     *
     * @param country 国家
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 获取用户id
     *
     * @return USER_ID - 用户id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取IP
     *
     * @return IP - IP
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置IP
     *
     * @param ip IP
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 获取时间
     *
     * @return LOGIN_TIME - 时间
     */
    public String getLoginTime() {
        return loginTime;
    }

    /**
     * 设置时间
     *
     * @param loginTime 时间
     */
    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }
}