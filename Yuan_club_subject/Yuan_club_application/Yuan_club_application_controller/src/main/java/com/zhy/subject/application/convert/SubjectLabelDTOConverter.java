package com.zhy.subject.application.convert;

import com.zhy.subject.application.dto.SubjectCategoryDTO;
import com.zhy.subject.application.dto.SubjectLabelDTO;
import com.zhy.subject.domain.entity.SubjectCategoryBO;
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
public interface SubjectLabelDTOConverter {

    SubjectLabelDTOConverter INSTANCE = Mappers.getMapper(SubjectLabelDTOConverter.class);

    SubjectLabelBO convertDtoToLabel(SubjectLabelDTO subjectLabelDTO);

    List<SubjectLabelDTO> convertBoToLabelDTOList(List<SubjectLabelBO> subjectLabelBOS);

    SubjectLabelBO convertDtoToLabelBo(SubjectLabelDTO subjectLabelDTO);

    List<SubjectLabelDTO> convertBOToLabelDTOList(List<SubjectLabelBO> boList);
}