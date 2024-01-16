package com.zhy.subject.domain.service;

import com.zhy.subject.domain.entity.SubjectCategoryBO;
import com.zhy.subject.infra.basic.entity.SubjectCategory;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 15/1/2024 上午9:53
 */


public interface SubjectCategoryDomainService {

    /**
     * 新增分类
    */
    void add(SubjectCategoryBO subjectCategoryBO);

    /**
     * 查询岗位大类
     */
    List<SubjectCategoryBO> queryCategory(SubjectCategoryBO subjectCategoryBO);

    /**
     * 更新分类
     */
    Boolean update(SubjectCategoryBO subjectCategoryBO);

    /**
     * 删除分类
    */
    Boolean delete(SubjectCategoryBO subjectCategoryBO);
}