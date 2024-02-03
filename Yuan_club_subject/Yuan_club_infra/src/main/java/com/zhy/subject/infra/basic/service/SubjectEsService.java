package com.zhy.subject.infra.basic.service;

import com.zhy.subject.common.entity.PageResult;
import com.zhy.subject.infra.basic.entity.SubjectInfoEs;

public interface SubjectEsService {

    boolean insert(SubjectInfoEs subjectInfoEs);

    PageResult<SubjectInfoEs> querySubjectList(SubjectInfoEs subjectInfoEs);

}
