package com.zhy.subject.domain.handler.subject;

import com.zhy.subject.common.enums.SubjectInfoTypeEnum;
import com.zhy.subject.domain.convert.BriefSubjectConverter;
import com.zhy.subject.domain.entity.SubjectInfoBO;
import com.zhy.subject.domain.entity.SubjectOptionBO;
import com.zhy.subject.infra.basic.entity.SubjectBrief;
import com.zhy.subject.infra.basic.service.SubjectBriefService;
import org.springframework.stereotype.Component;
import com.zhy.subject.common.enums.IsDeleteFlagEnum;

import javax.annotation.Resource;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 17/1/2024 上午11:51
 */
@Component
public class BriefTypeHandler implements SubjectTypeHandler {
    @Resource
    private SubjectBriefService subjectBriefService;
    @Override
    public SubjectInfoTypeEnum getHandlerType() {
        return SubjectInfoTypeEnum.BRIEF;
    }

    @Override
    public void add(SubjectInfoBO subjectInfoBO) {
        //简答题目的插入
        SubjectBrief subjectBrief = BriefSubjectConverter.INSTANCE.convertBoToEntity(subjectInfoBO);
        subjectBrief.setSubjectId(subjectInfoBO.getId());
        subjectBrief.setIsDeleted(IsDeleteFlagEnum.UN_DELETED.getCode());
        subjectBriefService.insert(subjectBrief);

    }

    @Override
    public SubjectOptionBO query(int subjectId) {
        SubjectBrief subjectBrief = new SubjectBrief();
        subjectBrief.setSubjectId(Long.valueOf(subjectId));
        SubjectBrief result = subjectBriefService.queryByCondition(subjectBrief);
        SubjectOptionBO subjectOptionBO = new SubjectOptionBO();
        subjectOptionBO.setSubjectAnswer(result.getSubjectAnswer());
        return subjectOptionBO;

    }
}
