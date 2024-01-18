package com.zhy.subject.domain.entity;

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
public class SubjectOptionBO implements Serializable {

    /**
     * 题目答案
     */
    private String subjectAnswer;

    /**
     * 答案实体
     */
    private List<SubjectAnswerBO> optionList;


}