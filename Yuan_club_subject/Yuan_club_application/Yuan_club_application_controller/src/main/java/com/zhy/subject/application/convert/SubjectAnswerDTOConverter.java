package com.zhy.subject.application.convert;

import com.zhy.subject.application.dto.SubjectAnswerDTO;
import com.zhy.subject.domain.entity.SubjectAnswerBO;
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
public interface SubjectAnswerDTOConverter {

//    SubjectAnswerDTOConverter INSTANCE = Mappers.getMapper(SubjectAnswerDTOConverter.class);
//
//    SubjectInfoAnswerBO convertDtoToAnswer (SubjectInfoAnswerDTO subjectInfoAnswerDTO);
//
//   // List<SubjectInfoAnswerDTO> convertBoToAnswerDtoList(List<SubjectInfoAnswerBO> subjectInfoAnswerBOS);
//    List<SubjectInfoAnswerBO> convertDtoToAnswerboList(List<SubjectInfoAnswerDTO> subjectInfoAnswerDTOS);
//
//    SubjectInfoAnswerBO convertDtoToAnswerBo(SubjectInfoAnswerDTO subjectInfoAnswerDTO);


    SubjectAnswerDTOConverter INSTANCE = Mappers.getMapper(SubjectAnswerDTOConverter.class);

    SubjectAnswerBO convertDTOToBO(SubjectAnswerDTO subjectAnswerDTO);

    List<SubjectAnswerBO> convertListDTOToBO(List<SubjectAnswerDTO> dtoList);

}