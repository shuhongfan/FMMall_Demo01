package com.qfedu.fmmall.entity;

import java.util.Date;
import javax.persistence.*;

public class Users {
    /**
     * 主键id 用户id
     */
    @Id
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 用户名 用户名
     */
    private String username;

    /**
     * 密码 密码
     */
    private String password;

    /**
     * 昵称 昵称
     */
    private String nickname;

    /**
     * 真实姓名 真实姓名
     */
    private String realname;

    /**
     * 头像 头像
     */
    @Column(name = "user_img")
    private String userImg;

    /**
     * 手机号 手机号
     */
    @Column(name = "user_mobile")
    private String userMobile;

    /**
     * 邮箱地址 邮箱地址
     */
    @Column(name = "user_email")
    private String userEmail;

    /**
     * 性别 M(男) or F(女)
     */
    @Column(name = "user_sex")
    private String userSex;

    /**
     * 生日 生日
     */
    @Column(name = "user_birth")
    private Date userBirth;

    /**
     * 注册时间 创建时间
     */
    @Column(name = "user_regtime")
    private Date userRegtime;

    /**
     * 更新时间 更新时间
     */
    @Column(name = "user_modtime")
    private Date userModtime;

    /**
     * 获取主键id 用户id
     *
     * @return user_id - 主键id 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置主键id 用户id
     *
     * @param userId 主键id 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取用户名 用户名
     *
     * @return username - 用户名 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名 用户名
     *
     * @param username 用户名 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码 密码
     *
     * @return password - 密码 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码 密码
     *
     * @param password 密码 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取昵称 昵称
     *
     * @return nickname - 昵称 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置昵称 昵称
     *
     * @param nickname 昵称 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取真实姓名 真实姓名
     *
     * @return realname - 真实姓名 真实姓名
     */
    public String getRealname() {
        return realname;
    }

    /**
     * 设置真实姓名 真实姓名
     *
     * @param realname 真实姓名 真实姓名
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * 获取头像 头像
     *
     * @return user_img - 头像 头像
     */
    public String getUserImg() {
        return userImg;
    }

    /**
     * 设置头像 头像
     *
     * @param userImg 头像 头像
     */
    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    /**
     * 获取手机号 手机号
     *
     * @return user_mobile - 手机号 手机号
     */
    public String getUserMobile() {
        return userMobile;
    }

    /**
     * 设置手机号 手机号
     *
     * @param userMobile 手机号 手机号
     */
    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    /**
     * 获取邮箱地址 邮箱地址
     *
     * @return user_email - 邮箱地址 邮箱地址
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * 设置邮箱地址 邮箱地址
     *
     * @param userEmail 邮箱地址 邮箱地址
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * 获取性别 M(男) or F(女)
     *
     * @return user_sex - 性别 M(男) or F(女)
     */
    public String getUserSex() {
        return userSex;
    }

    /**
     * 设置性别 M(男) or F(女)
     *
     * @param userSex 性别 M(男) or F(女)
     */
    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    /**
     * 获取生日 生日
     *
     * @return user_birth - 生日 生日
     */
    public Date getUserBirth() {
        return userBirth;
    }

    /**
     * 设置生日 生日
     *
     * @param userBirth 生日 生日
     */
    public void setUserBirth(Date userBirth) {
        this.userBirth = userBirth;
    }

    /**
     * 获取注册时间 创建时间
     *
     * @return user_regtime - 注册时间 创建时间
     */
    public Date getUserRegtime() {
        return userRegtime;
    }

    /**
     * 设置注册时间 创建时间
     *
     * @param userRegtime 注册时间 创建时间
     */
    public void setUserRegtime(Date userRegtime) {
        this.userRegtime = userRegtime;
    }

    /**
     * 获取更新时间 更新时间
     *
     * @return user_modtime - 更新时间 更新时间
     */
    public Date getUserModtime() {
        return userModtime;
    }

    /**
     * 设置更新时间 更新时间
     *
     * @param userModtime 更新时间 更新时间
     */
    public void setUserModtime(Date userModtime) {
        this.userModtime = userModtime;
    }
}