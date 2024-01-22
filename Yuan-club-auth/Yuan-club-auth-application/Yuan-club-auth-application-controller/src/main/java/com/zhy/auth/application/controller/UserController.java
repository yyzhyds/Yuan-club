package com.zhy.auth.application.controller;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Preconditions;
import com.zhy.auth.application.convert.AuthUserDTOConverter;
import com.zhy.auth.application.dto.AuthUserDTO;
import com.zhy.auth.domain.entity.AuthUserBO;
import com.zhy.auth.domain.service.AuthUserDomainService;
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
 * @date 20/1/2024 下午2:45
 */

@RestController
@RequestMapping("/user/")
@Slf4j
public class UserController {

    @Resource
    private AuthUserDomainService authUserDomainService;


    /**
     * 用户注册
     */
    @RequestMapping("register")
        public Result<Boolean> register(@RequestBody AuthUserDTO authUserDTO){
        try {
            if (log.isInfoEnabled()) {
                log.info("UserController.register.dto:{}", JSON.toJSONString(authUserDTO));
            }
            checkUserInfo(authUserDTO);
            AuthUserBO authUserBO = AuthUserDTOConverter.INSTANCE.convertDTOToBO(authUserDTO);
            return Result.ok(authUserDomainService.register(authUserBO));
        } catch (Exception e) {
            log.error("UserController.register.error:{}", e.getMessage(), e);
            return Result.fail("注册用户失败");
        }
    }


    /**
     * 修改用户信息
     */
    @RequestMapping("update")
    public Result<Boolean> update(@RequestBody AuthUserDTO authUserDTO) {
        try {
            if (log.isInfoEnabled()) {
                log.info("UserController.update.dto:{}", JSON.toJSONString(authUserDTO));
            }
            checkUserInfo(authUserDTO);
            AuthUserBO authUserBO = AuthUserDTOConverter.INSTANCE.convertDTOToBO(authUserDTO);
            return Result.ok(authUserDomainService.update(authUserBO));
        } catch (Exception e) {
            log.error("UserController.update.error:{}", e.getMessage(), e);
            return Result.fail("更新用户信息失败");
        }
    }


    /**
     * 删除用户
     */
    @RequestMapping("delete")
    public Result<Boolean> delete(@RequestBody AuthUserDTO authUserDTO) {
        try {
            if (log.isInfoEnabled()) {
                log.info("UserController.delete.dto:{}", JSON.toJSONString(authUserDTO));
            }
            AuthUserBO authUserBO = AuthUserDTOConverter.INSTANCE.convertDTOToBO(authUserDTO);
            return Result.ok(authUserDomainService.delete(authUserBO));
        } catch (Exception e) {
            log.error("UserController.update.error:{}", e.getMessage(), e);
            return Result.fail("删除用户信息失败");
        }
    }


    /**
     * 用户启用/禁用
     */
    @RequestMapping("changeStatus")
    public Result<Boolean> changeStatus(@RequestBody AuthUserDTO authUserDTO) {
        try {
            if (log.isInfoEnabled()) {
                log.info("UserController.changeStatus.dto:{}", JSON.toJSONString(authUserDTO));
            }
            Preconditions.checkNotNull(authUserDTO.getStatus(), "用户状态不能为空");
            AuthUserBO authUserBO = AuthUserDTOConverter.INSTANCE.convertDTOToBO(authUserDTO);
            return Result.ok(authUserDomainService.update(authUserBO));
        } catch (Exception e) {
            log.error("UserController.changeStatus.error:{}", e.getMessage(), e);
            return Result.fail("启用/禁用用户信息失败");
        }
    }

    private void checkUserInfo(@RequestBody AuthUserDTO authUserDTO) {
        Preconditions.checkArgument(!StringUtils.isBlank(authUserDTO.getUserName()), "用户名不能为空");
    }



}
