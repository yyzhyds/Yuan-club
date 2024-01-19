package com.zhy.subject.infra.basic.mapper;

import com.zhy.subject.infra.basic.entity.SubjectMapping;
import com.zhy.subject.infra.basic.entity.SubjectRadio;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 题目分类关系表(SubjectMapping)表数据库访问层
 *
 * @author makejava
 * @since 2024-01-17 12:37:23
 */
public interface SubjectMappingDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SubjectMapping queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SubjectMapping> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param subjectMapping 实例对象
     * @return 对象列表
     */
    List<SubjectMapping> queryAll(SubjectMapping subjectMapping);

    /**
     * 新增数据
     *
     * @param subjectMapping 实例对象
     * @return 影响行数
     */
    int insert(SubjectMapping subjectMapping);

    void bathInsert(@Param("entities") List<SubjectMapping> entities);
    /**
     * 修改数据
     *
     * @param subjectMapping 实例对象
     * @return 影响行数
     */
    int update(SubjectMapping subjectMapping);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);


    List<SubjectMapping> queryDistinctLabelId(SubjectMapping subjectMapping);
}