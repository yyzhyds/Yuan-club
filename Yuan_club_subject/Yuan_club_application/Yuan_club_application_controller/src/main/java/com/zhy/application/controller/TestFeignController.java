package com.zhy.application.controller;

import com.zhy.subject.infra.entity.UserInfo;
import com.zhy.subject.infra.rpc.UserRpc;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: 随缘而愈
 * @date 30/1/2024 下午3:06
 * @description: 刷题分类controller
*/
@RestController
@RequestMapping("/subject/category")
@Slf4j
public class TestFeignController {

    @Resource
    private UserRpc userRpc;

    @GetMapping("testFeign")
    public void testFeign() {
        UserInfo userInfo = userRpc.getUserInfo("jichi");
        log.info("testFeign.userInfo:{}", userInfo);
    }

}
