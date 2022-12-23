package com.qfedu.fmmall.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "index_img")
public class IndexImg {
    /**
     * 主键
     */
    @Id
    @Column(name = "img_id")
    private String imgId;

    /**
     * 图片 图片地址
     */
    @Column(name = "img_url")
    private String imgUrl;

    /**
     * 背景色 背景颜色
     */
    @Column(name = "img_bg_color")
    private String imgBgColor;

    /**
     * 商品id 商品id
     */
    @Column(name = "prod_id")
    private String prodId;

    /**
     * 商品分类id 商品分类id
     */
    @Column(name = "category_id")
    private String categoryId;

    /**
     * 轮播图类型 轮播图类型，用于判断，可以根据商品id或者分类进行页面跳转，1：商品 2：分类
     */
    @Column(name = "index_type")
    private Integer indexType;

    /**
     * 轮播图展示顺序 轮播图展示顺序，从小到大
     */
    private Integer seq;

    /**
     * 是否展示:1表示正常显示，0表示下线 是否展示，1：展示    0：不展示
     */
    private Integer status;

    /**
     * 创建时间 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间 更新
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取主键
     *
     * @return img_id - 主键
     */
    public String getImgId() {
        return imgId;
    }

    /**
     * 设置主键
     *
     * @param imgId 主键
     */
    public void setImgId(String imgId) {
        this.imgId = imgId;
    }

    /**
     * 获取图片 图片地址
     *
     * @return img_url - 图片 图片地址
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * 设置图片 图片地址
     *
     * @param imgUrl 图片 图片地址
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /**
     * 获取背景色 背景颜色
     *
     * @return img_bg_color - 背景色 背景颜色
     */
    public String getImgBgColor() {
        return imgBgColor;
    }

    /**
     * 设置背景色 背景颜色
     *
     * @param imgBgColor 背景色 背景颜色
     */
    public void setImgBgColor(String imgBgColor) {
        this.imgBgColor = imgBgColor;
    }

    /**
     * 获取商品id 商品id
     *
     * @return prod_id - 商品id 商品id
     */
    public String getProdId() {
        return prodId;
    }

    /**
     * 设置商品id 商品id
     *
     * @param prodId 商品id 商品id
     */
    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    /**
     * 获取商品分类id 商品分类id
     *
     * @return category_id - 商品分类id 商品分类id
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * 设置商品分类id 商品分类id
     *
     * @param categoryId 商品分类id 商品分类id
     */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取轮播图类型 轮播图类型，用于判断，可以根据商品id或者分类进行页面跳转，1：商品 2：分类
     *
     * @return index_type - 轮播图类型 轮播图类型，用于判断，可以根据商品id或者分类进行页面跳转，1：商品 2：分类
     */
    public Integer getIndexType() {
        return indexType;
    }

    /**
     * 设置轮播图类型 轮播图类型，用于判断，可以根据商品id或者分类进行页面跳转，1：商品 2：分类
     *
     * @param indexType 轮播图类型 轮播图类型，用于判断，可以根据商品id或者分类进行页面跳转，1：商品 2：分类
     */
    public void setIndexType(Integer indexType) {
        this.indexType = indexType;
    }

    /**
     * 获取轮播图展示顺序 轮播图展示顺序，从小到大
     *
     * @return seq - 轮播图展示顺序 轮播图展示顺序，从小到大
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * 设置轮播图展示顺序 轮播图展示顺序，从小到大
     *
     * @param seq 轮播图展示顺序 轮播图展示顺序，从小到大
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * 获取是否展示:1表示正常显示，0表示下线 是否展示，1：展示    0：不展示
     *
     * @return status - 是否展示:1表示正常显示，0表示下线 是否展示，1：展示    0：不展示
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置是否展示:1表示正常显示，0表示下线 是否展示，1：展示    0：不展示
     *
     * @param status 是否展示:1表示正常显示，0表示下线 是否展示，1：展示    0：不展示
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取创建时间 创建时间
     *
     * @return create_time - 创建时间 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间 创建时间
     *
     * @param createTime 创建时间 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间 更新
     *
     * @return update_time - 更新时间 更新
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间 更新
     *
     * @param updateTime 更新时间 更新
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}