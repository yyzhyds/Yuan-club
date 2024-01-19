package com.zhy.subject.infra.basic.mapper;

import com.zhy.subject.infra.basic.entity.SubjectBrief;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 简答题(SubjectBrief)表数据库访问层
 *
 * @author makejava
 * @since 2024-01-17 10:47:34
 */
public interface SubjectBriefDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SubjectBrief queryById(Long id);

    /**
     * 查询指定行数据
     *
     */
    SubjectBrief queryAllByLimit(SubjectBrief subjectBrief);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param subjectBrief 实例对象
     * @return 对象列表
     */
    List<SubjectBrief> queryAll(SubjectBrief subjectBrief);

    /**
     * 新增数据
     *
     * @param subjectBrief 实例对象
     * @return 影响行数
     */
    int insert(SubjectBrief subjectBrief);

    /**
     * 修改数据
     *
     * @param subjectBrief 实例对象
     * @return 影响行数
     */
    int update(SubjectBrief subjectBrief);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

    void bathInsert(@Param("entities") List<SubjectBrief> entities);
}