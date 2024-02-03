package com.zhy.application.convert;

import com.zhy.application.dto.SubjectLikedDTO;
import com.zhy.subject.domain.entity.SubjectLikedBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 题目点赞表 dto转换器
 *
 * @author 随缘而愈
 * @since 2024-01-07 23:08:45
 */
@Mapper
public interface SubjectLikedDTOConverter {

    SubjectLikedDTOConverter INSTANCE = Mappers.getMapper(SubjectLikedDTOConverter.class);

    SubjectLikedBO convertDTOToBO(SubjectLikedDTO subjectLikedDTO);

}
