package com.zhy.auth.domain.service;

import com.zhy.auth.domain.entity.AuthPermissionBO;

import java.util.List;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 22/1/2024 上午10:24
 */

public interface AuthPermissionDomainService {
    Boolean add(AuthPermissionBO authPermissionBO);

    Boolean update(AuthPermissionBO authPermissionBO);

    Boolean delete(AuthPermissionBO authPermissionBO);

    List<String> getPermission(String userName);

}