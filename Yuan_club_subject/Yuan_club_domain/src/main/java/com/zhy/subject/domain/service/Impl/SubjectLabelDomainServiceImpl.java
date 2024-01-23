package com.zhy.subject.domain.service.Impl;

import com.alibaba.fastjson.JSON;
import com.zhy.subject.common.enums.IsDeleteFlagEnum;
import com.zhy.subject.domain.convert.SubjectCategoryConverter;
import com.zhy.subject.domain.convert.SubjectLabelConverter;
import com.zhy.subject.domain.entity.SubjectCategoryBO;
import com.zhy.subject.domain.entity.SubjectLabelBO;
import com.zhy.subject.domain.service.SubjectCategoryDomainService;
import com.zhy.subject.domain.service.SubjectLabelDomainService;
import com.zhy.subject.infra.basic.entity.SubjectCategory;
import com.zhy.subject.infra.basic.entity.SubjectLabel;
import com.zhy.subject.infra.basic.service.SubjectCategoryService;
import com.zhy.subject.infra.basic.service.SubjectLabelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 15/1/2024 上午9:53
 */

@Service
@Slf4j
public class SubjectLabelDomainServiceImpl implements SubjectLabelDomainService {
    @Resource
    private SubjectLabelService subjectLabelService;

    @Override
    public Boolean add(SubjectLabelBO subjectLabelBO) {
        if (log.isInfoEnabled()) {
            log.info("SubjectLabelDomainServiceImpl.add.bo:{}", JSON.toJSONString(subjectLabelBO));
        }
        SubjectLabel subjectLabel = SubjectLabelConverter.INSTANCE
                .convertBoToLabel(subjectLabelBO);
        subjectLabel.setIsDeleted(IsDeleteFlagEnum.UN_DELETED.getCode());
        int count = subjectLabelService.insert(subjectLabel);
        return count > 0;
    }



    @Override
    public Boolean update(SubjectLabelBO subjectLabelBO) {
        if (log.isInfoEnabled()) {
            log.info("SubjectLabelDomainServiceImpl.update.bo:{}", JSON.toJSONString(subjectLabelBO));
        }
        SubjectLabel subjectLabel = SubjectLabelConverter.INSTANCE
                .convertBoToLabel(subjectLabelBO);
        int count = subjectLabelService.update(subjectLabel);
        return count > 0;
    }

    @Override
    public Boolean delete(SubjectLabelBO subjectLabelBO) {
        if (log.isInfoEnabled()) {
            log.info("SubjectLabelDomainServiceImpl.update.bo:{}", JSON.toJSONString(subjectLabelBO));
        }
        SubjectLabel subjectLabel = SubjectLabelConverter.INSTANCE
                .convertBoToLabel(subjectLabelBO);
        subjectLabel.setIsDeleted(IsDeleteFlagEnum.DELETED.getCode());
        int count = subjectLabelService.update(subjectLabel);
        return count > 0;
    }

    @Override
    public List<SubjectLabelBO> queryLabel(SubjectLabelBO subjectLabelBO) {
        SubjectLabel subjectLabel  = SubjectLabelConverter.INSTANCE
                .convertBoToLabel(subjectLabelBO);
        subjectLabel.setIsDeleted(IsDeleteFlagEnum.UN_DELETED.getCode());
        List<SubjectLabel> subjectLabelList = subjectLabelService.queryLabel(subjectLabel);
        List<SubjectLabelBO> boList = SubjectLabelConverter.INSTANCE
                .convertBoToLabel(subjectLabelList);
        if (log.isInfoEnabled()){
            log.info("SubjectLabelController.queryLabel.bo:{}",
                    JSON.toJSONString(boList));
        }
        return boList;
    }

}
