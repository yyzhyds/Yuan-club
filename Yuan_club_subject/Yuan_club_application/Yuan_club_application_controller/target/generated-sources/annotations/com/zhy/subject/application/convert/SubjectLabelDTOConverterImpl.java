package com.zhy.subject.application.convert;

import com.zhy.subject.application.dto.SubjectLabelDTO;
import com.zhy.subject.domain.entity.SubjectLabelBO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-20T12:30:05+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_211 (Oracle Corporation)"
)
public class SubjectLabelDTOConverterImpl implements SubjectLabelDTOConverter {

    @Override
    public SubjectLabelBO convertDtoToLabel(SubjectLabelDTO subjectLabelDTO) {
        if ( subjectLabelDTO == null ) {
            return null;
        }

        SubjectLabelBO subjectLabelBO = new SubjectLabelBO();

        subjectLabelBO.setId( subjectLabelDTO.getId() );
        subjectLabelBO.setLabelName( subjectLabelDTO.getLabelName() );
        subjectLabelBO.setSortNum( subjectLabelDTO.getSortNum() );
        subjectLabelBO.setCategoryId( subjectLabelDTO.getCategoryId() );
        subjectLabelBO.setCreatedBy( subjectLabelDTO.getCreatedBy() );
        subjectLabelBO.setCreatedTime( subjectLabelDTO.getCreatedTime() );
        subjectLabelBO.setUpdateBy( subjectLabelDTO.getUpdateBy() );
        subjectLabelBO.setUpdateTime( subjectLabelDTO.getUpdateTime() );
        subjectLabelBO.setIsDeleted( subjectLabelDTO.getIsDeleted() );

        return subjectLabelBO;
    }

    @Override
    public List<SubjectLabelDTO> convertBoToLabelDTOList(List<SubjectLabelBO> subjectLabelBOS) {
        if ( subjectLabelBOS == null ) {
            return null;
        }

        List<SubjectLabelDTO> list = new ArrayList<SubjectLabelDTO>( subjectLabelBOS.size() );
        for ( SubjectLabelBO subjectLabelBO : subjectLabelBOS ) {
            list.add( subjectLabelBOToSubjectLabelDTO( subjectLabelBO ) );
        }

        return list;
    }

    @Override
    public SubjectLabelBO convertDtoToLabelBo(SubjectLabelDTO subjectLabelDTO) {
        if ( subjectLabelDTO == null ) {
            return null;
        }

        SubjectLabelBO subjectLabelBO = new SubjectLabelBO();

        subjectLabelBO.setId( subjectLabelDTO.getId() );
        subjectLabelBO.setLabelName( subjectLabelDTO.getLabelName() );
        subjectLabelBO.setSortNum( subjectLabelDTO.getSortNum() );
        subjectLabelBO.setCategoryId( subjectLabelDTO.getCategoryId() );
        subjectLabelBO.setCreatedBy( subjectLabelDTO.getCreatedBy() );
        subjectLabelBO.setCreatedTime( subjectLabelDTO.getCreatedTime() );
        subjectLabelBO.setUpdateBy( subjectLabelDTO.getUpdateBy() );
        subjectLabelBO.setUpdateTime( subjectLabelDTO.getUpdateTime() );
        subjectLabelBO.setIsDeleted( subjectLabelDTO.getIsDeleted() );

        return subjectLabelBO;
    }

    protected SubjectLabelDTO subjectLabelBOToSubjectLabelDTO(SubjectLabelBO subjectLabelBO) {
        if ( subjectLabelBO == null ) {
            return null;
        }

        SubjectLabelDTO subjectLabelDTO = new SubjectLabelDTO();

        subjectLabelDTO.setId( subjectLabelBO.getId() );
        subjectLabelDTO.setLabelName( subjectLabelBO.getLabelName() );
        subjectLabelDTO.setSortNum( subjectLabelBO.getSortNum() );
        subjectLabelDTO.setCategoryId( subjectLabelBO.getCategoryId() );
        subjectLabelDTO.setCreatedBy( subjectLabelBO.getCreatedBy() );
        subjectLabelDTO.setCreatedTime( subjectLabelBO.getCreatedTime() );
        subjectLabelDTO.setUpdateBy( subjectLabelBO.getUpdateBy() );
        subjectLabelDTO.setUpdateTime( subjectLabelBO.getUpdateTime() );
        subjectLabelDTO.setIsDeleted( subjectLabelBO.getIsDeleted() );

        return subjectLabelDTO;
    }
}
