package com.zhy.auth.infra.basic.mapper;

import com.zhy.auth.infra.basic.entity.AuthUser;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (AuthUser)表数据库访问层
 *
 * @author makejava
 * @since 2024-01-21 10:32:34
 */
public interface AuthUserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param
     * @return 实例对象
     */
    AuthUser queryById(Long id);

    /**
     * 查询指定行数据
     * @return 对象列表
     */
    List<AuthUser> queryAllByLimit(AuthUser authUser);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param authUser 实例对象
     * @return 对象列表
     */
    List<AuthUser> queryAll(AuthUser authUser);

    /**
     * 新增数据
     *
     * @param authUser 实例对象
     * @return 影响行数
     */
    int insert(AuthUser authUser);

    /**
     * 修改数据
     *
     * @param authUser 实例对象
     * @return 影响行数
     */
    int update(AuthUser authUser);

    /**
     * 通过主键删除数据
     *
     * @param
     * @return 影响行数
     */
    int deleteById(Long id);

}