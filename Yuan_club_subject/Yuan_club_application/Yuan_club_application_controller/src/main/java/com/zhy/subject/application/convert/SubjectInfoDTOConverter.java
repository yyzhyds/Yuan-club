package com.zhy.subject.application.convert;

import com.zhy.subject.application.dto.SubjectInfoDTO;
import com.zhy.subject.application.dto.SubjectLabelDTO;
import com.zhy.subject.domain.entity.SubjectInfoBO;
import com.zhy.subject.domain.entity.SubjectLabelBO;
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
public interface SubjectInfoDTOConverter {

//    SubjectInfoDTOConverter INSTANCE = Mappers.getMapper(SubjectInfoDTOConverter.class);
//
//    SubjectInfoBO convertDtoToInfo(SubjectInfoDTO subjectInfoDTO);
//
//    List<SubjectInfoDTO> convertBoToInfoDTOList(List<SubjectInfoBO> subjectInfoBOS);
//    List<SubjectInfoBO> convertDtoToInfoBoList(List<SubjectInfoDTO> subjectInfoDTOS);
//
//    SubjectInfoBO convertDtoToInfoBo(SubjectInfoDTO subjectInfoDTO);


    SubjectInfoDTOConverter INSTANCE = Mappers.getMapper(SubjectInfoDTOConverter.class);

    SubjectInfoBO convertDTOToBO(SubjectInfoDTO subjectInfoDTO);

    SubjectInfoDTO convertBOToDTO(SubjectInfoBO subjectInfoBO);

    List<SubjectInfoDTO> convertBOToDTOList(List<SubjectInfoBO> subjectInfoBO);

}