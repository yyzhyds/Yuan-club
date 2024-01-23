package com.zhy.auth.infra.basic.service;

import com.zhy.auth.infra.basic.entity.AuthRole;
import java.util.List;

/**
 * (AuthRole)表服务接口
 *
 * @author makejava
 * @since 2024-01-21 16:09:38
 */
public interface AuthRoleService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AuthRole queryById(Long id);

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    AuthRole queryAllByLimit(AuthRole authRole);

    /**
     * 新增数据
     *
     * @param authRole 实例对象
     * @return 实例对象
     */
    Integer insert(AuthRole authRole);

    /**
     * 修改数据
     *
     * @param authRole 实例对象
     * @return 实例对象
     */
    Integer update(AuthRole authRole);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    /**
     * 根据条件查询角色
     */
    AuthRole queryByCondition(AuthRole authRole);

    List<AuthRole> queryByRoleList(List<Long> roleIdList);

}