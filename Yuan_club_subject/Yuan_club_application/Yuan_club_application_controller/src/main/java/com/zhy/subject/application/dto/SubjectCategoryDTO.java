package com.zhy.subject.application.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 题目分类(SubjectCategory)实体类
 *
 * @author makejava
 * @since 2024-01-14 17:04:13
 */
@Data
public class SubjectCategoryDTO implements Serializable {

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
     * 数量
     */
    private Integer count;

    /**
     * 标签信息
     */
    private List<SubjectLabelDTO> labelDTOList;
}