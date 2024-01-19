package com.zhy.subject.domain.convert;

import com.zhy.subject.domain.entity.SubjectLabelBO;
import com.zhy.subject.infra.basic.entity.SubjectLabel;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-18T13:10:01+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_211 (Oracle Corporation)"
)
public class SubjectLabelConverterImpl implements SubjectLabelConverter {

    @Override
    public SubjectLabel convertBoToLabel(SubjectLabelBO subjectLabelBO) {
        if ( subjectLabelBO == null ) {
            return null;
        }

        SubjectLabel subjectLabel = new SubjectLabel();

        subjectLabel.setId( subjectLabelBO.getId() );
        subjectLabel.setLabelName( subjectLabelBO.getLabelName() );
        subjectLabel.setSortNum( subjectLabelBO.getSortNum() );
        subjectLabel.setCategoryId( subjectLabelBO.getCategoryId() );
        subjectLabel.setCreatedBy( subjectLabelBO.getCreatedBy() );
        subjectLabel.setCreatedTime( subjectLabelBO.getCreatedTime() );
        subjectLabel.setUpdateBy( subjectLabelBO.getUpdateBy() );
        subjectLabel.setUpdateTime( subjectLabelBO.getUpdateTime() );
        subjectLabel.setIsDeleted( subjectLabelBO.getIsDeleted() );

        return subjectLabel;
    }

    @Override
    public List<SubjectLabelBO> convertBoToLabel(List<SubjectLabel> labelList) {
        if ( labelList == null ) {
            return null;
        }

        List<SubjectLabelBO> list = new ArrayList<SubjectLabelBO>( labelList.size() );
        for ( SubjectLabel subjectLabel : labelList ) {
            list.add( subjectLabelToSubjectLabelBO( subjectLabel ) );
        }

        return list;
    }

    protected SubjectLabelBO subjectLabelToSubjectLabelBO(SubjectLabel subjectLabel) {
        if ( subjectLabel == null ) {
            return null;
        }

        SubjectLabelBO subjectLabelBO = new SubjectLabelBO();

        subjectLabelBO.setId( subjectLabel.getId() );
        subjectLabelBO.setLabelName( subjectLabel.getLabelName() );
        subjectLabelBO.setSortNum( subjectLabel.getSortNum() );
        subjectLabelBO.setCategoryId( subjectLabel.getCategoryId() );
        subjectLabelBO.setCreatedBy( subjectLabel.getCreatedBy() );
        subjectLabelBO.setCreatedTime( subjectLabel.getCreatedTime() );
        subjectLabelBO.setUpdateBy( subjectLabel.getUpdateBy() );
        subjectLabelBO.setUpdateTime( subjectLabel.getUpdateTime() );
        subjectLabelBO.setIsDeleted( subjectLabel.getIsDeleted() );

        return subjectLabelBO;
    }
}
