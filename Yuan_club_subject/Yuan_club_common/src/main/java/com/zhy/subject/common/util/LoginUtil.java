package com.zhy.subject.common.util;


import com.zhy.subject.common.context.LoginContextHolder;

/**
 * 用户登录util
 *
 * @author: 随缘而愈
 * @date: 2023/11/26
 */
public class LoginUtil {

    public static String getLoginId() {
        return LoginContextHolder.getLoginId();
    }


}
