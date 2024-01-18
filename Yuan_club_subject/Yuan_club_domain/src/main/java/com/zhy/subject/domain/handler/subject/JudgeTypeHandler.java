package com.zhy.subject.domain.handler.subject;

import com.zhy.subject.common.enums.IsDeleteFlagEnum;
import com.zhy.subject.common.enums.SubjectInfoTypeEnum;
import com.zhy.subject.domain.convert.JudgeSubjectConverter;
import com.zhy.subject.domain.entity.SubjectAnswerBO;
import com.zhy.subject.domain.entity.SubjectInfoBO;
import com.zhy.subject.domain.entity.SubjectOptionBO;
import com.zhy.subject.infra.basic.entity.SubjectJudge;
import com.zhy.subject.infra.basic.service.SubjectJudgeService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 17/1/2024 上午11:51
 */
@Component
public class JudgeTypeHandler implements SubjectTypeHandler {
    @Resource
    private SubjectJudgeService subjectJudgeService;
    @Override
    public SubjectInfoTypeEnum getHandlerType() {
        return SubjectInfoTypeEnum.JUDGE;
    }

    @Override
    public void add(SubjectInfoBO subjectInfoBO) {
        //判断题目的插入
        List<SubjectJudge> subjectJudgeList = new LinkedList<>();
        subjectInfoBO.getOptionList().forEach(option->{
            SubjectJudge subjectJudge = JudgeSubjectConverter.INSTANCE.convertBoToEntity(option);
            subjectJudge.setSubjectId(subjectInfoBO.getId());
            subjectJudge.setIsDeleted(IsDeleteFlagEnum.UN_DELETED.getCode());
            subjectJudgeList.add(subjectJudge);
        });
        subjectJudgeService.bathInsert(subjectJudgeList);

    }

    @Override
    public SubjectOptionBO query(int subjectId) {
        SubjectJudge subjectJudge = new SubjectJudge();
        subjectJudge.setSubjectId(Long.valueOf(subjectId));
        List<SubjectJudge> result = subjectJudgeService.queryByCondition(subjectJudge);
        List<SubjectAnswerBO> subjectAnswerBOList = JudgeSubjectConverter.INSTANCE.convertEntityToBoList(result);
        SubjectOptionBO subjectOptionBO = new SubjectOptionBO();
        subjectOptionBO.setOptionList(subjectAnswerBOList);
        return subjectOptionBO;

    }
}
