package com.zhy.subject.application.dto;

import com.zhy.subject.common.enetity.PageInfo;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 题目信息表(SubjectInfo)实体类DTO
 *
 * @author makejava
 * @since 2024-01-17 10:55:49
 */
@Data
public class SubjectInfoDTO extends PageInfo implements Serializable {
    /**
    * 主键
    */
    private Long id;
    /**
    * 题目名称
    */
    private String subjectName;
    /**
    * 题目难度
    */
    private Integer subjectDifficult;
    /**
    * 出题人名
    */
    private String settleName;
    /**
    * 题目类型 1单选 2多选 3判断 4简答
    */
    private Integer subjectType;
    /**
    * 题目分数
    */
    private Integer subjectScore;
    /**
    * 题目解析
    */
    private String subjectParse;
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
    
    private Integer isDeleted;

    /**
     * 题目答案
     */
    private String subjectAnswer;

    /**
     * 分类id
     */
    private List<Integer> categoryIds;

    /**
     * 标签id
     */
    private List<Integer> labelIds;

    /**
     * 标签name
     */
    private List<String> labelNames;

    /**
     * 答案实体
     */
    private List<SubjectAnswerDTO> optionList;

    private Long CategoryId;
    private Long LabelId;
}