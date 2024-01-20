package com.zhy.subject.domain.service;

import com.zhy.subject.common.entity.PageResult;
import com.zhy.subject.domain.entity.SubjectInfoBO;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 15/1/2024 上午9:53
 */


public interface SubjectInfoDomainService {

    /**
     * 新增题目
    */
    void   add (SubjectInfoBO subjectInfoBO);

    PageResult<SubjectInfoBO> getSubjectPage(SubjectInfoBO subjectInfoBO);

    SubjectInfoBO getSubjectInfo(SubjectInfoBO subjectInfoBO);
}