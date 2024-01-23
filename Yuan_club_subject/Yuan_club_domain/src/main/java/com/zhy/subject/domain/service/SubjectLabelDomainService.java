package com.zhy.subject.domain.service;

import com.zhy.subject.domain.entity.SubjectCategoryBO;
import com.zhy.subject.domain.entity.SubjectLabelBO;

import java.util.List;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 15/1/2024 上午9:53
 */


public interface SubjectLabelDomainService {

    /**
     * 新增标签
     */
    Boolean add(SubjectLabelBO subjectLabelBO);


    /**
     * 更新标签
     */
    Boolean update(SubjectLabelBO subjectLabelBO);


    /**
     * 删除标签
    */
    Boolean delete(SubjectLabelBO subjectLabelBO);

    /**
     * 查询分类下标签
     */
    List<SubjectLabelBO> queryLabel(SubjectLabelBO subjectLabelBO);
}