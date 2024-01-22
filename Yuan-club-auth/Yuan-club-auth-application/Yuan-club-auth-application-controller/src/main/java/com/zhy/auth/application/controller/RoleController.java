package com.zhy.auth.application.controller;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Preconditions;
import com.zhy.auth.application.convert.AuthRoleDTOConverter;
import com.zhy.auth.application.dto.AuthRoleDTO;
import com.zhy.auth.domain.entity.AuthRoleBO;
import com.zhy.auth.domain.service.AuthRoleDomainService;
import com.zhy.auth.common.entity.Result;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 21/1/2024 下午4:11
 */
@RestController
@RequestMapping("/role/")
@Slf4j
public class RoleController {
    @Resource
    private AuthRoleDomainService authRoleDomainService;

    /**
     * 新增角色
     */
    @RequestMapping("add")
    public Result<Boolean> add(@RequestBody AuthRoleDTO authRoleDTO) {
        try {
            if (log.isInfoEnabled()) {
                log.info("RoleController.add.dto:{}", JSON.toJSONString(authRoleDTO));
            }
            Preconditions.checkArgument(!StringUtils.isBlank(authRoleDTO.getRoleKey()), "角色key不能为空");
            Preconditions.checkArgument(!StringUtils.isBlank(authRoleDTO.getRoleName()), "角色名称不能为空");
            AuthRoleBO authRoleBO = AuthRoleDTOConverter.INSTANCE.convertDTOToBO(authRoleDTO);

            Boolean add = authRoleDomainService.add(authRoleBO);
            String s = authRoleBO.toString();
            System.out.println("s = " + s);
            return Result.ok(add);
        } catch (Exception e) {
            log.error("UserController.register.error:{}", e.getMessage(), e);
            return Result.fail("新增角色失败");
        }
    }


    /**
     * 修改角色
     */
    @RequestMapping("update")
    public Result<Boolean> update(@RequestBody AuthRoleDTO authRoleDTO) {
        try {
            if (log.isInfoEnabled()) {
                log.info("RoleController.update.dto:{}", JSON.toJSONString(authRoleDTO));
            }
            Preconditions.checkNotNull(authRoleDTO.getId(), "角色id不能为空");
            AuthRoleBO authRoleBO = AuthRoleDTOConverter.INSTANCE.convertDTOToBO(authRoleDTO);
            return Result.ok(authRoleDomainService.update(authRoleBO));
        } catch (Exception e) {
            log.error("RoleController.update.error:{}", e.getMessage(), e);
            return Result.fail("更新角色信息失败");
        }
    }

    /**
     * 删除角色
     */
    @RequestMapping("delete")
    public Result<Boolean> delete(@RequestBody AuthRoleDTO authRoleDTO) {
        try {
            if (log.isInfoEnabled()) {
                log.info("RoleController.delete.dto:{}", JSON.toJSONString(authRoleDTO));
            }
            AuthRoleBO authRoleBO = AuthRoleDTOConverter.INSTANCE.convertDTOToBO(authRoleDTO);
            return Result.ok(authRoleDomainService.delete(authRoleBO));
        } catch (Exception e) {
            log.error("RoleController.delete.error:{}", e.getMessage(), e);
            return Result.fail("删除角色信息失败");
        }
    }

}
