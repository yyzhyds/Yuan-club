package com.zhy.auth.domain.service.Impl;

import cn.dev33.satoken.secure.SaSecureUtil;
import com.zhy.auth.common.enums.AuthUserStatusEnum;
import com.zhy.auth.common.enums.IsDeletedFlagEnum;
import com.zhy.auth.domain.constants.AuthConstant;
import com.zhy.auth.domain.convert.AuthUserBOConverter;
import com.zhy.auth.domain.entity.AuthUserBO;
import com.zhy.auth.domain.service.AuthUserDomainService;
import com.zhy.auth.infra.basic.entity.AuthRole;
import com.zhy.auth.infra.basic.entity.AuthUser;
import com.zhy.auth.infra.basic.entity.AuthUserRole;
import com.zhy.auth.infra.basic.service.AuthRoleService;
import com.zhy.auth.infra.basic.service.AuthUserRoleService;
import com.zhy.auth.infra.basic.service.AuthUserService;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 21/1/2024 上午11:01
 */
@Service
public class AuthUserDomainServiceImpl implements AuthUserDomainService {
    @Resource
    private AuthUserService authUserService;
    @Resource
    private AuthUserRoleService authUserRoleService;
    @Resource
    private AuthRoleService authRoleService;

    private String salt = "yuan_club";

    @Override
    @Transactional(rollbackFor = Exception.class)
    @SneakyThrows
    public boolean register(AuthUserBO authUserBO) {
        AuthUser authUser = AuthUserBOConverter.INSTANCE.convertBOToAuthEntity(authUserBO);
//        HashMap<String, String> keymap = SaSecureUtil.rsaGenerateKeyPair();
//        String publicKey = keymap.get("publicKey");
//        String privateKey = keymap.get("privateKey");
//        authUser.setPassword(SaSecureUtil.rsaEncryptByPublic(publicKey,authUser.getPassword()));
//        String s = SaSecureUtil.rsaDecryptByPrivate(privateKey,authUser.getPassword() );

        authUser.setPassword(SaSecureUtil.md5BySalt(authUser.getPassword(),salt));
        authUser.setStatus(AuthUserStatusEnum.OPEN.getCode());
        authUser.setIsDeleted(IsDeletedFlagEnum.UN_DELETED.getCode());
        Integer count = authUserService.insert(authUser);

        //建立初步的角色关联
        AuthRole authRole = new AuthRole();
        authRole.setRoleKey(AuthConstant.NORMAL_USER);
        AuthRole roleResult = authRoleService.queryByCondition(authRole);
        Long roleId = roleResult.getId();
        Long userId = authUser.getId();
        AuthUserRole authUserRole = new AuthUserRole();
        authUserRole.setRoleId(roleId);
        authUserRole.setUserId(userId);
        authUserRole.setIsDeleted(IsDeletedFlagEnum.UN_DELETED.getCode());
        authUserRoleService.insert(authUserRole);
        return count > 0;
    }

    @Override
    public boolean update(AuthUserBO authUserBO) {
        AuthUser authUser = AuthUserBOConverter.INSTANCE.convertBOToAuthEntity(authUserBO);
        Integer count = authUserService.update(authUser);

        return count > 0;
    }

    @Override
    public boolean delete(AuthUserBO authUserBO) {
        AuthUser authUser = AuthUserBOConverter.INSTANCE.convertBOToAuthEntity(authUserBO);
        authUser.setIsDeleted(IsDeletedFlagEnum.DELETED.getCode());
        return authUserService.update(authUser) > 0;
    }
}
