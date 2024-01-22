package com.zhy.subject.domain.convert;

import com.zhy.subject.domain.entity.SubjectAnswerBO;
import com.zhy.subject.domain.entity.SubjectInfoBO;
import com.zhy.subject.domain.entity.SubjectOptionBO;
import com.zhy.subject.infra.basic.entity.SubjectInfo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-20T16:43:32+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_211 (Oracle Corporation)"
)
public class SubjectInfoConverterImpl implements SubjectInfoConverter {

    @Override
    public SubjectInfo convertBoToInfo(SubjectInfoBO subjectInfoBO) {
        if ( subjectInfoBO == null ) {
            return null;
        }

        SubjectInfo subjectInfo = new SubjectInfo();

        subjectInfo.setId( subjectInfoBO.getId() );
        subjectInfo.setSubjectName( subjectInfoBO.getSubjectName() );
        subjectInfo.setSubjectDifficult( subjectInfoBO.getSubjectDifficult() );
        subjectInfo.setSettleName( subjectInfoBO.getSettleName() );
        subjectInfo.setSubjectType( subjectInfoBO.getSubjectType() );
        subjectInfo.setSubjectScore( subjectInfoBO.getSubjectScore() );
        subjectInfo.setSubjectParse( subjectInfoBO.getSubjectParse() );
        subjectInfo.setCreatedBy( subjectInfoBO.getCreatedBy() );
        subjectInfo.setCreatedTime( subjectInfoBO.getCreatedTime() );
        subjectInfo.setUpdateBy( subjectInfoBO.getUpdateBy() );
        subjectInfo.setUpdateTime( subjectInfoBO.getUpdateTime() );
        subjectInfo.setIsDeleted( subjectInfoBO.getIsDeleted() );

        return subjectInfo;
    }

    @Override
    public SubjectInfoBO convertOptionToBO(SubjectOptionBO subjectOptionBO) {
        if ( subjectOptionBO == null ) {
            return null;
        }

        SubjectInfoBO subjectInfoBO = new SubjectInfoBO();

        subjectInfoBO.setSubjectAnswer( subjectOptionBO.getSubjectAnswer() );
        List<SubjectAnswerBO> list = subjectOptionBO.getOptionList();
        if ( list != null ) {
            subjectInfoBO.setOptionList( new ArrayList<SubjectAnswerBO>( list ) );
        }

        return subjectInfoBO;
    }

    @Override
    public SubjectInfoBO convertOptionAndInfoToBO(SubjectOptionBO subjectOptionBO, SubjectInfo subjectInfo) {
        if ( subjectOptionBO == null && subjectInfo == null ) {
            return null;
        }

        SubjectInfoBO subjectInfoBO = new SubjectInfoBO();

        if ( subjectOptionBO != null ) {
            subjectInfoBO.setSubjectAnswer( subjectOptionBO.getSubjectAnswer() );
            List<SubjectAnswerBO> list = subjectOptionBO.getOptionList();
            if ( list != null ) {
                subjectInfoBO.setOptionList( new ArrayList<SubjectAnswerBO>( list ) );
            }
        }
        if ( subjectInfo != null ) {
            subjectInfoBO.setId( subjectInfo.getId() );
            subjectInfoBO.setSubjectName( subjectInfo.getSubjectName() );
            subjectInfoBO.setSubjectDifficult( subjectInfo.getSubjectDifficult() );
            subjectInfoBO.setSettleName( subjectInfo.getSettleName() );
            subjectInfoBO.setSubjectType( subjectInfo.getSubjectType() );
            subjectInfoBO.setSubjectScore( subjectInfo.getSubjectScore() );
            subjectInfoBO.setSubjectParse( subjectInfo.getSubjectParse() );
            subjectInfoBO.setCreatedBy( subjectInfo.getCreatedBy() );
            subjectInfoBO.setCreatedTime( subjectInfo.getCreatedTime() );
            subjectInfoBO.setUpdateBy( subjectInfo.getUpdateBy() );
            subjectInfoBO.setUpdateTime( subjectInfo.getUpdateTime() );
            subjectInfoBO.setIsDeleted( subjectInfo.getIsDeleted() );
        }

        return subjectInfoBO;
    }

    @Override
    public List<SubjectInfoBO> convertListInfoToBO(List<SubjectInfo> infoList) {
        if ( infoList == null ) {
            return null;
        }

        List<SubjectInfoBO> list = new ArrayList<SubjectInfoBO>( infoList.size() );
        for ( SubjectInfo subjectInfo : infoList ) {
            list.add( subjectInfoToSubjectInfoBO( subjectInfo ) );
        }

        return list;
    }

    protected SubjectInfoBO subjectInfoToSubjectInfoBO(SubjectInfo subjectInfo) {
        if ( subjectInfo == null ) {
            return null;
        }

        SubjectInfoBO subjectInfoBO = new SubjectInfoBO();

        subjectInfoBO.setId( subjectInfo.getId() );
        subjectInfoBO.setSubjectName( subjectInfo.getSubjectName() );
        subjectInfoBO.setSubjectDifficult( subjectInfo.getSubjectDifficult() );
        subjectInfoBO.setSettleName( subjectInfo.getSettleName() );
        subjectInfoBO.setSubjectType( subjectInfo.getSubjectType() );
        subjectInfoBO.setSubjectScore( subjectInfo.getSubjectScore() );
        subjectInfoBO.setSubjectParse( subjectInfo.getSubjectParse() );
        subjectInfoBO.setCreatedBy( subjectInfo.getCreatedBy() );
        subjectInfoBO.setCreatedTime( subjectInfo.getCreatedTime() );
        subjectInfoBO.setUpdateBy( subjectInfo.getUpdateBy() );
        subjectInfoBO.setUpdateTime( subjectInfo.getUpdateTime() );
        subjectInfoBO.setIsDeleted( subjectInfo.getIsDeleted() );

        return subjectInfoBO;
    }
}
