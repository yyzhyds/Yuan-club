package com.zhy.club.es.mapper;

import com.zhy.club.es.domain.Subject;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 2/2/2024 下午12:23
 */
@Mapper
public interface SubjectMapper {
     List<Subject> findAll();
}