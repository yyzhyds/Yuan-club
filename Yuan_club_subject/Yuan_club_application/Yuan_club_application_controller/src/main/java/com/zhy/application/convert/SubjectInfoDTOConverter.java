package com.zhy.application.convert;

import com.zhy.application.dto.SubjectInfoDTO;
import com.zhy.subject.domain.entity.SubjectInfoBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 题目信息dto转换器
 *
 * @author: 随缘而愈
 * @date: 2023/10/8
 */
@Mapper
public interface SubjectInfoDTOConverter {

    SubjectInfoDTOConverter INSTANCE = Mappers.getMapper(SubjectInfoDTOConverter.class);

    SubjectInfoBO convertDTOToBO(SubjectInfoDTO subjectInfoDTO);

    SubjectInfoDTO convertBOToDTO(SubjectInfoBO subjectInfoBO);

    List<SubjectInfoDTO> convertBOToDTOList(List<SubjectInfoBO> subjectInfoBO);

}
