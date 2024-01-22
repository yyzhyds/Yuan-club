package com.zhy.auth.infra.basic.mapper;

import com.zhy.auth.infra.basic.entity.AuthRole;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (AuthRole)表数据库访问层
 *
 * @author makejava
 * @since 2024-01-21 16:09:38
 */
public interface AuthRoleDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AuthRole queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    AuthRole queryAllByLimit(AuthRole authRole);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param authRole 实例对象
     * @return 对象列表
     */
    List<AuthRole> queryAll(AuthRole authRole);

    /**
     * 新增数据
     *
     * @param authRole 实例对象
     * @return 影响行数
     */
    int insert(AuthRole authRole);

    /**
     * 修改数据
     *
     * @param authRole 实例对象
     * @return 影响行数
     */
    int update(AuthRole authRole);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}