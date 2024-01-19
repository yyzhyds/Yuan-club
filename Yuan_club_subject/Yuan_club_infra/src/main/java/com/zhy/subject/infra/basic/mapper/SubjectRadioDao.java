package com.zhy.subject.infra.basic.mapper;

import com.zhy.subject.infra.basic.entity.SubjectInfo;
import com.zhy.subject.infra.basic.entity.SubjectRadio;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 单选题信息表(SubjectRadio)表数据库访问层
 *
 * @author makejava
 * @since 2024-01-17 12:12:40
 */
public interface SubjectRadioDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SubjectRadio queryById(Long id);

    /**
     *
     * @return 对象列表
     */
    List<SubjectRadio> queryAllByLimit(SubjectRadio subjectRadio);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param subjectRadio 实例对象
     * @return 对象列表
     */
    List<SubjectRadio> queryAll(SubjectRadio subjectRadio);

    /**
     * 新增数据
     *
     * @param subjectRadio 实例对象
     * @return 影响行数
     */
    int insert(SubjectRadio subjectRadio);

    void bathInsert(@Param("entities") List<SubjectRadio> entities);
    /**
     * 修改数据
     *
     * @param subjectRadio 实例对象
     * @return 影响行数
     */
    int update(SubjectRadio subjectRadio);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}