package com.zhy.subject.domain.entity;

import com.zhy.subject.common.entity.PageInfo;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 题目点赞表 bo
 *
 * @author 随缘而愈
 * @since 2024-01-07 23:08:45
 */
@Data
public class SubjectLikedBO extends PageInfo implements Serializable {

    /**
     * 主键
     */
    private Long id;

    /**
     * 题目id
     */
    private Long subjectId;

    /**
     * 点赞人id
     */
    private String likeUserId;

    /**
     * 点赞状态 1点赞 0不点赞
     */
    private Integer status;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 修改人
     */
    private String updateBy;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 
     */
    private Integer isDeleted;

}

