package com.zhy.subject.domain.service.Impl;

import com.alibaba.fastjson.JSON;
import com.zhy.subject.common.entity.PageResult;
import com.zhy.subject.common.enums.IsDeleteFlagEnum;
import com.zhy.subject.domain.convert.SubjectInfoConverter;
import com.zhy.subject.domain.entity.SubjectInfoBO;
import com.zhy.subject.domain.entity.SubjectOptionBO;
import com.zhy.subject.domain.handler.subject.SubjectTypeHandler;
import com.zhy.subject.domain.handler.subject.SubjectTypeHandlerFactory;
import com.zhy.subject.domain.service.SubjectInfoDomainService;
import com.zhy.subject.infra.basic.entity.SubjectInfo;
import com.zhy.subject.infra.basic.entity.SubjectLabel;
import com.zhy.subject.infra.basic.entity.SubjectMapping;
import com.zhy.subject.infra.basic.service.SubjectInfoService;
import com.zhy.subject.infra.basic.service.SubjectLabelService;
import com.zhy.subject.infra.basic.service.SubjectMappingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 15/1/2024 上午9:53
 */

@Service
@Slf4j
public class SubjectInfoDomainServiceImpl implements SubjectInfoDomainService {
    @Resource
    private SubjectInfoService subjectInfoService;

    @Resource
    private SubjectMappingService subjectMappingService;

    @Resource
    private SubjectTypeHandlerFactory subjectTypeHandlerFactory;

    @Resource
    private SubjectLabelService subjectLabelService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void add(SubjectInfoBO subjectInfoBO) {
        if (log.isInfoEnabled()) {
            log.info("SubjectInfoDomainServiceImpl.add.bo:{}", JSON.toJSONString(subjectInfoBO));
        }
        SubjectInfo subjectInfo = SubjectInfoConverter.INSTANCE.convertBoToInfo(subjectInfoBO);
        subjectInfo.setIsDeleted(IsDeleteFlagEnum.UN_DELETED.getCode());
        subjectInfoService.insert(subjectInfo);
        //工厂
        SubjectTypeHandler handler = subjectTypeHandlerFactory.getHandler(subjectInfo.getSubjectType());
        subjectInfoBO.setId(subjectInfo.getId());
        handler.add(subjectInfoBO);
        List<Integer> categoryIds = subjectInfoBO.getCategoryIds();
        List<Integer> labelIds = subjectInfoBO.getLabelIds();
        List<SubjectMapping> mappings = new LinkedList<>();
        categoryIds.forEach(categoryId -> {
            labelIds.forEach(labelId -> {
                SubjectMapping subjectMapping = new SubjectMapping();
                subjectMapping.setSubjectId(subjectInfo.getId());
                subjectMapping.setCategoryId(Long.valueOf(categoryId));
                subjectMapping.setLabelId(Long.valueOf(labelId));
                subjectMapping.setIsDeleted(IsDeleteFlagEnum.UN_DELETED.getCode());
                mappings.add(subjectMapping);
            });
        });
        subjectMappingService.bathInsert(mappings);
    }

    @Override
    public PageResult<SubjectInfoBO> getSubjectPage(SubjectInfoBO subjectInfoBO) {
        PageResult<SubjectInfoBO> pageResult = new PageResult<>();
        pageResult.setPageNo(subjectInfoBO.getPageNo());
        pageResult.setPageSize(subjectInfoBO.getPageSize());
        int start = (subjectInfoBO.getPageNo() - 1) * subjectInfoBO.getPageSize();
        SubjectInfo subjectInfo = SubjectInfoConverter.INSTANCE.convertBoToInfo(subjectInfoBO);
        int count = subjectInfoService.countByCondition
                (subjectInfo, subjectInfoBO.getCategoryId(), subjectInfoBO.getLabelId());
        if (count == 0) {
            return pageResult;
        }
        List<SubjectInfo> subjectInfoList = subjectInfoService.queryPage(subjectInfo, subjectInfoBO.getCategoryId(),
                subjectInfoBO.getLabelId(),start, subjectInfoBO.getPageSize());
        List<SubjectInfoBO> boList = SubjectInfoConverter.INSTANCE.
                convertListInfoToBO(subjectInfoList);
        pageResult.setRecords(boList);
        pageResult.setTotal(count);
        return pageResult;
    }

    @Override
    public SubjectInfoBO getSubjectInfo(SubjectInfoBO subjectInfoBO) {
        SubjectInfo subjectInfo = subjectInfoService.queryById(subjectInfoBO.getId());
        SubjectTypeHandler handler = subjectTypeHandlerFactory.getHandler(subjectInfo.getSubjectType());
        SubjectOptionBO optionBO = handler.query(subjectInfo.getId().intValue());
        SubjectInfoBO bo = SubjectInfoConverter.INSTANCE.INSTANCE.convertOptionAndInfoToBO(optionBO, subjectInfo);
        SubjectMapping subjectMapping = new SubjectMapping();
        subjectMapping.setSubjectId(subjectInfo.getId());
        subjectMapping.setIsDeleted(IsDeleteFlagEnum.UN_DELETED.getCode());
        List<SubjectMapping> mappingList = subjectMappingService.queryLabelId(subjectMapping);
        List<Long> labelIdList = mappingList.stream().map(SubjectMapping::getLabelId).collect(Collectors.toList());
        List<SubjectLabel> labelList = subjectLabelService.batchQueryById(labelIdList);
        List<String> labelNameList = labelList.stream().map(SubjectLabel::getLabelName).collect(Collectors.toList());
        bo.setLabelNames(labelNameList);

//        bo.setLiked(subjectLikedDomainService.isLiked(subjectInfoBO.getId().toString(), LoginUtil.getLoginId()));
//        bo.setLikedCount(subjectLikedDomainService.getLikedCount(subjectInfoBO.getId().toString()));
//        assembleSubjectCursor(subjectInfoBO, bo);
        return bo;

    }


}
