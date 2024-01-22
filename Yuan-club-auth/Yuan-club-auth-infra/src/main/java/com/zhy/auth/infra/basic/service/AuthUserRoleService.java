package com.zhy.auth.infra.basic.service;

import com.zhy.auth.infra.basic.entity.AuthRole;
import com.zhy.auth.infra.basic.entity.AuthUserRole;
import java.util.List;

/**
 * (AuthUserRole)表服务接口
 *
 * @author makejava
 * @since 2024-01-22 09:39:33
 */
public interface AuthUserRoleService {

    /**
     * 通过ID查询单条数据
     *
     * @param  id
     * @return 实例对象
     */
    AuthUserRole queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AuthUserRole> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param authUserRole 实例对象
     * @return 实例对象
     */
    AuthUserRole insert(AuthUserRole authUserRole);

    /**
     * 修改数据
     *
     * @param authUserRole 实例对象
     * @return 实例对象
     */
    AuthUserRole update(AuthUserRole authUserRole);

    /**
     * 通过主键删除数据
     *
     * @param  id
     * @return 是否成功
     */
    boolean deleteById(Long id);



}