package com.zhy.subject.application.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 题目标签表(SubjectLabel)实体类
 *
 * @author makejava
 * @since 2024-01-16 10:04:27
 */
@Data
public class SubjectLabelDTO implements Serializable {

    /**
    * 主键
    */
    private Long id;
    /**
    * 标签分类
    */
    private String labelName;
    /**
    * 排序
    */
    private Integer sortNum;
    
    private Long categoryId;
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
     * 是否删除
     */
    private Integer isDeleted;

}