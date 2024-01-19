package com.zhy.subject.infra.basic.mapper;

import com.zhy.subject.infra.basic.entity.SubjectMultiple;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 多选题信息表(SubjectMultiple)表数据库访问层
 *
 * @author makejava
 * @since 2024-01-17 10:49:35
 */
public interface SubjectMultipleDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SubjectMultiple queryById(Long id);

    /**
     * 查询指定行数据
     *
     */
    List<SubjectMultiple> queryAllByLimit(SubjectMultiple subjectMultiple);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param subjectMultiple 实例对象
     * @return 对象列表
     */
    List<SubjectMultiple> queryAll(SubjectMultiple subjectMultiple);

    /**
     * 新增数据
     *
     * @param subjectMultiple 实例对象
     * @return 影响行数
     */
    int insert(SubjectMultiple subjectMultiple);


    void bathInsert(@Param("entities")List<SubjectMultiple> entities);
    /**
     * 修改数据
     *
     * @param subjectMultiple 实例对象
     * @return 影响行数
     */
    int update(SubjectMultiple subjectMultiple);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}