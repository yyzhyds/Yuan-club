package com.zhy.auth.domain.service;

import com.zhy.auth.domain.entity.AuthRoleBO;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 21/1/2024 下午4:14
 */

public interface AuthRoleDomainService {
    Boolean add(AuthRoleBO authRoleBO);

    Boolean update(AuthRoleBO authRoleBO);

    Boolean delete(AuthRoleBO authRoleBO);
}