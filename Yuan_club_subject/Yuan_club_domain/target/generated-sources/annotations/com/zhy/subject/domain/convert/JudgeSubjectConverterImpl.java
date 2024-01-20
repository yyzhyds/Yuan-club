package com.zhy.subject.domain.convert;

import com.zhy.subject.domain.entity.SubjectAnswerBO;
import com.zhy.subject.infra.basic.entity.SubjectJudge;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-20T12:30:03+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_211 (Oracle Corporation)"
)
public class JudgeSubjectConverterImpl implements JudgeSubjectConverter {

    @Override
    public SubjectJudge convertBoToEntity(SubjectAnswerBO subjectAnswerBO) {
        if ( subjectAnswerBO == null ) {
            return null;
        }

        SubjectJudge subjectJudge = new SubjectJudge();

        subjectJudge.setIsCorrect( subjectAnswerBO.getIsCorrect() );

        return subjectJudge;
    }

    @Override
    public List<SubjectAnswerBO> convertEntityToBoList(List<SubjectJudge> subjectJudgeList) {
        if ( subjectJudgeList == null ) {
            return null;
        }

        List<SubjectAnswerBO> list = new ArrayList<SubjectAnswerBO>( subjectJudgeList.size() );
        for ( SubjectJudge subjectJudge : subjectJudgeList ) {
            list.add( subjectJudgeToSubjectAnswerBO( subjectJudge ) );
        }

        return list;
    }

    protected SubjectAnswerBO subjectJudgeToSubjectAnswerBO(SubjectJudge subjectJudge) {
        if ( subjectJudge == null ) {
            return null;
        }

        SubjectAnswerBO subjectAnswerBO = new SubjectAnswerBO();

        subjectAnswerBO.setIsCorrect( subjectJudge.getIsCorrect() );

        return subjectAnswerBO;
    }
}
