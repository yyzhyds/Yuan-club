package com.zhy.subject.application.controller;

import com.zhy.subject.infra.basic.entity.SubjectCategory;
import com.zhy.subject.infra.basic.service.SubjectCategoryService;
import org.omg.PortableInterceptor.SUCCESSFUL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Lenovo
 * @version 1.0
 * @description 刷题controller
 * @date 14/1/2024 下午4:35
 */
@RestController
public class SubjectController {
    @Resource
    private SubjectCategoryService subjectCategoryService;
    @GetMapping("/test")
    public String test(){
        SubjectCategory subjectCategory = subjectCategoryService.queryById(1L);
        String name = subjectCategory.getCategoryName();
        return name;
    }
}
