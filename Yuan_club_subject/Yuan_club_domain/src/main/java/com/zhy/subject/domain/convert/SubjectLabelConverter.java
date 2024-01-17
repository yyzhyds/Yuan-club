package com.zhy.subject.domain.convert;

import com.zhy.subject.domain.entity.SubjectCategoryBO;
import com.zhy.subject.domain.entity.SubjectLabelBO;
import com.zhy.subject.infra.basic.entity.SubjectCategory;
import com.zhy.subject.infra.basic.entity.SubjectLabel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 15/1/2024 上午10:02
 */
@Mapper
public interface SubjectLabelConverter {

    SubjectLabelConverter INSTANCE = Mappers.getMapper(SubjectLabelConverter.class);

    SubjectLabel convertBoToLabel(SubjectLabelBO subjectLabelBO);

    List<SubjectLabelBO> convertBoToLabel(List<SubjectLabel> labelList);

}