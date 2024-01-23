package com.zhy.auth.infra.basic.mapper;

import com.zhy.auth.infra.basic.entity.AuthPermission;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (AuthPermission)表数据库访问层
 *
 * @author makejava
 * @since 2024-01-22 10:20:50
 */
public interface AuthPermissionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AuthPermission queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AuthPermission> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param authPermission 实例对象
     * @return 对象列表
     */
    List<AuthPermission> queryAll(AuthPermission authPermission);

    /**
     * 新增数据
     *
     * @param authPermission 实例对象
     * @return 影响行数
     */
    int insert(AuthPermission authPermission);

    /**
     * 修改数据
     *
     * @param authPermission 实例对象
     * @return 影响行数
     */
    Integer update(AuthPermission authPermission);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

    List<AuthPermission> queryByRoleList(@Param("list") List<Long> roleIdList);
}