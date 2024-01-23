package com.zhy.auth.infra.basic.service;

import com.zhy.auth.infra.basic.entity.AuthUser;
import java.util.List;

/**
 * (AuthUser)表服务接口
 *
 * @author makejava
 * @since 2024-01-21 10:36:58
 */
public interface AuthUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param  id
     * @return 实例对象
     */
    AuthUser queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */

    /**
     * 新增数据
     *
     * @param authUser 实例对象
     * @return 实例对象
     */
    Integer insert(AuthUser authUser);

    /**
     * 修改数据
     *
     * @param authUser 实例对象
     * @return 实例对象
     */
    Integer update(AuthUser authUser);

    /**
     * 通过主键删除数据
     *
     * @param  id
     * @return 是否成功
     */
    boolean deleteById(Long id);

    List<AuthUser> queryByCondition(AuthUser authUser);
}