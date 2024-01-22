package com.zhy.auth.domain.service.Impl;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import com.zhy.auth.common.enums.IsDeletedFlagEnum;
import com.zhy.auth.domain.convert.AuthPermissionBOConverter;
import com.zhy.auth.domain.entity.AuthPermissionBO;
import com.zhy.auth.domain.redis.RedisUtil;
import com.zhy.auth.domain.service.AuthPermissionDomainService;
import com.zhy.auth.infra.basic.entity.AuthPermission;
import com.zhy.auth.infra.basic.mapper.AuthPermissionDao;
import com.zhy.auth.infra.basic.service.AuthPermissionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 22/1/2024 上午10:24
 */
@Service
@Slf4j

public class AuthPermissionDomainServiceImpl implements AuthPermissionDomainService {
    @Resource
    private RedisUtil redisUtil;
    @Resource
    private AuthPermissionService authPermissionService;

    private String authPermissionPrefix = "auth.permission";

    @Override
    public Boolean add(AuthPermissionBO authPermissionBO) {
        AuthPermission authPermission = AuthPermissionBOConverter.INSTANCE.convertBOToEntity(authPermissionBO);
        authPermission.setIsDeleted(IsDeletedFlagEnum.UN_DELETED.getCode());
        Integer count = authPermissionService.insert(authPermission);
        return count > 0;
    }

    @Override
    public Boolean update(AuthPermissionBO authPermissionBO) {
        AuthPermission authPermission = AuthPermissionBOConverter.INSTANCE.convertBOToEntity(authPermissionBO);
        Integer count = authPermissionService.update(authPermission);
        return count > 0;
    }

    @Override
    public Boolean delete(AuthPermissionBO authPermissionBO) {
        AuthPermission authPermission = new AuthPermission();
        authPermission.setId(authPermissionBO.getId());
        authPermission.setIsDeleted(IsDeletedFlagEnum.DELETED.getCode());
        Integer count = authPermissionService.update(authPermission);
        return count > 0;
    }

    @Override
    public List<String> getPermission(String userName) {
        String permissionKey = redisUtil.buildKey(authPermissionPrefix, userName);
        String permissionValue = redisUtil.get(permissionKey);
        if (StringUtils.isBlank(permissionValue)) {
            return Collections.emptyList();
        }
        List<AuthPermission> permissionList = new Gson().fromJson(permissionValue,
                new TypeToken<List<AuthPermission>>() {
                }.getType());
        List<String> authList = permissionList.stream().map(AuthPermission::getPermissionKey).collect(Collectors.toList());
        return authList;
    }

}
