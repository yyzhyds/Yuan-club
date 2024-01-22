package com.zhy.auth.application.controller;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Preconditions;
import com.zhy.auth.application.convert.AuthRolePermissionDTOConverter;
import com.zhy.auth.domain.service.AuthRolePermissionDomainService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhy.auth.application.dto.AuthRolePermissionDTO;
import com.zhy.auth.common.entity.Result;
import com.zhy.auth.domain.entity.AuthRolePermissionBO;


import javax.annotation.Resource;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 22/1/2024 上午11:01
 */

@RestController
@RequestMapping("/rolePermission/")
@Slf4j
public class RolePermissionController {

    @Resource
    private AuthRolePermissionDomainService authRolePermissionDomainService;

    /**
     * 新增角色权限关联关系
     */
    @RequestMapping("add")
    public Result<Boolean> add(@RequestBody AuthRolePermissionDTO authRolePermissionDTO) {
        try {
            if (log.isInfoEnabled()) {
                log.info("RolePermissionController.add.dto:{}", JSON.toJSONString(authRolePermissionDTO));
            }
            Preconditions.checkArgument(!CollectionUtils.isEmpty(authRolePermissionDTO.getPermissionIdList()),"权限关联不能为空");
            Preconditions.checkNotNull(authRolePermissionDTO.getRoleId(),"角色不能为空!");
            AuthRolePermissionBO rolePermissionBO = AuthRolePermissionDTOConverter.INSTANCE.convertDTOToBO(authRolePermissionDTO);
            return Result.ok(authRolePermissionDomainService.add(rolePermissionBO));
        } catch (Exception e) {
            log.error("PermissionController.add.error:{}", e.getMessage(), e);
            return Result.fail("新增角色权限失败");
        }
    }

}

