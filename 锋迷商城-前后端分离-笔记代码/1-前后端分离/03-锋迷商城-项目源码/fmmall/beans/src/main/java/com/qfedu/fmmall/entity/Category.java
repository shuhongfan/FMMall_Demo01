package com.qfedu.fmmall.entity;

import javax.persistence.*;

public class Category {
    /**
     * 主键 分类id主键
     */
    @Id
    @Column(name = "category_id")
    private Integer categoryId;

    /**
     * 分类名称 分类名称
     */
    @Column(name = "category_name")
    private String categoryName;

    /**
     * 分类层级 分类得类型，
1:一级大分类
2:二级分类
3:三级小分类
     */
    @Column(name = "category_level")
    private Integer categoryLevel;

    /**
     * 父层级id 父id 上一级依赖的id，1级分类则为0，二级三级分别依赖上一级
     */
    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * 图标 logo
     */
    @Column(name = "category_icon")
    private String categoryIcon;

    /**
     * 口号
     */
    @Column(name = "category_slogan")
    private String categorySlogan;

    /**
     * 分类图
     */
    @Column(name = "category_pic")
    private String categoryPic;

    /**
     * 背景颜色
     */
    @Column(name = "category_bg_color")
    private String categoryBgColor;

    /**
     * 获取主键 分类id主键
     *
     * @return category_id - 主键 分类id主键
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * 设置主键 分类id主键
     *
     * @param categoryId 主键 分类id主键
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取分类名称 分类名称
     *
     * @return category_name - 分类名称 分类名称
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 设置分类名称 分类名称
     *
     * @param categoryName 分类名称 分类名称
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * 获取分类层级 分类得类型，
1:一级大分类
2:二级分类
3:三级小分类
     *
     * @return category_level - 分类层级 分类得类型，
1:一级大分类
2:二级分类
3:三级小分类
     */
    public Integer getCategoryLevel() {
        return categoryLevel;
    }

    /**
     * 设置分类层级 分类得类型，
1:一级大分类
2:二级分类
3:三级小分类
     *
     * @param categoryLevel 分类层级 分类得类型，
1:一级大分类
2:二级分类
3:三级小分类
     */
    public void setCategoryLevel(Integer categoryLevel) {
        this.categoryLevel = categoryLevel;
    }

    /**
     * 获取父层级id 父id 上一级依赖的id，1级分类则为0，二级三级分别依赖上一级
     *
     * @return parent_id - 父层级id 父id 上一级依赖的id，1级分类则为0，二级三级分别依赖上一级
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置父层级id 父id 上一级依赖的id，1级分类则为0，二级三级分别依赖上一级
     *
     * @param parentId 父层级id 父id 上一级依赖的id，1级分类则为0，二级三级分别依赖上一级
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取图标 logo
     *
     * @return category_icon - 图标 logo
     */
    public String getCategoryIcon() {
        return categoryIcon;
    }

    /**
     * 设置图标 logo
     *
     * @param categoryIcon 图标 logo
     */
    public void setCategoryIcon(String categoryIcon) {
        this.categoryIcon = categoryIcon;
    }

    /**
     * 获取口号
     *
     * @return category_slogan - 口号
     */
    public String getCategorySlogan() {
        return categorySlogan;
    }

    /**
     * 设置口号
     *
     * @param categorySlogan 口号
     */
    public void setCategorySlogan(String categorySlogan) {
        this.categorySlogan = categorySlogan;
    }

    /**
     * 获取分类图
     *
     * @return category_pic - 分类图
     */
    public String getCategoryPic() {
        return categoryPic;
    }

    /**
     * 设置分类图
     *
     * @param categoryPic 分类图
     */
    public void setCategoryPic(String categoryPic) {
        this.categoryPic = categoryPic;
    }

    /**
     * 获取背景颜色
     *
     * @return category_bg_color - 背景颜色
     */
    public String getCategoryBgColor() {
        return categoryBgColor;
    }

    /**
     * 设置背景颜色
     *
     * @param categoryBgColor 背景颜色
     */
    public void setCategoryBgColor(String categoryBgColor) {
        this.categoryBgColor = categoryBgColor;
    }
}