package com.zhy.auth.infra.basic.service;

import com.zhy.auth.infra.basic.entity.AuthPermission;
import java.util.List;

/**
 * (AuthPermission)表服务接口
 *
 * @author makejava
 * @since 2024-01-22 10:20:50
 */
public interface AuthPermissionService {

    List<AuthPermission> queryByRoleList(List<Long> roleIdList);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AuthPermission queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AuthPermission> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param authPermission 实例对象
     * @return 实例对象
     */
    Integer insert(AuthPermission authPermission);

    /**
     * 修改数据
     *
     * @param authPermission 实例对象
     * @return 实例对象
     */
    Integer update(AuthPermission authPermission);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}