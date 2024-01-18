package com.zhy.subject.application.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 题目答案DTO
 *
 * @author makejava
 * @since 2024-01-17 10:55:49
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