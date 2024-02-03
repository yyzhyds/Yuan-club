package com.zhy.application.convert;


import com.zhy.application.dto.SubjectLabelDTO;
import com.zhy.subject.domain.entity.SubjectLabelBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 标签dto的转换
 * 
 * @author: 随缘而愈
 * @date: 2023/10/3
 */
@Mapper
public interface SubjectLabelDTOConverter {

    SubjectLabelDTOConverter INSTANCE = Mappers.getMapper(SubjectLabelDTOConverter.class);

    SubjectLabelBO convertDtoToLabelBO(SubjectLabelDTO subjectLabelDTO);

    List<SubjectLabelDTO> convertBOToLabelDTOList(List<SubjectLabelBO> boList);

}
