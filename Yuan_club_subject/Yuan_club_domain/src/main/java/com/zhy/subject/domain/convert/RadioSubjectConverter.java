package com.zhy.subject.domain.convert;

import com.zhy.subject.domain.entity.SubjectAnswerBO;
import com.zhy.subject.infra.basic.entity.SubjectRadio;
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
public interface RadioSubjectConverter {

    RadioSubjectConverter INSTANCE = Mappers.getMapper(RadioSubjectConverter.class);

    SubjectRadio convertBoToEntity(SubjectAnswerBO subjectAnswerBO);

   // List<SubjectInfoBO> convertBoToInfo(List<SubjectInfo> infoList);
   List<SubjectAnswerBO> convertEntityToBoList(List<SubjectRadio> subjectRadioList);

}