package com.zhy.auth.infra.basic.mapper;

import com.zhy.auth.infra.basic.entity.AuthUserRole;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (AuthUserRole)表数据库访问层
 *
 * @author makejava
 * @since 2024-01-22 09:39:33
 */
public interface AuthUserRoleDao {

    /**
     * 通过ID查询单条数据
     *
     * @param  id
     * @return 实例对象
     */
    AuthUserRole queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AuthUserRole> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param authUserRole 实例对象
     * @return 对象列表
     */
    List<AuthUserRole> queryAll(AuthUserRole authUserRole);

    /**
     * 新增数据
     *
     * @param authUserRole 实例对象
     * @return 影响行数
     */
    int insert(AuthUserRole authUserRole);

    /**
     * 修改数据
     *
     * @param authUserRole 实例对象
     * @return 影响行数
     */
    int update(AuthUserRole authUserRole);

    /**
     * 通过主键删除数据
     *
     * @param  id
     * @return 影响行数
     */
    int deleteById(Long id);

}