package com.zhy.subject.infra.basic.mapper;

import com.zhy.subject.infra.basic.entity.SubjectLabel;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 题目标签表(SubjectLabel)表数据库访问层
 *
 * @author makejava
 * @since 2024-01-16 10:04:27
 */
public interface SubjectLabelDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SubjectLabel queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SubjectLabel> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param subjectLabel 实例对象
     * @return 对象列表
     */
    List<SubjectLabel> queryAll(SubjectLabel subjectLabel);

    /**
     * 新增数据
     *
     * @param subjectLabel 实例对象
     * @return 影响行数
     */
    int insert(SubjectLabel subjectLabel);

    /**
     * 修改数据
     *
     * @param subjectLabel 实例对象
     * @return 影响行数
     */
    int update(SubjectLabel subjectLabel);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

    List<SubjectLabel> queryLabel(SubjectLabel subjectLabel);

    List<SubjectLabel> batchQueryById(@Param("list") List<Long> labelIdList);
}