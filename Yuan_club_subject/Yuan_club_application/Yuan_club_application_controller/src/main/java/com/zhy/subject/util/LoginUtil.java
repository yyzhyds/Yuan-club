package com.zhy.subject.util;

import com.zhy.subject.application.context.LoginContextHolder;

/**
 * @author Lenovo
 * @version 1.0
 * @description 用户登录
 * @date 28/1/2024 上午9:33
 */

public class LoginUtil {
    public static String getLoginId() {
        return LoginContextHolder.getLoginId();
    }

}
