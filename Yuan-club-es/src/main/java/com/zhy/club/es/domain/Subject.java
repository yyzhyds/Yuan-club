package com.zhy.club.es.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 2/2/2024 下午12:25
 */
@Data
public class Subject {
    private Long subjectId;

    private Long docId;

    private String subjectName;

    private String subjectAnswer;

    private String createUser;

    private Long createTime;

    private Integer subjectType;

    private String keyWord;

    private BigDecimal score;
}
