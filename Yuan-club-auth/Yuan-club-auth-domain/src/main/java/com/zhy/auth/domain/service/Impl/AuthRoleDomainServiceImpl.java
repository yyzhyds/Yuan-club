package com.zhy.auth.domain.service.Impl;

import com.zhy.auth.common.enums.IsDeletedFlagEnum;
import com.zhy.auth.domain.convert.AuthRoleBOConverter;
import com.zhy.auth.domain.entity.AuthRoleBO;
import com.zhy.auth.domain.service.AuthRoleDomainService;
import com.zhy.auth.infra.basic.entity.AuthRole;
import com.zhy.auth.infra.basic.service.AuthRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 21/1/2024 下午4:15
 */
@Service
public class AuthRoleDomainServiceImpl implements AuthRoleDomainService {
    @Resource
    private AuthRoleService authRoleService;

    @Override
    public Boolean add(AuthRoleBO authRoleBO) {
        AuthRole authRole = AuthRoleBOConverter.INSTANCE.convertBOToAuthEntity(authRoleBO);
        authRole.setIsDeleted(IsDeletedFlagEnum.UN_DELETED.getCode());
        System.out.println("authRole = " + authRole);
        Integer count = authRoleService.insert(authRole);
        return count > 0;
    }
    @Override
    public Boolean update(AuthRoleBO authRoleBO) {
        AuthRole authRole = AuthRoleBOConverter.INSTANCE.convertBOToAuthEntity(authRoleBO);
        Integer count = authRoleService.update(authRole);
        return count > 0;
    }

    @Override
    public Boolean delete(AuthRoleBO authRoleBO) {
        AuthRole authRole = new AuthRole();
        authRole.setId(authRoleBO.getId());
        authRole.setIsDeleted(IsDeletedFlagEnum.DELETED.getCode());
        Integer count = authRoleService.update(authRole);
        return count > 0;
    }

}
