package com.zhy.subject.infra.basic.mapper;

import com.zhy.subject.infra.basic.entity.SubjectJudge;
import org.apache.ibatis.annotations.Param;

import java.util.LinkedList;
import java.util.List;

/**
 * 判断题(SubjectJudge)表数据库访问层
 *
 * @author makejava
 * @since 2024-01-17 10:48:46
 */
public interface SubjectJudgeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SubjectJudge queryById(Long id);

    /**
     * 查询指定行数据
     *
     */
    List<SubjectJudge> queryAllByLimit(SubjectJudge subjectJudge);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param subjectJudge 实例对象
     * @return 对象列表
     */
    List<SubjectJudge> queryAll(SubjectJudge subjectJudge);

    /**
     * 新增数据
     *
     * @param subjectJudge 实例对象
     * @return 影响行数
     */
    int insert(SubjectJudge subjectJudge);

    /**
     * 修改数据
     *
     * @param subjectJudge 实例对象
     * @return 影响行数
     */
    int update(SubjectJudge subjectJudge);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

    void bathInsert(@Param("entities") List<SubjectJudge> entities);
}