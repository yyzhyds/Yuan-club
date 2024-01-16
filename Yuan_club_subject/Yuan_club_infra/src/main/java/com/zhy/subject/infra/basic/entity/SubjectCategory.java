package com.zhy.subject.infra.basic.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * 题目分类(SubjectCategory)实体类
 *
 * @author makejava
 * @since 2024-01-14 17:04:13
 */
@Data
public class SubjectCategory implements Serializable {
    private static final long serialVersionUID = -88091571387588395L;

    /**
    * 主键
    */
    private Long id;

    /**
    * 分类名称
    */
    private String categoryName;

    /**
    * 分类类型
    */
    private Object categoryType;

    /**
    * 图标连接
    */
    private String imageUrl;

    /**
    * 父级id
    */
    private Long parentId;

    /**
    * 创建人
    */
    private String createdBy;

    /**
    * 创建时间
    */
    private Date createdTime;

    /**
    * 更新人
    */
    private String updateBy;

    /**
    * 更新时间
    */
    private Date updateTime;

    /**
    * 是否删除 0: 未删除 1: 已删除
    */
    private Object isDeleted;

}