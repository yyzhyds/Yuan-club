package com.zhy.auth.domain.service;

import cn.dev33.satoken.stp.SaTokenInfo;
import com.zhy.auth.domain.entity.AuthUserBO;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 21/1/2024 上午11:01
 */

public interface AuthUserDomainService {
    boolean register(AuthUserBO authUserBO);

    boolean update(AuthUserBO authUserBO);

    boolean delete(AuthUserBO authUserBO);

    SaTokenInfo doLogin(String validCode);

    AuthUserBO getUserInfo(AuthUserBO authUserBO);
}