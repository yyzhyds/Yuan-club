package com.zhy.auth.domain.service.Impl;

import com.zhy.auth.common.enums.IsDeletedFlagEnum;
import com.zhy.auth.domain.entity.AuthRolePermissionBO;
import com.zhy.auth.domain.service.AuthRolePermissionDomainService;
import com.zhy.auth.infra.basic.entity.AuthRolePermission;
import com.zhy.auth.infra.basic.service.AuthRolePermissionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 22/1/2024 上午11:06
 */

@Service
@Slf4j
public class AuthRolePermissionDomainServiceImpl implements AuthRolePermissionDomainService {

    @Resource
    private AuthRolePermissionService authRolePermissionService;

    @Override
    public Boolean add(AuthRolePermissionBO authRolePermissionBO) {
        List<AuthRolePermission> rolePermissionList = new LinkedList<>();
        Long roleId = authRolePermissionBO.getRoleId();
        authRolePermissionBO.getPermissionIdList().forEach(permissionId -> {
            AuthRolePermission authRolePermission = new AuthRolePermission();
            authRolePermission.setRoleId(roleId);
            authRolePermission.setPermissionId(permissionId);
            authRolePermission.setIsDeleted(IsDeletedFlagEnum.UN_DELETED.getCode());
            rolePermissionList.add(authRolePermission);
        });
        int count = authRolePermissionService.batchInsert(rolePermissionList);
        return count > 0;
    }


}

