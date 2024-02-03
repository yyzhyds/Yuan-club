package com.zhy.application.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 题目答案dto
 *
 * @author: 随缘而愈
 * @date: 2023/10/5
 */
@Data
public class SubjectAnswerDTO implements Serializable {

    /**
     * 答案选项标识
     */
    private Integer optionType;

    /**
     * 答案
     */
    private String optionContent;

    /**
     * 是否正确
     */
    private Integer isCorrect;

}

